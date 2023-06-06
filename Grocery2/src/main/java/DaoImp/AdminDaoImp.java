package DaoImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DButility.DataConnect;
import Dao.AdminDao;

public class AdminDaoImp implements AdminDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Statement stm = null;
	String sql = null;
	int row;

	@Override
	public boolean adminLogin(String aEmailId, String aPassword) {
		try {
			con = DataConnect.getConnection();
			String sql = "select * from Admin142";

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				if (rs.getString(1).equals(aEmailId) && rs.getString(2).equals(aPassword)) {
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}

	@Override
	public boolean adminChangePassword(String aEmailId, String aPassword) {
		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("update Admin142 set aPassword=? where aEmailId=?");
			ps.setString(1, aPassword);
			ps.setString(2, aEmailId);
			row = ps.executeUpdate();
			if (row > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean userLogin(String cEmailId, String cPassword) {
		try {
			con = DataConnect.getConnection();
			String sql = "select * from customer1";

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getString(3) + "" + rs.getString(7));

				if (rs.getString(3).equals(cEmailId) && rs.getString(7).equals(cPassword)) {
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public boolean userChangePassword(String cEmailId, String cPassword) {
		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("update Customer142 set cPassword=? where cEmailId=?");
			ps.setString(1, cPassword);
			ps.setString(2, cEmailId);
			row = ps.executeUpdate();
			if (row > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return false;
	}

}
