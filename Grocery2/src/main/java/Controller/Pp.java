package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Product;

import java.io.IOException;
import java.util.List;

import DaoImp.ProductDaoImp;

/**
 * Servlet implementation class Pp
 */
public class Pp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDaoImp fd = new ProductDaoImp();
	Product p;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String action = request.getParameter("action");
		if (action != null && action.equals("delete")) {
			int foodId = Integer.parseInt(request.getParameter("foodId"));
			boolean b = fd.deleteFoodById(foodId);
			if (b) {
				response.sendRedirect("food");
			} else {
				response.sendRedirect("Failed.jsp");
			}
		}
		else if (action != null && action.equals("Search"))
		{
			String Pname = request.getParameter("pname");
			List<Product> l1 = fd.searchProduct(Pname);
			if(l1!=null)
			{
				session.setAttribute("flist", l1);
				response.sendRedirect("Sproduct.jsp");
			} else {
				response.sendRedirect("Failed.jsp");
			}
		}
		else if (action != null && action.equals("cat"))
		{
			String cat = request.getParameter("cat1");
			List<Product> l1 = fd.showProductBycategory(cat);
			if(l1!=null)
			{
				session.setAttribute("flist", l1);
				response.sendRedirect("Catagory.jsp");
			} else {
				response.sendRedirect("Failed.jsp");
			}
		}
		else {
			List<Product> l = fd.ShowAll();
			if (l != null) {
				session.setAttribute("flist", l);
				response.sendRedirect("Foodlist.jsp");
			} else {
				response.sendRedirect("Failed.jsp");
			}

		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		String name = request.getParameter("fname");
		String Category = request.getParameter("ftype");
		int quan = Integer.parseInt(request.getParameter("fquan"));
		float price = Float.parseFloat(request.getParameter("fprice"));
		System.out.println(name+""+Category+""+quan+""+price);
		if (action != null && action.equals("Add")) {
			p = new Product();
			p.setPname(name);
			p.setCategory(Category);
			p.setPrice(price);
			p.setQty(quan);
			boolean b = fd.addFood(p);
			if (b == true) {
				response.sendRedirect("Product.jsp");

			} else {
				response.sendRedirect("Failed.jsp");

			}
		}
	}

}
