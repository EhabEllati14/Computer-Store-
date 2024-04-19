
public class Computer {
	
	private String Color;
	private String cpu;
	private int ram;
	private String model;
	private int storage;
	private String serialnum;
	private int isbuy;
	private double price;
	private int isrepair;

	
	public Computer(String color,String cpu,int ram,String model, int storage,String serialnum, int isbuy, double price,int isrepair) {
		super();
		this.Color= color;
		this.cpu = cpu;
		this.ram = ram;
		this.model = model;
		this.storage = storage;
		this.serialnum = serialnum;
		this.isbuy = isbuy;
		this.price = price;
		this.isrepair=isrepair;
	}
	
	public int getIsrepair() {
		return isrepair;
	}

	public void setIsrepair(int isrepair) {
		this.isrepair = isrepair;
	}

	public String getColor() {
		return Color;
	}
	public String getCpu() {
		return cpu;
	}
	public int getRam() {
		return ram;
	}
	public String getModel() {
		return model;
	}
	public int getStorage() {
		return storage;
	}
	public String getSerialnum() {
		return serialnum;
	}
	public int getIsbuy() {
		return isbuy;
	}
	public double getPrice() {
		return price;
	}
	public void setColor(String color) {
		Color = color;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}
	public void setIsbuy(int isbuy) {
		this.isbuy = isbuy;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
