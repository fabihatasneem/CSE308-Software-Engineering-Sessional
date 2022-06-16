package EmployeePack;

import AccountPack.Account;
import BankPack.Bank;

class ManagingDirector extends Employee {

    @Override
    public void approve(){
        Bank bank = Bank.getInstance();
        for(Account a : bank.getBankAccounts().values()) {
            if(a.getLoanRequestAmount() != 0) {
                a.setLoan(a.getLoan() + a.getLoanRequestAmount());
                a.setAmount(a.getAmount() + a.getLoanRequestAmount());
                bank.setFund(bank.getFund() - a.getLoanRequestAmount());
                a.setLoanRequestAmount(0);
                System.out.println("Loan for " + a.getName() + " approved.");
            }
        }
    }

    @Override
    public void changeInterest(String accountType, double interestRate){
        Bank bank = Bank.getInstance();
        if(accountType.equals("Savings")) {
            bank.setSavingsInterestRate(interestRate);
        }
        else if(accountType.equals("Student")) {
            bank.setStudentInterestRate(interestRate);
        }
        else if(accountType.equals("Fixed-Deposit")) {
            bank.setFixedDepositInterestRate(interestRate);
        }
        else if(accountType.equals("Loan")) {
            bank.setLoanInterestRate(interestRate);
        }
        System.out.println("Interest rate changed for account type: " + accountType + ", new rate: " + interestRate + "%.");
    }

    @Override
    public void seeInternalFund(){
        Bank bank = Bank.getInstance();
        System.out.println("Internal fund is " + bank.getFund() + "$.");
    }
}
