package lab_8;

public class Account {
	
	private int account_no;
	private double balance;
	private String customer, account_type;
	
	public Account(int acc_no,String acc_type,float balance,String customer) {
		account_no = acc_no;
		this.balance= balance;
		this.customer = customer;
		account_type = acc_type;
	}
	
	public int getAccountNumber() {
		return account_no;
		}
	
	public String getAccountType() {
		return account_type;
	}
	public double getBalance() {
		return balance;
	}
	public String getCustomer() {
		return customer;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		balance-=amount;
	}
	public double calculateInterest() {
		return balance * 0.5;
	}


}
