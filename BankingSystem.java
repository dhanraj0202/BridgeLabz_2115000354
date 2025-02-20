import java.util.*;

public class BankingSystem{
	private Map<Integer, Double> accounts = new HashMap<>();
	private Queue<Integer> withdrawalQueue = new LinkedList<>();

	public void addAccount(int accountNumber, double balance){
		accounts.put(accountNumber, balance);
	}

	public void withdraw(int accountNumber, double amount){
		if(accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount){
			withdrawalQueue.offer(accountNumber);
		}
		else{
			System.out.println("Insufficient balance or invalid account: " + accountNumber);
		}
	}

	public void processWithdrawals(){
		while (!withdrawalQueue.isEmpty()){
			int accountNumber = withdrawalQueue.poll();
			double amount = 100;
			accounts.put(accountNumber, accounts.get(accountNumber) - amount);
			System.out.println("Processed withdrawal of " + amount + " from Account " + accountNumber);
		}
	}

	public void displaySortedByBalance(){
		TreeMap<Integer, Double> sortedAccounts = new TreeMap<>(Comparator.comparing(accounts::get));
		sortedAccounts.putAll(accounts);
		System.out.println("Accounts Sorted by Balance: " + sortedAccounts);
	}

	public static void main(String[] args){
		BankingSystem bank = new BankingSystem();
		bank.addAccount(101, 5000.00);
		bank.addAccount(102, 1500.00);
		bank.addAccount(103, 3000.00);

		bank.withdraw(101, 100);
		bank.withdraw(102, 100);

		bank.processWithdrawals();
		bank.displaySortedByBalance();
	}
}