package Dao;

import java.util.List;

import pojo.Product;

public interface ProductDao {
	boolean addFood(Product p);
	boolean updateFoodById(int pid);
	boolean deleteFoodById(int pid);
	List<Product> ShowAll();
	 Product searchFoodById(int pid);
	 List<Product>  searchProduct(String Pname);
	 public List<Product> showProductBycategory(String category); 
}
/*public boolean addProduct(Product p);
	
	public boolean updateProduct(int pid);
	
	public boolean deleteProduct(int pid);
	
	public List<Product> showallproduct();
	
	public Product showBiId(int pid);
	
	public boolean qty(String pname,int qty);
	
	public boolean addqty(String pname,int qty);
	
	public Product showByname(String pname );
	
	public List<Product> showProductBycategory(String category);*/