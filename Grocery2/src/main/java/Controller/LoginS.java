package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import DaoImp.AdminDaoImp;

/**
 * Servlet implementation class LoginS
 */
public class LoginS extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminDaoImp ad=new AdminDaoImp();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		session.invalidate();
		response.sendRedirect("index.jsp");	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 HttpSession session=request.getSession();
		 String action=request.getParameter("action");
		 String type=request.getParameter("type");
		 String email=request.getParameter("username");
		 String pass=request.getParameter("pass");
		 
		 if(action!=null ) {
			 
			 if(type.equals("admin")) {
				 boolean b=ad.adminLogin(email, pass);
				 if(b) {
					 session.setAttribute("aEmail",email);
					 response.sendRedirect("index.jsp");
				 }else {
					 response.sendRedirect("Failed.jsp");
				 }
			 }
			 
			 if(type.equals("user")) {
				 boolean b=ad.userLogin(email, pass);
				 if(b) {
					 session.setAttribute("uEmail",email);
					 response.sendRedirect("index.jsp");
				 }else {
					 response.sendRedirect("Failed.jsp");
				 }
			 }
		 }
//		 if(action!=null)
//		 {
//			 String npass=request.getParameter("cpass");
//			 
//			 if(type.equals("admin")) {
//				 boolean b=ad.adminChangePassword(email, npass);
//				 if(b) {
//					 response.sendRedirect("Success.jsp");
//				 }else {
//					 response.sendRedirect("Failed.jsp");
//				 }
//			 }
//			 
//			 if(type.equals("user")) {
//				  boolean b=ad.userChangePassword(email, npass);
//				 if(b) {
//					 response.sendRedirect("Success.jsp");
//				 }else {
//					 response.sendRedirect("Failed.jsp");
//				 }
//			 }
		// }
	}		

}
