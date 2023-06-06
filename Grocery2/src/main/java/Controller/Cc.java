package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Cart;

import java.io.IOException;
import java.util.List;

import DaoImp.CartDaoImp;

/**
 * Servlet implementation class Cc
 */
public class Cc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 CartDaoImp cd=new CartDaoImp();
	    Cart c;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cc() {
        super();
        // TODO Auto-generated constructor stub
    }

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
				response.sendRedirect("Cartlist.jsp");
			}else {
				response.sendRedirect("Failed.jsp");
			}
		}
		else
		{
			String emailId=(String)session.getAttribute("uEmail");
			List<Cart>l=cd.showCart(emailId);
			if(l!=null && !(l.isEmpty())) {
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
			c=new Cart();
			c.setPid(fid);
			c.setProductname(name);
			c.setQty(quan);
			c.setPrice(price);
			c.setUsername(email);
			
			boolean b=cd.addCart(c);
			if(b==true) {
				response.sendRedirect("Foodlist.jsp");
			}else {
				response.sendRedirect("Failed.jsp");
			}
			
		}	}

}
