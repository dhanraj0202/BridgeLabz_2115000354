class BankAccount{
	static String bankName = "SBI";
	private String accountHolderName;
	final int accountNumber;
	static int totalAccounts;	
	static void getTotalAccounts(){
		System.out.println("Total Accounts: " + totalAccounts);
	}
	
	BankAccount(String accountHolderName, int accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		totalAccounts++;
	}
	
	void displayBankAccount(){
		if(this instanceof BankAccount){
			System.out.println("Bank Name: " + bankName);
			System.out.println("Account Holder Name: " + accountHolderName);
			System.out.println("Account Number: " + accountNumber);
		}
	}
}
public class BankAccountSystem{
	public static void main(String[] args){
		BankAccount account1 = new BankAccount("Dhanraj", 2115000354);
		account1.displayBankAccount();
		BankAccount.getTotalAccounts();
	}
}