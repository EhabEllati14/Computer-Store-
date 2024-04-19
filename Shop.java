
public class Shop {
	private String shopname;
	private String phonenum;
	private String address;
	
	public Shop(String shopname, String phonenum, String address) {
		this.shopname = shopname;
		this.phonenum = phonenum;
		this.address = address;
	}
	public String getShopname() {
		return shopname;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public String getAddress() {
		return address;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
