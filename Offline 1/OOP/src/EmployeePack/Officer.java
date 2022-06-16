package EmployeePack;

import AccountPack.Account;
import BankPack.Bank;

class Officer extends Employee {

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
    public void changeInterest(String accountType, double interestRate) {
        System.out.println("You don’t have permission for this operation.");
    }

    @Override
    public void seeInternalFund() {
        System.out.println("You don’t have permission for this operation.");
    }

}
