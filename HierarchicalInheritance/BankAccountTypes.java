class BankAccount{
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount{
    private double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount{
    private int maturityPeriod;

    FixedDepositAccount(int accountNumber, double balance, int maturityPeriod){
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

public class BankAccountTypes{
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(111111, 5000, 3.5);
        CheckingAccount checking = new CheckingAccount(222222, 2000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount(333333, 10000, 12);

        savings.displayAccountInfo();
        System.out.println();
        checking.displayAccountInfo();
        System.out.println();
        fixedDeposit.displayAccountInfo();
    }
}
