package om.infogain.bean;

public class Product {

	private int pId;
	private String pname;
	private String price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pId, String pname, String price) {
		super();
		this.pId = pId;
		this.pname = pname;
		this.price = price;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pname=" + pname + ", price=" + price + "]";
	}	
}
