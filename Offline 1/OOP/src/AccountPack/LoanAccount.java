package AccountPack;

import BankPack.Bank;

class LoanAccount extends Account {

    Bank bank = Bank.getInstance();

    public LoanAccount(String name, double loan) {
        super(name, 0);
        type = "Loan";
        this.loan = loan;
    }

    @Override
    public void deposit(double depositAmount) {
        if(depositAmount > loan){
            amount = depositAmount - loan;
            loan = 0;
            bank.setFund(bank.getFund() + depositAmount);
            System.out.println("You have repaid your full loan. " + amount + "$ is returned.");
        }
        else{
            loan -= depositAmount;
            System.out.println(depositAmount + "$ deposited; current loan " + loan + "$");
        }
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        System.out.println("You cannot withdraw any more amount.");
    }

    @Override
    public void requestLoan(double loanAmount) {
        if(loan * 0.05 >= loanAmount){
            loanRequestAmount += loanAmount;
            System.out.println("Loan request successful, sent for approval.");
        }
        else{
            System.out.println("Loan request unsuccessful.");
        }
    }

    @Override
    public void yearIncrement(double accountInterestRate, double interestRate){
        double loanIncrement = loan * interestRate;
        loan += loanIncrement;
    }

    @Override
    public void queryDeposit(){
        System.out.println("Current Loan " + loan + "$.");
    }

}
