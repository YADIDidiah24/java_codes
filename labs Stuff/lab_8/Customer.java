package lab_8;
import java.util.ArrayList; 


public class Customer extends Account {

	private int customer_ID;
	private String customer_name, address;
	ArrayList<Integer> accounts= new ArrayList<Integer>(); 
	
	public Customer(int acc_no,String acc_type,float balance,String customer,int ID,String name, String address) {
		super(acc_no,acc_type, balance,customer);
		customer_ID = ID;
		customer_name = name;
		this.address = address;
		}

	public int getCustomerID() {
		return customer_ID;
		}
	public String getName() {
		return customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void addAccount(int account) {
		accounts.add(account);
	}
	public void removeAccount(int account) {
		accounts.remove(account);
	}
	public void viewAccounts() {
		for(int i : accounts){
		    System.out.println("account: "+i);}
	}
	
	}


