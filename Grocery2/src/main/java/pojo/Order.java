package pojo;

public class Order {
	private int cid,oid,qty;
	private String username,address,status, pname,droplocation;
	private double billAmount,price;
	private String Odate,contact;
	
	
	


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public Order(int cid, int qty, String username, String pname,
			double billAmount, double price) {
		super();
		this.cid = cid;
		this.qty = qty;
		this.username = username;
		this.pname = pname;
		this.billAmount = billAmount;
		this.price = price;
	}





	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public int getOid() {
		return oid;
	}


	public void setOid(int oid) {
		this.oid = oid;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getDroplocation() {
		return droplocation;
	}


	public void setDroplocation(String droplocation) {
		this.droplocation = droplocation;
	}


	public double getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getOdate() {
		return Odate;
	}


	public void setOdate(String odate) {
		Odate = odate;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Order [ oid=" + oid + ", username=" + username + ", billAmount="
				+ billAmount + ", Odate=" + Odate + "]";
	}
	
	
}
