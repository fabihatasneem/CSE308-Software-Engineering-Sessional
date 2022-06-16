package AccountPack;

public class AccBankAccess {

    public Account createNewFDAccount(String name, double money){
        return new FixedDepositAccount(name, money);
    }

    public Account createNewStudentAccount(String name, double money){
        return new StudentAccount(name, money);
    }

    public Account createNewSavingsAccount(String name, double money){
        return new SavingsAccount(name, money);
    }

    public Account createNewLoanAccount(String name, double money){
        return new LoanAccount(name, money);
    }
}
