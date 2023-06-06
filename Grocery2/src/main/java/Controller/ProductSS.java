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
 * Servlet implementation class Foods
 */
public class ProductSS extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDaoImp fd = new ProductDaoImp();
	Product p;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductSS() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		HttpSession session = request.getSession();
//		String action = request.getParameter("action");
//		if (action != null && action.equals("delete")) {
//			int foodId = Integer.parseInt(request.getParameter("foodId"));
//			boolean b = fd.deleteFoodById(foodId);
//			if (b) {
//				response.sendRedirect("food");
//			} else {
//				response.sendRedirect("Failed.jsp");
//			}
//		} else {
//			List<Product> l = fd.ShowAll();
//			if (l != null && !(l.isEmpty())) {
//				session.setAttribute("flist", l);
//				response.sendRedirect("Foodlist.jsp");
//			} else {
//				response.sendRedirect("Failed.jsp");
//			}
//
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

//			if (action != null && action.equals("UpdateFood")) {
//				p = new Product();
//				p.setPname(name);
//				p.setCategory(Category);
//				p.setPrice(price);
//				p.setQty(quan);
//				boolean b1 = fd.updateFoodById(p);
//				if (b1) {
//					response.sendRedirect("Success.jsp");
//				} else {
//					response.sendRedirect("Failed.jsp");
//				}
//			}
//		}
//	}
