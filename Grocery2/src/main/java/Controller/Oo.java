package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Cart;
import pojo.Customer;
import pojo.Order;

import java.io.IOException;
import java.util.List;

import DaoImp.CartDaoImp;
import DaoImp.OrderDaoImp;

/**
 * Servlet implementation class Oo
 */
public class Oo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OrderDaoImp od = new OrderDaoImp();
	CartDaoImp cd = new CartDaoImp();
	List<Cart> cart = null;
	List<Order> order = null;

	Order o;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Oo() {
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
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		double billAmount = 0;
		String name = null, a = null, o3 = null, u = null;
		double p1 = 0, ba = 0;
		int q1 = 0, id1 = 0, id2 = 0;
		String co = null;
		cart = cd.showCartByUserName(username);
		for (Cart c1 : cart) {
			billAmount += c1.getPrice() * c1.getQty();
			p1 = c1.getPrice();
			q1 = c1.getQty();
			id1 = c1.getCid();
			name = c1.getProductname();
		}
		System.out.println(name + " " + p1 + " " + q1 + " " + id1);

		String action = request.getParameter("action");
		if (action != null && action.equals("Add")) {
			o = new Order();
			o.setCid(id1);
			//o.setContact(co);
			o.setPname(name);
			o.setQty(q1);
			o.setPrice(p1);
			o.setUsername(username);
			o.setBillAmount(billAmount);
			//o.setAddress(a);
			boolean b = od.placeOrder(o);
			if (b == true) {
				List<Order> o1 = od.ShowOrderByUsername(username);
				if (o1 != null) {
					session.setAttribute("order", o1);
					response.sendRedirect("Billing.jsp");
				} else {
					response.sendRedirect("Failed.jsp");
				}

			} else {
				response.sendRedirect("Failed.jsp");
			}
		} else {
			List<Order> l = od.showOrder();
			if (l != null) {
				session.setAttribute("order", l);
				response.sendRedirect("Billing.jsp");
			} else {
				response.sendRedirect("Failed.jsp");
			}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
