package AccountPack;

public abstract class Account {
    protected String name;
    protected double amount;
    protected String type;
    protected double loan = 0;
    protected double loanRequestAmount = 0;
    protected int maturity = 0;
    protected double maximumLoan = 0;

    public Account(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public abstract void deposit(double depositAmount);

    public abstract void withdraw(double withdrawalAmount);

    public abstract void requestLoan(double loanAmount);

    public void yearIncrement(double accountInterestRate, double interestRate){
        double deductionPerYear = loan * interestRate + 500;
        amount = amount * (1 + accountInterestRate);
        amount -= deductionPerYear;
    }

    public void queryDeposit(){
        System.out.print("Current Balance " + amount + "$");
        if(loan > 0){
            System.out.println(", loan " + loan + "$");
        }else{
            System.out.println();
        }
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public double getLoan() {
        return loan;
    }

    public double getLoanRequestAmount() {
        return loanRequestAmount;
    }

    public int getMaturity() {
        return maturity;
    }

    public void setMaturity(int maturity) {
        this.maturity = maturity;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public void setLoanRequestAmount(double loanRequestAmount) {
        this.loanRequestAmount = loanRequestAmount;
    }
}
