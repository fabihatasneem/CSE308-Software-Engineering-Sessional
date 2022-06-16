package AccountPack;

import BankPack.Bank;

class StudentAccount extends Account {

    Bank bank = Bank.getInstance();
    private final double withdrawalLimit = 10000;

    public StudentAccount(String name, double amount) {
        super(name, amount);
        this.type = "Student";
        maximumLoan = 1000;
    }

    @Override
    public void deposit(double depositAmount) {
        amount += depositAmount;
        bank.setFund(bank.getFund() + depositAmount);
        System.out.println(depositAmount + "$ deposited; current balance " + amount + "$");
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        Bank bank = Bank.getInstance();
        if (withdrawalAmount < withdrawalLimit && amount >= withdrawalAmount) {
            amount -= withdrawalAmount;
            bank.setFund(bank.getFund() - withdrawalAmount);
            System.out.println(withdrawalAmount + "$ withdrew; current balance " + amount + "$");
        } else {
            System.out.println("Invalid Transaction. Current balance " + amount + "$.");
        }
    }

    @Override
    public void requestLoan(double loanAmount) {
        if (loan + loanAmount <= maximumLoan) {
            loanRequestAmount += loanAmount;
            System.out.println("Loan request successful, sent for approval.");
        } else {
            System.out.println("You cannot take any more loan.");
        }
    }

}
