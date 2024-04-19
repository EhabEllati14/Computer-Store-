import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ComputerTable {
	private SimpleStringProperty color ;
	private SimpleStringProperty cpu;
	private SimpleIntegerProperty ram;
	private SimpleStringProperty model;
	private SimpleIntegerProperty storage;
	private SimpleStringProperty serialnum;
	private SimpleDoubleProperty price;
	
	
	ComputerTable(String s1,String s2, int s3, String s4, int s5, String s6, double s7){
		color=new SimpleStringProperty(s1);
		cpu=new SimpleStringProperty(s2);
		ram=new SimpleIntegerProperty(s3);
		model=new SimpleStringProperty(s4);
		storage=new SimpleIntegerProperty(s5);
		serialnum=new SimpleStringProperty(s6);
		price= new SimpleDoubleProperty(s7);	
	}


	public String getColor() {
		return color.get();
	}


	public String getCpu() {
		return cpu.get();
	}


	public int getRam() {
		return ram.get();
	}


	public String getModel() {
		return model.get();
	}


	public int getStorage() {
		return storage.get();
	}


	public String getSerialnum() {
		return serialnum.get();
	}


	public double getPrice() {
		return price.get();
	}


	public void setColor(String r) {
		color.set(r);
	}


	public void setCpu(String r) {
		cpu.set(r);
		}


	public void setRam(int r) {
		ram.set(r);
	}


	public void setModel(String r) {
		model.set(r);
	}


	public void setStorage(int r) {
		storage.set(r);
	}


	public void setSerialnum(String r) {
		serialnum.set(r);
	}


	public void setPrice(double r) {
		price.set(r);
	}
	

}
