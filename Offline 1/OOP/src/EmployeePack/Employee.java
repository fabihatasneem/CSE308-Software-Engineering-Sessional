package EmployeePack;

import AccountPack.Account;
import BankPack.*;

public abstract class Employee {
    public String type;

    public void lookUp(String name){
        Bank bank = Bank.getInstance();
        for(Account a : bank.getBankAccounts().values()){
            if(a.getName().equals(name) && !a.getType().equals("Loan")) {
                System.out.println(name + "'s current balance " + a.getAmount() + "$");
            }
            else{
                System.out.println(name + "'s loan " + a.getLoan() + "$");
            }
        }
    }

    public abstract void approve();

    public abstract void changeInterest(String accountType, double interestRate);

    public abstract void seeInternalFund();

}
