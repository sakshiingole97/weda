package Dao;

import java.util.List;
import pojo.Order;

public interface OrderDao {
	 boolean placeOrder (Order o);
	List<Order>showOrder();
	List<Order> ShowOrderByUsername(String username);
	}
/*public boolean placeOrder (Order o);
	public boolean cancelOrder(int oid);
	public List<Order> showOrder(String username);
	public List<Order> showOrderByUsername(String username);
	public boolean Orderhistory(Order o);*/