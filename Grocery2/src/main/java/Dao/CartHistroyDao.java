package Dao;

import java.util.List;

import pojo.Order;

public interface CartHistroyDao {
	boolean Orderhistory(Order o);
	List<Order> showOrder(String username);

}
