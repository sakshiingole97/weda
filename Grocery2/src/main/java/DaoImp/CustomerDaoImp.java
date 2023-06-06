package DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DButility.DataConnect;
import Dao.CustomerDao;
import pojo.Customer;

public class CustomerDaoImp implements CustomerDao {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Statement stm = null;
	String sql = null;
	Customer cs;
	List<Customer> customer = null;
	int row;

	@Override
	public boolean addCustomer(Customer cs) {
		con = DataConnect.getConnection();
		sql = "insert into customer1(name,username,address,Emailid,contact,PassWord) values(?,?,?,?,?,?)";

		try {

			ps = con.prepareStatement(sql);

			ps.setString(1, cs.getName());
			ps.setString(2, cs.getUserName());
			ps.setString(3, cs.getAddress());
			ps.setString(4, cs.getEmailId());
			ps.setString(5, cs.getContactNo());
			ps.setString(6, cs.getPassword());

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
	public boolean updateCustomerById(Customer cs) {
		con = DataConnect.getConnection();
		sql = "update customer1 set name=?,address=?,Emailid=?,contact=? where username=?";
		try {
			ps = con.prepareStatement(sql);

			ps.setString(1, cs.getName());
			ps.setString(2, cs.getAddress());
			ps.setString(3, cs.getEmailId());
			ps.setString(4, cs.getContactNo());
			ps.setString(5, cs.getUserName());

			System.out.println(cs.getName() + "" + cs.getAddress() + "" + cs.getEmailId() + "" + cs.getAddress() + ""
					+ cs.getUserName());
			int i = ps.executeUpdate();
			System.out.println("I" + i);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public boolean deleteCustomerById(String EmailId) {
		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("delete from customer1 where username=?");
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

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> l = new ArrayList<>();
		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("select * from customer1");
			rs = ps.executeQuery();
			while (rs.next()) {
				Customer cs = new Customer();
				cs.setName(rs.getString(2));
				cs.setEmailId(rs.getString(5));
				cs.setAddress(rs.getString(4));
				cs.setContactNo(rs.getString(6));

				l.add(cs);
				System.out.println(l);
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return l;
	}

	@Override
	public Customer searchCustomerById(String EmailId) {
		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("select * from customer1 where username=?");
			ps.setString(1, EmailId);
			rs = ps.executeQuery();
			if (rs.next()) {
				cs = new Customer();
				cs.setName(rs.getString(2));
				cs.setEmailId(rs.getString(5));
				cs.setAddress(rs.getString(4));
				cs.setContactNo(rs.getString(6));
				cs.setUserName(rs.getString(3));
				System.out.println("hello" + cs);

			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return cs;
	}

}
