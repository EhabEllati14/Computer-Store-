
public class RepEmp {
	private String repid;
	private int empage;
	private String empemail;
	private String empphone;
	private String empaddress;
	private String empgender;
	private String shopname;
	private String empname;
	
	public RepEmp(String repid,String empname, int empage, String empemail, String empphone, String empaddress, String empgender,String shopname) {
		super();
		this.repid = repid;
		this.empage = empage;
		this.empemail = empemail;
		this.empphone = empphone;
		this.empaddress = empaddress;
		this.empgender = empgender;
		this.shopname=shopname;
		this.empname=empname;
	}

	public String getRepid() {
		return repid;
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

	public String getShopname() {
		return shopname;
	}

	public String getEmpname() {
		return empname;
	}

	public void setRepid(String repid) {
		this.repid = repid;
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

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	

}
