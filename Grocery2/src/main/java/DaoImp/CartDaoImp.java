package DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DButility.DataConnect;
import Dao.CartDao;
import pojo.Cart;

public class CartDaoImp implements CartDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Statement stm = null;
	String sql = null;
	List<Cart> cart = null;
	Cart c = null;
	int row;

	@Override
	public boolean addCart(Cart c) {
		con = DataConnect.getConnection();
		sql = "insert into cart (pid,price,qty,username,pname) values(?,?,?,?,?)";
		try {

			ps = con.prepareStatement(sql);

			ps.setInt(1, c.getPid());
			ps.setDouble(2, c.getPrice());
			ps.setInt(3, c.getQty());
			ps.setString(4, c.getUsername());
			ps.setString(5, c.getProductname());

			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}

	@Override
	public List<Cart> showCart(String EmailId) {
		List<Cart> l = new ArrayList<>();
		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("select * from cart where username=?");
			ps.setString(1, EmailId);
			rs = ps.executeQuery();
			while (rs.next()) {
				Cart c = new Cart();
				System.out.println(rs.getInt("cid") + "" + rs.getString("username") + "" + rs.getDouble("price") + ""
						+ rs.getString("pname") + "" + rs.getInt("pid") + "" + rs.getInt("qty"));
				c.setCid(rs.getInt("cid"));
				c.setUsername(rs.getString("username"));
				c.setPrice(rs.getDouble("price"));
				c.setProductname(rs.getString("pname"));
				c.setPid(rs.getInt("pid"));
				c.setQty(rs.getInt("qty"));

				l.add(c);
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return l;
	}

	@Override
	public boolean deleteCart(int cartId) {
		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("delete from cart where cid=?");
			ps.setInt(1, cartId);
			row = ps.executeUpdate();
			if (row > 0) {
				return true;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean clearCart(String EmailId) {
		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("delete from Cart142 where emailId=?");
			ps.setString(1, EmailId);
			row = ps.executeUpdate();
			if (row > 0) {
				return true;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return false;
	}

	public List<Cart> showCartByUserName(String username) {
		con = DataConnect.getConnection();
		sql = "select* from cart where username=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();

			cart = new ArrayList<Cart>();
			System.out.format(
					"-----------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("\nProduct ID\tProductName\tPrice\t\tQuantity\n");
			System.out.format(
					"-----------------------------------------------------------------------------------------------------------------------------------\n");

			while (rs.next()) {
				c = new Cart();

				c.setCid(rs.getInt("cid"));
				c.setUsername(rs.getString("username"));
				c.setPrice(rs.getDouble("price"));
				c.setProductname(rs.getString("pname"));
				c.setPid(rs.getInt("pid"));
				c.setQty(rs.getInt("qty"));
				System.out.format(rs.getInt(1) + "\t\t" + rs.getString(6) + "\t\t" + rs.getDouble(3) + "\t\t  "
						+ rs.getInt(4) + "\n");
				System.out.format(
						"-----------------------------------------------------------------------------------------------------------------------------------\n");

				cart.add(c);

			}
			return cart;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
