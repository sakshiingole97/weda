package DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DButility.DataConnect;
import Dao.CartHistroyDao;
import pojo.Order;

public class CartHistory implements CartHistroyDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Statement stm = null;
	String sql = null;
	Order o;
	List<Order> order=null;

	@Override
	public boolean Orderhistory(Order o) {
		// TODO Auto-generated method stub
		con = DataConnect.getConnection();
		sql = "insert into cartorder(cid, pname, price, quantity, billAmount, dropLocation,contact,username) values ( ?, ?, ?, ?, ?, ?,?,?)";

		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, o.getCid());
			ps.setInt(2, o.getOid());
			ps.setString(3, o.getPname());
			ps.setDouble(4, o.getPrice());
			ps.setInt(5, o.getQty());
			ps.setDouble(6, o.getBillAmount());
			ps.setString(7, o.getAddress());
			ps.setString(8, o.getContact());
			ps.setString(9, o.getUsername());

			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Order> showOrder(String username) {
		// TODO Auto-generated method stub
		sql = "select * from cartorder where username=?";

		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();

			order = new ArrayList<Order>();
			System.out.format(
					"-----------------------------------------------------------------------------------------------------------------------------------");
			System.out
					.print("\nID\tOrder ID\tProduct Name\t\tPrice\t\tQuantity\tAddress\t\tContact\t\tTotal Amount\t\n");
			System.out.format(
					"-----------------------------------------------------------------------------------------------------------------------------------\n");

			while (rs.next()) {

				o = new Order();
				System.out.format("%d\t%d\t%15s\t%23.4f\t%9d\t%14s\t%18d\t%10.2f\n", rs.getInt("cid"), rs.getInt("oid"),
						rs.getString("pname"), rs.getDouble("price"), rs.getInt("quantity"),
						rs.getString("DropLocation"), rs.getLong("Contact"), rs.getDouble("billAmount"));
				System.out.format(
						"-----------------------------------------------------------------------------------------------------------------------------------\n");

				order.add(o);

			}

			return order;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
