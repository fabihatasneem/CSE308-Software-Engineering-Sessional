package EmployeePack;

class Cashier extends Employee {

    @Override
    public void approve() {
        System.out.println("You don’t have permission for this operation.");
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
