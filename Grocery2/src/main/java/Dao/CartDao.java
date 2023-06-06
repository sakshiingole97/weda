package Dao;

import java.util.List;

import pojo.Cart;

public interface CartDao {
	boolean addCart(Cart c);
	List<Cart>showCart(String EmailId);
	boolean deleteCart(int cartId);
	boolean clearCart(String EmailId);
	
}
/*public boolean addtoCart(Cart s);
	
	public boolean updateCart(String pname,int qty);
	
	public boolean deleteCart(String pname);
	
	public boolean clearcart(String username);
	
	public Cart showCartById(int cid);
	
	public Cart showCartBypname(String pname);
	
	public List<Cart> showCartByUserName(String username);
	
	public List<Cart> show(String username);*/