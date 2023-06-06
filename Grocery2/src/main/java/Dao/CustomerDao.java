package Dao;

import java.util.List;

import pojo.Customer;

public interface CustomerDao {
	boolean addCustomer(Customer c);
	boolean updateCustomerById(Customer cs);
	boolean deleteCustomerById(String EmailId);
	List<Customer>getAllCustomer();
	Customer searchCustomerById(String EmailId);

}
/*public boolean addCustomer(Customer c);
	
	public boolean updateCustomer(String username,String password);
	
	public boolean CustomerLogin(String username,String password);
	
	public boolean deletecustomer(String password);
	
	public void ShowallCustomer();	*/