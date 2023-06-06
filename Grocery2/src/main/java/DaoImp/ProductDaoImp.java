package DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DButility.DataConnect;
import Dao.ProductDao;
import pojo.Order;
import pojo.Product;

public class ProductDaoImp implements ProductDao{
	
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Statement stm=null;
	String sql=null;
	int row;
	List<Product> product=null;
	Product p;

	@Override
	public boolean addFood(Product p) {
		con=DataConnect.getConnection();
		sql="insert into Product (pname,category,price,qty) values(?,?,?,?)";
		try
		{
	
		ps=con.prepareStatement(sql);
		ps.setNString(1,p.getPname());
		ps.setString(2, p.getCategory());
		ps.setDouble(3, p.getPrice());
		ps.setInt(4,p.getQty());
		System.out.println(p.getPname()+""+p.getCategory()+""+p.getPrice()+""+p.getQty());
		int i=ps.executeUpdate();
		if(i>0)
		{
			return true;
		}
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return false;
	}

	


	@Override
	public boolean updateFoodById(int pid) {
		return false;
	}
	
	
	@Override
	public boolean deleteFoodById(int foodId) {
		try {
			con=DataConnect.getConnection();
			ps=con.prepareStatement("delete from Product where pId=?");
			ps.setInt(1,foodId);
			row=ps.executeUpdate();
			if(row>0) {
				return true;
			}else {
				return false;
			}
		}catch(SQLException s) {
			s.printStackTrace();
		}
			
		return false;
	}

	@Override
	public List<Product> ShowAll() {

		List<Product>l=new ArrayList<>();
		try {
			con=DataConnect.getConnection();
			ps=con.prepareStatement("Select * from Product");
			rs=ps.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt("pId"));
				p.setPname(rs.getString("pname"));
				p.setCategory(rs.getString("category"));
				p.setQty(rs.getInt("qty"));
				p.setPrice(rs.getFloat("price"));
				System.out.format("%d\t%27s\t%15s\t%22.2f\t%15d\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));				
				l.add(p);
			}
		}catch(SQLException s) {
			s.printStackTrace();
		}
		return l;
		
	}

	@Override
	public List<Product> searchProduct(String Pname) {
		con=DataConnect.getConnection();
		sql="select* from product where pname=?";
		try
		{
			ps=con.prepareStatement(sql);
			ps.setString(1, Pname);
			rs=ps.executeQuery();
			
			product = new ArrayList<Product>();
			while(rs.next())
			{
				p=new Product();
				p.setPid(rs.getInt("pId"));
				p.setPname(rs.getString("pname"));
				p.setCategory(rs.getString("category"));
				p.setQty(rs.getInt("qty"));
				p.setPrice(rs.getFloat("price"));
				System.out.format("%d\t%27s\t%15s\t%22.2f\t%15d\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));	
			
				product.add(p);
				System.out.println(product);
			}
			return product;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}


	@Override
	public Product searchFoodById(int pid) {
		// TODO Auto-generated method stub
		try {
			con=DataConnect.getConnection();
			ps=con.prepareStatement("select * from Product where pid=?");
			ps.setInt(1, pid);
			rs=ps.executeQuery();
			if(rs.next()) {
				p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setPname(rs.getString("pname"));
				p.setCategory(rs.getString("category"));
				p.setQty(rs.getInt("qty"));
				p.setPrice(rs.getFloat("price"));
			}
		}catch(SQLException s) {
			s.printStackTrace();
		}
		return p;
	}




	@Override
	public List<Product> showProductBycategory(String category) {
		// TODO Auto-generated method stub
		con=DataConnect.getConnection();
		sql = "select * from product where category = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, category);
			
			rs = ps.executeQuery();
			
			product = new ArrayList<Product>();
			System.out.format("-----------------------------------------------------------------------------------------------------------------------");
	        System.out.print("\nProduct ID \t\tProductName\t\t\tCategory\t\tPrice\t\tQuantity\n");
	        System.out.format("------------------------------------------------------------------------------------------------------------------------\n");
	        
			while(rs.next()) {
				
				p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setPname(rs.getString("pname"));
				p.setCategory(rs.getString("category"));
				p.setQty(rs.getInt("qty"));
				p.setPrice(rs.getFloat("price"));
				System.out.format("%d\t%27s\t%15s\t%22.2f\t%15d\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));
		        System.out.format("----------------------------------------------------------------------------------------------------------------------\n");
		        
				product.add(p);
				System.out.println(p);
			}
			return product;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
