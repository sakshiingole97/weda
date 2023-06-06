package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;
import DaoImp.*;
import pojo.Cart;

/**
 * Servlet implementation class Cart
 */
public class CartS extends HttpServlet {
	private static final long serialVersionUID = 1L;
    CartDaoImp cd=new CartDaoImp();
    Cart c;
    /**
     * @param tprice 
     * @param price 
     * @param email 
     * @param name 
     * @param quan 
     * @param fid 
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String action=request.getParameter("action");
		if(action!=null && action.equals("delete")) {
			int cartId=Integer.parseInt(request.getParameter("cartId"));
			boolean b=cd.deleteCart(cartId);
			if(b) {
				response.sendRedirect("Cc");
			}else {
				response.sendRedirect("Failed.jsp");
			}
		}
		else
		{
			String emailId=(String)session.getAttribute("uEmail");
			List<Cart>l=cd.showCart(emailId);
			if(l!=null) {
			   session.setAttribute("clist", l);
			   response.sendRedirect("Cartlist.jsp");
			}else {
				response.sendRedirect("Failed.jsp");
			}
			
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if(action!=null) {
			String name=request.getParameter("fname");
			String email=request.getParameter("username");
			int quan=Integer.parseInt(request.getParameter("quan"));
			int fid=Integer.parseInt(request.getParameter("fid"));
			float price=Float.parseFloat(request.getParameter("price"));
			System.out.println(price);
			c=new Cart();
			c.setPid(fid);
			c.setProductname(name);
			c.setQty(quan);
			c.setPrice(price);
			c.setUsername(email);
			
			boolean b=cd.addCart(c);
			if(b) {
				response.sendRedirect("Foodlist.jsp");
			}else {
				response.sendRedirect("Failed.jsp");
			}
			
		}	}

}
