import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class SellerEmpTable {
	    private final SimpleStringProperty empeemail;
	    private final SimpleStringProperty empphone;
	    private final SimpleStringProperty sellid;
	    private final SimpleIntegerProperty empage;
	    private final SimpleStringProperty empaddress;
	    private final SimpleStringProperty empname;
	    private final SimpleStringProperty shopname;
	    private final SimpleStringProperty empgender;

	    public SellerEmpTable(String empeemail, String empphone, String sellid, int empage, String empaddress, String empname,
	                     String shopname, String empgender) {
	        this.empeemail = new SimpleStringProperty(empeemail);
	        this.empphone = new SimpleStringProperty(empphone);
	        this.sellid = new SimpleStringProperty(sellid);
	        this.empage = new SimpleIntegerProperty(empage);
	        this.empaddress = new SimpleStringProperty(empaddress);
	        this.empname = new SimpleStringProperty(empname);
	        this.shopname = new SimpleStringProperty(shopname);
	        this.empgender = new SimpleStringProperty(empgender);
	    }

	    // Getter methods
	    public String getEmpeemail() {
	        return empeemail.get();
	    }

	    public String getEmpphone() {
	        return empphone.get();
	    }

	    public String getSellid() {
	        return sellid.get();
	    }

	    public int getEmpage() {
	        return empage.get();
	    }

	    public String getEmpaddress() {
	        return empaddress.get();
	    }

	    public String getEmpname() {
	        return empname.get();
	    }

	    public String getShopname() {
	        return shopname.get();
	    }

	    public String getEmpgender() {
	        return empgender.get();
	    }

	    // Setter methods
	    public void setEmpeemail(String empeemail) {
	        this.empeemail.set(empeemail);
	    }

	    public void setEmpphone(String empphone) {
	        this.empphone.set(empphone);
	    }

	    public void setSellid(String sellid) {
	        this.sellid.set(sellid);
	    }

	    public void setEmpage(int empage) {
	        this.empage.set(empage);
	    }

	    public void setEmpaddress(String empaddress) {
	        this.empaddress.set(empaddress);
	    }

	    public void setEmpname(String empname) {
	        this.empname.set(empname);
	    }

	    public void setShopname(String shopname) {
	        this.shopname.set(shopname);
	    }

	    public void setEmpgender(String empgender) {
	        this.empgender.set(empgender);
	    }
	}


