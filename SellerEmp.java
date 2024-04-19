
public class SellerEmp {

	private String sellid;
	private int empage;
	private String empemail;
	private String empphone;
	private String empaddress;
	private String empgender;
	private String shopname;
	private String empname;
	
	public SellerEmp(String sellid,String empname, int empage, String empemail, String empphone, String empaddress, String empgender,String shopname) {
		super();
		this.sellid = sellid;
		this.empage = empage;
		this.empemail = empemail;
		this.empphone = empphone;
		this.empaddress = empaddress;
		this.empgender = empgender;
		this.shopname=shopname;
		this.empname=empname;
	}

	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public String getShopname() {
		return shopname;
	}


	public void setShopname(String shopname) {
		this.shopname = shopname;
	}


	public String getSellid() {
		return sellid;
	}

	public int getEmpage() {
		return empage;
	}

	public String getEmpemail() {
		return empemail;
	}

	public String getEmpphone() {
		return empphone;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public String getEmpgender() {
		return empgender;
	}

	public void setSellid(String sellid) {
		this.sellid = sellid;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public void setEmpphone(String empphone) {
		this.empphone = empphone;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public void setEmpgender(String empgender) {
		this.empgender = empgender;
	}
	
	

	
	
	
	
}
