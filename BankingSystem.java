import java.util.ArrayList;
import java.util.List;

abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(holderName + " deposited " + amount + ". New Balance: " + balance);
        }
		else{
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(holderName + " withdrew " + amount + ". New Balance: " + balance);
        }
		else{
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public abstract double calculateInterest();

    public void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Calculated Interest: " + calculateInterest());
    }

    public double getBalance(){
		return balance;
	}
}

interface Loanable{
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable{
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance){
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest(){
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount){
        if(calculateLoanEligibility()){
            System.out.println("Loan of " + amount + " approved for Savings Account.");
        }
		else{
            System.out.println("Loan denied. Insufficient balance for eligibility.");
        }
    }

    @Override
    public boolean calculateLoanEligibility(){
        return getBalance() > 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable{
    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance){
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest(){
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount){
        if(calculateLoanEligibility()){
            System.out.println("Loan of " + amount + " approved for Current Account.");
        }
		else{
            System.out.println("Loan denied. Insufficient balance for eligibility.");
        }
    }

    @Override
    public boolean calculateLoanEligibility(){
        return getBalance() > 10000;
    }
}

public class BankingSystem{
    public static void main(String[] args){
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount acc1 = new SavingsAccount("001", "Dhanraj", 7000);
        CurrentAccount acc2 = new CurrentAccount("002", "Ankit", 12000);

        accounts.add(acc1);
        accounts.add(acc2);

        for(BankAccount account : accounts){
            account.displayAccountDetails();
            System.out.println();
        }

        acc1.deposit(1000);
        acc2.withdraw(5000);

        acc1.applyForLoan(5000);
        acc2.applyForLoan(12000);
    }
}