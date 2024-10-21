package entities;

public class Customer implements Comparable<Customer> {
	
	public interface customer {

	}
	public int compareTo(Customer cust) {
		if(this.getAccount().getBalance() < cust.getAccount().getBalance()) {
			return -1;			
		} if(this.getAccount().getBalance() > cust.getAccount().getBalance()) {
			return 1;
		}
		return 0;
	}

	private String id;
	private String FirstName;
	private String LastName;
	private String Email;
	private long PhoneNo;
	private static int customerCount;
	private Address Address;
	private BankAccount Account;
	
	/*
	 * private String HouseNo; private String HouseName; private String StreetName;
	 * private String Locality; private String Dist; private String Pin; private
	 * String State;
	 */

	
	public Customer() {
		
		customerCount++;
		id = "Acc" + customerCount;
		FirstName = "Jashu";
		LastName = "Priya";
		Email = "jashupriya@gmail.com";
		PhoneNo = 9876543210l;
		this.Address = new Address("2-21", "RRK nilayam", "Canara Nagar", "P & T Colony", "Telanagana", 500098);
		this.Account = new BankAccount();
	}
	
	public Customer(String FirstName, String LastName, String Email, long PhoneNo,Address Address, BankAccount account) 
	{
		customerCount++;
		id = "Acc" + customerCount;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.PhoneNo = PhoneNo;
		this.Address = Address;
		this.Account = Account;
		
	}
	
	public BankAccount getAccount() {	
		return Account;
	}
	
	public Address getAddress() {
		return Address;
	}
	
	public void setAddress(Address Address) {
		Address = Address;
	}
	
	public String getId() {
		return id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}
	

	public void setEmail(String email) {
		this.Email = email;
	}

	public long getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.PhoneNo = phoneNo;
	}

	public static int customerCount() {
		return customerCount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", PhoneNo=" + PhoneNo + ", Address=" + Address + ", Account=" + Account + "]";
	}

	
	
	
	


}
