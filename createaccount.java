import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class createaccount {
	private Label create,name,address,custid,phonenum,passwordlabel;
	private GridPane grid = new GridPane();
	private TextField nametxt,addtxt,idtxt,phonetxt;
	private PasswordField pass;
	private Button back,ok,clear;
	private ToggleButton show;
	private BorderPane bord = new BorderPane();
	private HBox hb = new HBox(15);
	
	createaccount(){
		create = new Label(" Create Account ");
		create.setTextFill(Color.RED.darker());
		create.setFont(Font.font("Oswald", FontWeight.BOLD, FontPosture.ITALIC,20));
		create.setMinWidth(200);
		create.setTextAlignment(TextAlignment.CENTER);
		create.setAlignment(Pos.CENTER);
		
		name = new Label("Name : ");
		name.setTextFill(Color.RED.darker());
		name.setFont(Font.font("Oswald", FontWeight.BOLD, FontPosture.ITALIC,20));
		name.setMinWidth(200);
		name.setTextAlignment(TextAlignment.CENTER);
		name.setAlignment(Pos.CENTER);
		
		address = new Label("Address : ");
		address.setTextFill(Color.RED.darker());
		address.setFont(Font.font("Oswald", FontWeight.BOLD, FontPosture.ITALIC,20));
		address.setMinWidth(200);
		address.setTextAlignment(TextAlignment.CENTER);
		address.setAlignment(Pos.CENTER);
		
		custid = new Label("Customer-ID :  ");
		custid.setTextFill(Color.RED.darker());
		custid.setFont(Font.font("Oswald", FontWeight.BOLD, FontPosture.ITALIC,20));
		custid.setMinWidth(200);
		custid.setTextAlignment(TextAlignment.CENTER);
		custid.setAlignment(Pos.CENTER);
		
		phonenum = new Label("Phone Number : ");
		phonenum.setTextFill(Color.RED.darker());
		phonenum.setFont(Font.font("Oswald", FontWeight.BOLD, FontPosture.ITALIC,20));
		phonenum.setMinWidth(200);
		phonenum.setTextAlignment(TextAlignment.CENTER);
		phonenum.setAlignment(Pos.CENTER);
		
		passwordlabel = new Label("Password :");
		passwordlabel.setTextFill(Color.RED.darker());
		passwordlabel.setFont(Font.font("Oswald", FontWeight.BOLD, FontPosture.ITALIC,20));
		passwordlabel.setMinWidth(200);
		passwordlabel.setTextAlignment(TextAlignment.CENTER);
		passwordlabel.setAlignment(Pos.CENTER);
		
		nametxt= new TextField();
		nametxt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		nametxt.setMinWidth(300);
		nametxt.setMinHeight(40);
		
		addtxt= new TextField();
		addtxt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		addtxt.setMinWidth(300);
		addtxt.setMinHeight(40);
		
		idtxt= new TextField();
		idtxt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		idtxt.setMinWidth(300);
		idtxt.setMinHeight(40);
		
		phonetxt= new TextField();
		phonetxt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		phonetxt.setMinWidth(300);
		phonetxt.setMinHeight(40);
		
		show = new ToggleButton("Show");
		show.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		show.setMinSize(150, 50);
		show.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		show.setTextFill(Color.WHITE);
		
		ok= new Button("Create");
		ok.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		ok.setMinSize(150, 50);
		ok.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		ok.setTextFill(Color.WHITE);
		
		
		back = new Button("Back");
		back.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		back.setMinSize(150, 50);
		back.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		back.setTextFill(Color.WHITE);
		
		clear = new Button("Back");
		clear.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		clear.setMinSize(150, 50);
		clear.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		clear.setTextFill(Color.WHITE);
		
		pass= new PasswordField();
		pass.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		
		bord.setTop(create);
		bord.setAlignment(create,Pos.CENTER);
		
		grid.add(name, 0, 0);
		grid.add(nametxt, 1, 0);
		grid.add(address, 0, 1);
		grid.add(addtxt, 1, 1);
		grid.add(custid, 0, 2);
		grid.add(idtxt, 1, 2);
		grid.add(phonenum, 0, 3);
		grid.add(phonetxt, 1, 3);
		grid.add(passwordlabel, 0, 4);
		grid.add(pass, 1, 4);
		grid.add(show, 2, 4);
		grid.setVgap(15);
		grid.setHgap(15);
		
		
		hb.getChildren().addAll(back,ok,clear);
		hb.setAlignment(Pos.CENTER);
		bord.setBottom(hb);
		bord.setAlignment(hb, Pos.CENTER);
		bord.setCenter(grid);

	}

	public Label getCreate() {
		return create;
	}

	public Label getName() {
		return name;
	}

	public Label getAddress() {
		return address;
	}

	public Label getCustid() {
		return custid;
	}

	public Label getPhonenum() {
		return phonenum;
	}

	public Label getPasswordlabel() {
		return passwordlabel;
	}

	public GridPane getGrid() {
		return grid;
	}

	public TextField getNametxt() {
		return nametxt;
	}

	public TextField getAddtxt() {
		return addtxt;
	}

	public TextField getIdtxt() {
		return idtxt;
	}

	public TextField getPhonetxt() {
		return phonetxt;
	}

	public PasswordField getPass() {
		return pass;
	}

	public Button getBack() {
		return back;
	}

	public Button getOk() {
		return ok;
	}

	public Button getClear() {
		return clear;
	}

	public ToggleButton getShow() {
		return show;
	}

	public BorderPane getBord() {
		return bord;
	}

	public HBox getHb() {
		return hb;
	}

	public void setCreate(Label create) {
		this.create = create;
	}

	public void setName(Label name) {
		this.name = name;
	}

	public void setAddress(Label address) {
		this.address = address;
	}

	public void setCustid(Label custid) {
		this.custid = custid;
	}

	public void setPhonenum(Label phonenum) {
		this.phonenum = phonenum;
	}

	public void setPasswordlabel(Label passwordlabel) {
		this.passwordlabel = passwordlabel;
	}

	public void setGrid(GridPane grid) {
		this.grid = grid;
	}

	public void setNametxt(TextField nametxt) {
		this.nametxt = nametxt;
	}

	public void setAddtxt(TextField addtxt) {
		this.addtxt = addtxt;
	}

	public void setIdtxt(TextField idtxt) {
		this.idtxt = idtxt;
	}

	public void setPhonetxt(TextField phonetxt) {
		this.phonetxt = phonetxt;
	}

	public void setPass(PasswordField pass) {
		this.pass = pass;
	}

	public void setBack(Button back) {
		this.back = back;
	}

	public void setOk(Button ok) {
		this.ok = ok;
	}

	public void setClear(Button clear) {
		this.clear = clear;
	}

	public void setShow(ToggleButton show) {
		this.show = show;
	}

	public void setBord(BorderPane bord) {
		this.bord = bord;
	}

	public void setHb(HBox hb) {
		this.hb = hb;
	}
	
	

}
