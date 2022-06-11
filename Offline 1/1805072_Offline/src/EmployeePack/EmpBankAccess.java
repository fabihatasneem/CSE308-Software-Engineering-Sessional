package EmployeePack;

public class EmpBankAccess {

    public Employee createNewMD(){
        return new ManagingDirector();
    }

    public Employee createNewOfficer(){
        return new Officer();
    }

    public Employee createNewCashier(){
        return new Cashier();
    }

}
