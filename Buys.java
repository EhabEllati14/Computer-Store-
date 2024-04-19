
public class Buys {
	private String custid;
	private String sellid;
	private String serialnum;
	
	public Buys(String custid, String sellid, String serialnum) {
		super();
		this.custid = custid;
		this.sellid = sellid;
		this.serialnum = serialnum;
	}
	public String getCustid() {
		return custid;
	}
	public String getSellid() {
		return sellid;
	}
	public String getSerialnum() {
		return serialnum;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public void setSellid(String sellid) {
		this.sellid = sellid;
	}
	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}

}
