package pojo;

public class Customer {
	private String Name;
	private String EmailId;
	private String Password;
	private String Address;
	private String ContactNo;
	private String UserName;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String name, String emailId, String password, String address, String contactNo, String userName) {
		super();
		Name = name;
		EmailId = emailId;
		Password = password;
		Address = address;
		ContactNo = contactNo;
		UserName = userName;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmailId() {
		return EmailId;
	}


	public void setEmailId(String emailId) {
		EmailId = emailId;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getContactNo() {
		return ContactNo;
	}


	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", EmailId=" + EmailId + ", Password=" + Password + ", Address=" + Address
				+ ", ContactNo=" + ContactNo + ", UserName=" + UserName + "]";
	}
	
	

}
