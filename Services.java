
public class Services {
	private String custid;
	private String serialnum;
	private String repid;
	
	
	public Services(String custid,String repid,String serialnum) {
		super();
		this.custid = custid;
		this.serialnum = serialnum;
		this.repid = repid;
	}
	public String getCustid() {
		return custid;
	}
	public String getSerialnum() {
		return serialnum;
	}
	public String getRepid() {
		return repid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}
	public void setRepid(String repid) {
		this.repid = repid;
	}
	
	
	
	

}
