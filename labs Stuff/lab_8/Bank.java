package lab_8;

import java.util.ArrayList;

public class Bank extends Customer{
	
	private String bankname;
	ArrayList<String> customers= new ArrayList<String>();
	
	public Bank(int acc_no,String acc_type,float balance,String customer,int ID,String name, String address,String bankname) {
		super(acc_no, acc_type, balance, customer,ID, name, address);
		this.bankname=bankname;
	}
	public String getBankname() {
		return bankname;
	}
	
	public void addCustomer(String customer) {
		customers.add(customer);
	}
	public void removeCustomer(String customer) {
		customers.remove(customer);
	}
	public void viewCustomer() {
		for(String name : customers){
		    System.out.println("coustomer: "+name);}
	}
}
