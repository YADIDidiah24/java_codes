package lab_8;

public class Demo {

	public static void main(String[] args) {
		Bank b = new Bank(123,"normal",0,"yadi",1,"yadidiah","Nowhere","AnyBank");
		
		System.out.println(b.getAccountNumber());
		System.out.println(b.getAccountType());
		System.out.println(b.getAddress());
		
		System.out.println("balance is: "+b.getBalance());
		b.deposit(99999999999.9);
		System.out.println("balance is"+b.getBalance());
		
		System.out.println(b.getCustomer());
		System.out.println(b.getCustomerID());
		System.out.println(b.getName());
		System.out.println(b.calculateInterest());
		System.out.println(b.getAccountNumber());
		b.addAccount(234);
		b.addCustomer("Someone");
		
		b.viewAccounts();
		b.viewCustomer();
		
		

	}

}
