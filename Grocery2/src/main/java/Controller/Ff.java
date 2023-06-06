package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.FeedBack;

import java.io.IOException;
import java.util.List;

import DaoImp.FeedbackDaoImp;

/**
 * Servlet implementation class Ff
 */
public class Ff extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FeedbackDaoImp fd=new FeedbackDaoImp();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ff() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		List<FeedBack>l=fd.getAllFeedback();
		if(l!=null && !(l.isEmpty())) {
			session.setAttribute("fdlist", l);
			response.sendRedirect("Feedbacklist.jsp");
		}else {
			response.sendRedirect("Failed.jsp");
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if(action!=null && action.equals("AddFeedBack")) {
			String name=request.getParameter("cname");
			String email=request.getParameter("email");
			String review=request.getParameter("review");
			int rank=Integer.parseInt(request.getParameter("rank"));
			String sug=request.getParameter("sug");
			
			boolean b=fd.addFeedback(new FeedBack(name, email, review, rank, sug));
			if(b) {
				response.sendRedirect("Success.jsp");
			}else {
				response.sendRedirect("Failed.jsp");
			}
			
		}	}

}
