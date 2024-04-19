import javafx.beans.property.SimpleStringProperty;
public class CustomerTable {

	    private final SimpleStringProperty name;
	    private final SimpleStringProperty address;
	    private final SimpleStringProperty custid;
	    private final SimpleStringProperty phonenum;
	    private final SimpleStringProperty password;

	    public CustomerTable(String name, String address, String custid, String phonenum, String password) {
	        this.name = new SimpleStringProperty(name);
	        this.address = new SimpleStringProperty(address);
	        this.custid = new SimpleStringProperty(custid);
	        this.phonenum = new SimpleStringProperty(phonenum);
	        this.password = new SimpleStringProperty(password);
	    }

	    // Getter methods
	    public String getName() {
	        return name.get();
	    }

	    public String getAddress() {
	        return address.get();
	    }

	    public String getCustid() {
	        return custid.get();
	    }

	    public String getPhonenum() {
	        return phonenum.get();
	    }

	    public String getPassword() {
	        return password.get();
	    }

	    // Setter methods
	    public void setName(String name) {
	        this.name.set(name);
	    }

	    public void setAddress(String address) {
	        this.address.set(address);
	    }

	    public void setCustid(String custid) {
	        this.custid.set(custid);
	    }

	    public void setPhonenum(String phonenum) {
	        this.phonenum.set(phonenum);
	    }

	    public void setPassword(String password) {
	        this.password.set(password);
	    }
	}

