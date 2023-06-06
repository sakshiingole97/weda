package DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import DButility.DataConnect;
import Dao.OrderDao;
import pojo.Cart;
import pojo.Order;
import pojo.Product;

public class OrderDaoImp implements OrderDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Statement stm = null;
	String sql = null;
	Order o;
	List<Order> order = null;

	int row;

	@Override
	public boolean placeOrder(Order o) {
		String Odate = new Date().toString();
		float totalprice = 0;
		con = DataConnect.getConnection();
		sql = "insert into cartorder(cid, pname, price, quantity, billAmount, dropLocation,contact,username,odate) values (?,?, ?, ?, ?, ?, ?,?,?)";

		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, o.getCid());
			ps.setString(2, o.getPname());
			ps.setDouble(3, o.getPrice());
			ps.setInt(4, o.getQty());
			ps.setDouble(5, o.getBillAmount());
			ps.setString(6, o.getAddress());
			ps.setString(7, o.getContact());
			ps.setString(8, o.getUsername());
			ps.setString(9, Odate);
			System.out.println(o.getCid());
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

	public List<Order> showOrder() {
		order = new ArrayList<Order>();
		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("select * from or2er");
			rs = ps.executeQuery();
			while (rs.next()) {
				Order o = new Order();
				o.setOid(rs.getInt("oid"));
				o.setUsername(rs.getString("username"));
				o.setBillAmount(rs.getDouble("bill"));
				o.setOdate(rs.getString("Odate"));
				order.add(o);
			}
			return order;

		} catch (SQLException s) {
			s.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order> ShowOrderByUsername(String username) {
		con = DataConnect.getConnection();
		sql = "select * from cartorder where username=?";

		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();

			order = new ArrayList<Order>();
			
			while (rs.next()) {

				o = new Order();
				o.setCid(rs.getInt(1));
				o.setPname(rs.getString(2));
				o.setPrice(rs.getDouble(3));
				o.setQty(rs.getInt(4));
				o.setBillAmount(rs.getDouble(5));
				o.setDroplocation(rs.getString(6));
				o.setContact(rs.getString(7));
				o.setOdate(rs.getString(9));
				
				
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
/*
 * @Override public boolean cancelOrder(int oid) { // TODO Auto-generated method
 * stub Scanner sc=new Scanner(System.in); con=JdbcConnection.getConnection();
 * try { ps=con.prepareStatement("update place set status=? where orderid=?");
 * String s="Canceled"; ps.setString(1, s); ps.setInt(2,oid);
 * 
 * int i=ps.executeUpdate(); return true; } catch(Exception e) {
 * System.out.println(e); } return false; }
 */

/*
 * cart =simpl.show(username); order =oimpl.showOrderByUsername(username);
 * String name = null,a = null; double p1 = 0,ba = 0; int q1 = 0,id1 = 0,id2 =
 * 0; long co = 0; LocalDateTime o3 = null; for(Cart c1:cart) {
 * p1=c1.getPrice(); q1=c1.getQty(); id1=c1.getCid(); name=c1.getProductname();
 * // System.out.println(name+" "+p1+" "+q1+" "+id1); for(Order o2:order) {
 * ba=o2.getBillAmount(); id2=o2.getOid(); a=o2.getAddress();
 * co=o2.getContact();
 * 
 * // System.out.println(ba+" "+id2+" "+a+" "+co); } o=new Order();
 * o.setCid(id1); o.setOid(id2); o.setContact(co); o.setPname(name);
 * o.setQty(q1); o.setPrice(p1); o.setUsername(username); o.setBillAmount(ba);
 * o.setAddress(a); o.setOrderDateTime(o3); oimpl.Orderhistory(o); }
 * simpl.clearcart(username); oimpl.showOrder(username);
 */
