package BankPack;

import AccountPack.*;
import EmployeePack.*;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    private static Bank bank;
    private static HashMap<String, Account> bankAccounts;
    private static HashMap<String, Employee> employeeList;
    private static int clock;
    private double fund;
    private double savingsInterestRate;
    private double studentInterestRate;
    private double fixedDepositInterestRate;
    private double loanInterestRate;
    private final double interestRate = 0.1;
    private static final EmpBankAccess empBankAccess = new EmpBankAccess();
    private static final AccBankAccess accBankAccess = new AccBankAccess();

    private Bank(){
        employeeList = new HashMap<>();
        Employee md = empBankAccess.createNewMD();
        md.type = "MD";
        employeeList.put("MD", md);

        for(int i = 1; i <= 2; i++){
            Employee e = empBankAccess.createNewOfficer();
            e.type = "Officer";
            employeeList.put("S" + i, e);
        }

        for(int i = 1; i <= 5; i++){
            Employee c = empBankAccess.createNewCashier();
            c.type = "Cashier";
            employeeList.put("C" + i, c);
        }

        bankAccounts = new HashMap<>();
        clock = 0;
        fund = 1000000;
        savingsInterestRate = 0.1;
        studentInterestRate = 0.05;
        fixedDepositInterestRate = 0.15;
        loanInterestRate = 0;

        System.out.println("Bank Created. MD, S1, S2, C1, C2, C3, C4, C5 created.");
    }

    public void setSavingsInterestRate(double savingsInterestRate) {
        this.savingsInterestRate = savingsInterestRate;
    }

    public void setStudentInterestRate(double studentInterestRate) {
        this.studentInterestRate = studentInterestRate;
    }

    public void setFixedDepositInterestRate(double fixedDepositInterestRate) {
        this.fixedDepositInterestRate = fixedDepositInterestRate;
    }

    public void setLoanInterestRate(double loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }

    public HashMap<String, Account> getBankAccounts() {
        return bankAccounts;
    }

    public HashMap<String, Employee> getEmployeeList() {
        return employeeList;
    }

    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    public int getClock() {
        return clock;
    }

    public void increaseClock(){
        clock += 1;
        System.out.println("1 year passed.");
        for(Account ac : bankAccounts.values()){
            fund -= ac.getAmount();
            if(ac.getType().equals("Fixed-Deposit")){
                ac.yearIncrement(fixedDepositInterestRate, interestRate);
            }
            else if(ac.getType().equals("Student")){
                ac.yearIncrement(studentInterestRate, interestRate);
            }
            else if(ac.getType().equals("Savings")){
                ac.yearIncrement(savingsInterestRate, interestRate);
            }
            else if(ac.getType().equals("Loan")){
                ac.yearIncrement(loanInterestRate, interestRate);
            }
            fund += ac.getAmount();
        }
    }

    public static Bank getInstance(){
        return bank;
    }

    public static void run(){
        bank = new Bank();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String inputText = sc.nextLine();
            String[] splitText = inputText.split(" ");
            boolean accountCreatedNow = false;
            if (splitText[0].equals("Create")) {
                int money = Integer.parseInt(splitText[3]);
                String name = splitText[1];

                if (splitText[2].equals("Fixed-Deposit")) {
                    if (money >= 100000) {
                        Account ac = accBankAccess.createNewFDAccount(name, money);
                        bank.setFund(bank.getFund() + money);
                        bank.getBankAccounts().put(name, ac);
                        accountCreatedNow = true;
                        System.out.println(splitText[2] + " account for " + name + " created; initial balance " + money + "$");
                    } else {
                        System.out.println("Account not created. Not Sufficient Amount.");
                    }
                } else if (splitText[2].equals("Student")) {
                    Account ac = accBankAccess.createNewStudentAccount(name, money);
                    bank.setFund(bank.getFund() + money);
                    bank.getBankAccounts().put(name, ac);
                    accountCreatedNow = true;
                    System.out.println(splitText[2] + " account for " + name + " created; initial balance " + money + "$");
                } else if (splitText[2].equals("Savings")) {
                    Account ac = accBankAccess.createNewSavingsAccount(name, money);
                    bank.setFund(bank.getFund() + money);
                    bank.getBankAccounts().put(name, ac);
                    accountCreatedNow = true;
                    System.out.println(splitText[2] + " account for " + name + " created; initial balance " + money + "$");
                } else if (splitText[2].equals("Loan")) {
                    Account ac = accBankAccess.createNewLoanAccount(name, money);
                    bank.setFund(bank.getFund() - money);
                    bank.getBankAccounts().put(name, ac);
                    accountCreatedNow = true;
                    System.out.println(splitText[2] + " account for " + name + " created; initial balance " + money + "$");
                }
            }
            if (splitText[0].equals("Open") || accountCreatedNow) {
                Account ac = null;
                Employee e;
                String eName = splitText[1];
                if (bank.getEmployeeList().containsKey(eName)) {
                    e = bank.getEmployeeList().get(eName);
                    System.out.print(eName + " active. ");
                    if(!e.type.equals("Cashier")) {
                        for (Account a : bank.getBankAccounts().values()) {
                            if (a.getLoanRequestAmount() > 0) {
                                System.out.println("Loan requests pending.");
                                break;
                            }
                        }
                    }
                    while (sc.hasNextLine()) {
                        inputText = sc.nextLine();
                        splitText = inputText.split(" ");

                        if (splitText[0].equals("Lookup")) {
                            e.lookUp(splitText[1]);
                        }
                        else if (splitText[0].equals("Approve")) {
                            e.approve();
                        }
                        else if (splitText[0].equals("Change")) {
                            double intRate = Double.parseDouble(splitText[2]);
                            e.changeInterest(splitText[1], intRate);
                        }
                        else if (splitText[0].equals("See")) {
                            e.seeInternalFund();
                        }
                        else if (splitText[0].equals("Close")) {
                            System.out.println("Operations for " + eName + " closed.");
                            break;
                        }
                        else {
                            System.out.println("Invalid Command.");
                        }
                    }
                } else {
                    boolean flag = false;
                    if (bank.getBankAccounts().containsKey(splitText[1])) {
                        ac = bank.getBankAccounts().get(splitText[1]);
                        if(!accountCreatedNow) {
                            System.out.println("Welcome Back " + ac.getName() + ".");
                        }
                        flag = true;
                    }
                    while (sc.hasNextLine() && flag) {
                        inputText = sc.nextLine();
                        splitText = inputText.split(" ");

                        if (splitText[0].equals("Deposit")) {
                            int money = Integer.parseInt(splitText[1]);
                            ac.deposit(money);
                        } else if (splitText[0].equals("Withdraw")) {
                            int money = Integer.parseInt(splitText[1]);
                            ac.withdraw(money);
                        } else if (splitText[0].equals("Query")) {
                            ac.queryDeposit();
                        } else if (splitText[0].equals("Request")) {
                            int money = Integer.parseInt(splitText[1]);
                            ac.requestLoan(money);
                        } else if (splitText[0].equals("Close")) {
                            System.out.println("Transaction closed for " + ac.getName() +".");
                            flag = false;
                        } else {
                            System.out.println("Invalid Command.");
                        }
                    }
                }
            }
            else if (splitText[0].equals("INC")) {
                bank.increaseClock();
            } else {
                System.out.println("Invalid Command.");
            }
        }
    }
}
