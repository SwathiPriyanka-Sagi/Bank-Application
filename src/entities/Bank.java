package entities;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Customer> customers;
	
	public Bank()
	{
	  customers = new ArrayList<Customer>();
	}
	public ArrayList<Customer> getCustomers()
	{
		return customers;
	}
	public void addCustomer(Customer c)
	{
		customers.add(c);
	}
	public void printCustomers()
	{
		for(int i = 0 ; i <= customers.size()-1 ; i++)
		{
			System.out.println(customers.get(i));
		}
	}

}
	

