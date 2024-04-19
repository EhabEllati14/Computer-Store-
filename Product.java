
public class Product {
	private int pid;
	private String pname;
	private int price;
	private int stockQuantity;
	private String description;
	public Product(int pid, String pname, int price, int stockQuantity, String description) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.description = description;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", stockQuantity=" + stockQuantity
		        + ", description=" + description + "]";
	}

	
}
