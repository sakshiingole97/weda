package pojo;

public class Cart {
 
	private int cid,pid,qty;
	Product p;
	private String productname,username;
	private double price, total;
	
	
	
	public Cart(int pid, int qty, String productname, String username, double price) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.productname = productname;
		this.username = username;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", pid=" + pid + ", qty=" + qty + ", p=" + p + ", productname=" + productname
				+ ", username=" + username + ", price=" + price + ", total=" + total + "]";
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}
