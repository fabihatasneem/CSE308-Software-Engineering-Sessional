package AccountPack;

import BankPack.Bank;

class FixedDepositAccount extends Account {

    Bank bank = Bank.getInstance();
    private final double minimumDeposit = 50000;

    public FixedDepositAccount(String name, double amount) {
        super(name, amount);
        type = "Fixed-Deposit";
        maximumLoan = 100000;
    }

    @Override
    public void deposit(double depositAmount) {
        if(depositAmount < minimumDeposit){
            System.out.println("Insufficient Amount. You must deposit at least 50,000$.");
        }else{
            amount += depositAmount;
            bank.setFund(bank.getFund() + depositAmount);
            System.out.println(depositAmount + "$ deposited; current balance " + amount + "$");
        }
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        Bank bank = Bank.getInstance();
        if(amount < withdrawalAmount || maturity < 1){
            System.out.println("Invalid Transaction. Current balance " + amount + "$.");
        }
        else {
            amount -= withdrawalAmount;
            bank.setFund(bank.getFund() - withdrawalAmount);
            System.out.println(withdrawalAmount + "$ withdrew; current balance " + amount + "$");
        }
    }

    @Override
    public void requestLoan(double loanAmount) {
        if(loan + loanAmount <= maximumLoan){
            loanRequestAmount += loanAmount;
            System.out.println("Loan request successful, sent for approval.");
        }
        else{
            System.out.println("You cannot take any more loan.");
        }
    }

}
