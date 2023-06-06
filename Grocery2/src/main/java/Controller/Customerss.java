package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Customer;

import java.io.IOException;
import java.util.List;

import DaoImp.CustomerDaoImp;

/**
 * Servlet implementation class Customerss
 */
public class Customerss extends HttpServlet  {
	private static final long serialVersionUID = 1L;
    CustomerDaoImp cd=new CustomerDaoImp();
    Customer cs;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customerss() {
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
			String emailId=request.getParameter("emailId");
			boolean b=cd.deleteCustomerById(emailId);
			if(b) {
				response.sendRedirect("customer");
			}else {
				response.sendRedirect("Failed.jsp");
			}
		}
		else
		{
			List<Customer>l=cd.getAllCustomer();
			if(l!=null) {
			   session.setAttribute("cslist", l);
			   response.sendRedirect("Customerlist.jsp");
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
		String name=request.getParameter("cname");
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String adr=request.getParameter("adr");
		String con=request.getParameter("cNo");
		System.out.println(name+""+ email+""+pass+""+adr+""+con);
		if(action!=null && action.equals("AddCustomer")) {
			cs=new Customer();
			cs.setName(name);
			cs.setEmailId(email);
			cs.setAddress(adr);
			cs.setContactNo(con);
			cs.setPassword(pass);
			cs.setUserName(username);
			boolean b=cd.addCustomer(cs);
			if(b==true) {
				response.sendRedirect("Success.jsp");
			}else {
				response.sendRedirect("Failed.jsp");
			}
		}	
	if(action!=null && action.equals("UpdateCustomer")) {
		cs=new Customer();
		cs.setName(name);
		cs.setEmailId(email);
		cs.setAddress(adr);
		cs.setContactNo(con);
		boolean b=cd.updateCustomerById(cs);
		if(b==true) {
			response.sendRedirect("Success.jsp");
		}else {
			response.sendRedirect("Failed.jsp");
		}
	
	}	

}

}
