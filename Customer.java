
public class Customer {
	private String name;
	private String address;
	private String custid;
	private String Phonenum;
	private String password;
	
	public Customer(String name, String address, String custid, String phonenum, String password) {
		this.name = name;
		this.address = address;
		this.custid = custid;
		this.Phonenum = phonenum;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getCustid() {
		return custid;
	}
	public String getPhonenum() {
		return Phonenum;
	}
	public String getPassword() {
		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public void setPhonenum(String phonenum) {
		Phonenum = phonenum;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
