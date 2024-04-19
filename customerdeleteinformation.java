import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class customerdeleteinformation {
	private Label title,name,address,custid,phonenum,passwordlabel,msg;
	private GridPane grid = new GridPane();
	private TextField nametxt,addtxt,idtxt,phonetxt,password;
	private Button yes,no;
	private BorderPane bord = new BorderPane();
	private HBox hb = new HBox(15);
	private VBox vb = new VBox(10);
	customerdeleteinformation(){
		title = new Label(" User Information ");
		title.setTextFill(Color.RED.darker());
		title.setFont(Font.font("Oswald", FontWeight.BOLD, FontPosture.ITALIC,20));
		title.setMinWidth(200);
		title.setTextAlignment(TextAlignment.CENTER);
		title.setAlignment(Pos.CENTER);
		
		msg = new Label(" Are You Sure To Delete Your Account ? ");
		msg.setTextFill(Color.RED.darker());
		msg.setFont(Font.font("Oswald", FontWeight.BOLD, FontPosture.ITALIC,20));
		msg.setMinWidth(200);
		msg.setTextAlignment(TextAlignment.CENTER);
		msg.setAlignment(Pos.CENTER);
		
		
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
		
		password= new TextField();
		password.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		password.setMinWidth(300);
		password.setMinHeight(40);
		
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
		
		
		yes= new Button("YES");
		yes.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		yes.setMinSize(150, 50);
		yes.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		yes.setTextFill(Color.WHITE);
		
		
		no = new Button("NO");
		no.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		no.setMinSize(150, 50);
		no.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		no.setTextFill(Color.WHITE);
		
		
		
		
		
		bord.setTop(title);
		bord.setAlignment(title,Pos.CENTER);
		
		grid.add(name, 0, 0);
		grid.add(nametxt, 1, 0);
		grid.add(address, 0, 1);
		grid.add(addtxt, 1, 1);
		grid.add(custid, 0, 2);
		grid.add(idtxt, 1, 2);
		grid.add(phonenum, 0, 3);
		grid.add(phonetxt, 1, 3);
		grid.add(passwordlabel, 0, 4);
		grid.add(password, 1, 4);
		grid.setVgap(15);
		grid.setHgap(15);
		hb.getChildren().addAll(yes,no);
		hb.setAlignment(Pos.CENTER);
		vb.getChildren().addAll(msg,hb);
		vb.setAlignment(Pos.CENTER);
		
		bord.setBottom(vb);
		bord.setAlignment(hb, Pos.CENTER);
		bord.setCenter(grid);

	}

	public Label getMsg() {
		return msg;
	}

	public VBox getVb() {
		return vb;
	}

	public void setMsg(Label msg) {
		this.msg = msg;
	}

	public void setVb(VBox vb) {
		this.vb = vb;
	}

	public Label getCreate() {
		return title;
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

	
	public BorderPane getBord() {
		return bord;
	}

	public HBox getHb() {
		return hb;
	}

	public void setCreate(Label create) {
		this.title = create;
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



	public Label getTitle() {
		return title;
	}

	public TextField getPassword() {
		return password;
	}

	public Button getYes() {
		return yes;
	}

	public Button getNo() {
		return no;
	}

	public void setTitle(Label title) {
		this.title = title;
	}

	public void setPassword(TextField password) {
		this.password = password;
	}

	public void setYes(Button yes) {
		this.yes = yes;
	}

	public void setNo(Button no) {
		this.no = no;
	}

	public void setBord(BorderPane bord) {
		this.bord = bord;
	}

	public void setHb(HBox hb) {
		this.hb = hb;
	}
	
	
}
