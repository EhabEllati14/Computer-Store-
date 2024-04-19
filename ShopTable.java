import javafx.beans.property.SimpleStringProperty;

public class ShopTable {

	    private final SimpleStringProperty shopname;
	    private final SimpleStringProperty phonenum;
	    private final SimpleStringProperty address;

	    public ShopTable(String shopname, String phonenum, String address) {
	        this.shopname = new SimpleStringProperty(shopname);
	        this.phonenum = new SimpleStringProperty(phonenum);
	        this.address = new SimpleStringProperty(address);
	    }

	    // Getter methods
	    public String getShopname() {
	        return shopname.get();
	    }

	    public String getPhonenum() {
	        return phonenum.get();
	    }

	    public String getAddress() {
	        return address.get();
	    }

	    // Setter methods
	    public void setShopname(String shopname) {
	        this.shopname.set(shopname);
	    }

	    public void setPhonenum(String phonenum) {
	        this.phonenum.set(phonenum);
	    }

	    public void setAddress(String address) {
	        this.address.set(address);
	    }
	}


