import java.util.ArrayList;
import java.util.List;

class Bank{
    private String name;
    private List<Account> accounts;

    public Bank(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public Account openAccount(Customer customer, double initialBalance){
        Account account = new Account(this, customer, initialBalance);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }

    public String getName(){
        return name;
    }
}

class Customer{
    private String name;
    private List<Account> accounts;

    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void viewBalance(){
        for(Account account : accounts){
            System.out.println("Bank: " + account.getBank().getName() + ", Balance: " + account.getBalance());
        }
    }
}

class Account{
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance){
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public Bank getBank(){
        return bank;
    }
}

public class BankAndAccountHolders{
    public static void main(String[] args){
        Bank bank1 = new Bank("SBI");
        Bank bank2 = new Bank("PNB");

        Customer customer1 = new Customer("Dhanraj");
        Customer customer2 = new Customer("Deepak");

        bank1.openAccount(customer1, 1000);
        bank2.openAccount(customer1, 1500);
        bank1.openAccount(customer2, 2000);

        System.out.println("Dhanraj's Accounts:");
        customer1.viewBalance();

        System.out.println("Deepak's Accounts:");
        customer2.viewBalance();
    }
}
