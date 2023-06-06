package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Cart;
import pojo.Order;

import java.io.IOException;
import java.util.List;

import DaoImp.CartDaoImp;
import DaoImp.CartHistory;
import DaoImp.OrderDaoImp;

/**
 * Servlet implementation class Hh
 */
public class Hh extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OrderDaoImp od = new OrderDaoImp();
	CartDaoImp cd = new CartDaoImp();
	CartHistory ch = new CartHistory();
	Order o = null;
	List<Cart> cart = null;
	List<Order> order = null;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hh() {
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
		String name = null, a = null, o3 = null,u=null;
		
		double p1 = 0, ba = 0;
		int q1 = 0, id1 = 0, id2 = 0;
		String co = null;

		for (Cart c1 : cart) {
			p1 = c1.getPrice();
			q1 = c1.getQty();
			id1 = c1.getCid();
			name = c1.getProductname();
			u=c1.getUsername();
			System.out.println(name + " " + p1 + " " + q1 + " " + id1);
			for (Order o2 : order) {
				ba = o2.getBillAmount();
				id2 = o2.getOid();
				a = o2.getAddress();
				co = o2.getContact();

				System.out.println(ba + " " + id2 + " " + a + " " + co);
			}
			if (action != null) {
				o = new Order();
				o.setCid(id1);
				o.setOid(id2);
				o.setContact(co);
				o.setPname(name);
				o.setQty(q1);
				o.setPrice(p1);
				o.setUsername(u);
				o.setBillAmount(ba);
				o.setAddress(a);
				o.setOdate(o3);
				boolean b = ch.Orderhistory(o);	}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
