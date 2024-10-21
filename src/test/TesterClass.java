package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import entities.Address;
import entities.Bank;
import entities.BankAccount;
import entities.Customer;

public class TesterClass {

	public static void main(String[] args) {
		
		//Address A1 = new Address("Swathi","Priyanka","2-12","MSP","Vittal","Uppal","Rangareddy","54678","Telangana");
		
	//	System.out.println(A1);
	//	System.out.println(FirstName);
		//String Address = "Swathi, Priyanka, 2-12, MSP, Vittal, Uppal, Rangareddy, 54678, Telangana";
		//int index = Address.indexOf(",");
		//System.out.println(Address);
		
		/*Customer c1 = new Customer();
		System.out.println(c1.getFirstName());
		System.out.println(c1.getLastName());
		System.out.println(c1.getEmail());
		System.out.println(c1.getPhoneNo());
		//System.out.println(c1.getAddress());
		
				
		String Address = "Swathi, Priyanka, 2-12, MSP, Vittal, Uppal, Rangareddy, 54678, Telangana";
		int index1 = Address.indexOf(", ");
		//int index1 = Address.indexOf(", ");
		int index2 = Address.indexOf(", ",index1+2);
		int index3 = Address.indexOf(", ",index2+3);
		int index4 = Address.indexOf(", ",index3+20);
		int index5 = Address.indexOf(",", index4+20);
		
		System.out.println(Address.substring(0,index2+1));
		System.out.println(Address.substring(index2,index3+1));
		System.out.println(Address.substring(index3,index4+1));
		System.out.println(Address.substring(index4,index5+12));*/
		
		/*String inputs = "A Game, A Process, A Work, A Subset";
		int index1 = inputs.indexOf(",");
		System.out.println(inputs);
		int index2 = inputs.indexOf(",",index1+2);
		int index3 = inputs.indexOf(",",index2+3);
		int index4 = inputs.indexOf(",");
		
		System.out.println(inputs.substring(0, index1));
		//System.out.println(inputs.substring(index1+1));
		
		System.out.println(inputs.substring(index1+2,index2));
		System.out.println(inputs.substring(index2+2,index3));
		//System.out.println(inputs.substring(index3+2));
		System.out.println(inputs.substring(index3+1));
		//System.out.println(inputs.substring(index2+1));*/
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Mani", "Swathi", "maniswathi@gmail.com", 75436799L, 
				new Address("2-21", "RRK nilayam", "Canara Nagar", "P & T Colony", "Telanagana", 500098), 
				new BankAccount())); 

		System.out.println("Before Sorting by balance");
		//For each loop: can be used with arrays or Collections
		for(Customer c : customers) {
			System.out.println(c);
		}
		
		Collections.sort(customers);
		System.out.print("After Sorting by balance: " );
		for(Customer c : customers) {
			System.out.println(c);
		}
		Collections.sort(customers, Comparator.reverseOrder());
		for(Customer c : customers) {
			System.out.println(c);
		}
		
		Bank b11 = new Bank();
		while(true) {
		System.out.println("MyBank Menu");
		System.out.println("1. Add Customer");
		System.out.println("2. Print All Customers");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("0. Exit");
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		
		int menuChoice = sc.nextInt();
		if (menuChoice == 1) {
			System.out.println("Adding Customer");
			Customer c1 = new Customer();
			b11.addCustomer(c1);
		}
		if(menuChoice == 2) {
			System.out.println("Printing All Customers");
			b11.printCustomers();
		}
		if(menuChoice == 3) {
			System.out.println("Deposting");
		}
		if(menuChoice == 4) {
			System.out.println("Withdraw");
		}
	

//		if (menuChoice == 0) {

//			System.out.println("Exit");

//		}
		if (menuChoice == 0) {
			System.exit(0);
		}

		Scanner sc1 = new Scanner(System.in);
		//Bank Deposite Arraylist
		//enter custId
		//amount - deposite
		//call deposite
		//check custid untey exist or not exist
		ArrayList<String> BankDeposite = new ArrayList<String>();
		System.out.println("Enter CustomerID: ");
		
		
		
		}
		
		
		
		
	}
}

