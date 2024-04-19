import javax.swing.JPasswordField;
import javax.swing.JToggleButton;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class signcust {
	private Group gp = new Group();
	private BorderPane border = new BorderPane();
	private Label title,login,userid,userpassword,newmember,updatelabel,deletelabel;
	private PasswordField useridpass, password;
	private ToggleButton show1,show2;
	private Button signin,loginbutton,back,updatebutton,delete;
	private GridPane grid = new GridPane();
	private VBox vbox = new VBox(5);
	private VBox vbox2= new VBox(10);
	private HBox hbox3 = new HBox(10);
	private HBox hbox1 = new HBox(10);
	private HBox hbox2 = new HBox(10);
	
	signcust(){
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/SOMIA/src/log.gif");
		ImageView mg = new ImageView(m);
		mg.setFitHeight(450);
		mg.setFitWidth(500);
		
		title= new Label(" ~ ENM COMPUTER STORE ~ ");
		title.setTextFill(Color.RED.darker());
		title.setFont(Font.font("Oswald", FontWeight.BOLD, FontPosture.ITALIC,20));
		title.setMinWidth(200);
		title.setTextAlignment(TextAlignment.CENTER);
		title.setAlignment(Pos.CENTER);
		
		
		login= new Label(" LOGIN ");
		login.setTextFill(Color.RED.darker());
		login.setFont(Font.font("Oswald", FontWeight.BOLD, FontPosture.ITALIC,20));
		login.setMinWidth(200);
		login.setTextAlignment(TextAlignment.CENTER);
		login.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(title,login);
		vbox.setAlignment(Pos.CENTER);
		
		userid= new Label(" User-ID :");
		userid.setTextFill(Color.RED.darker());
		userid.setFont(Font.font("Enviro", FontWeight.BOLD, FontPosture.ITALIC,20));
		userid.setMinWidth(200);
		
		userpassword= new Label(" User-Password :");
		userpassword.setTextFill(Color.RED.darker());
		userpassword.setFont(Font.font("Enviro", FontWeight.BOLD, FontPosture.ITALIC,20));
		userpassword.setMinWidth(200);
		
		
		updatelabel= new Label("Update Your Account !");
		updatelabel.setTextFill(Color.RED.darker());
		updatelabel.setFont(Font.font("Enviro", FontWeight.BOLD, FontPosture.ITALIC,20));
		updatelabel.setMinWidth(200);
		
		deletelabel= new Label("Delete Your Account !");
		deletelabel.setTextFill(Color.RED.darker());
		deletelabel.setFont(Font.font("Enviro", FontWeight.BOLD, FontPosture.ITALIC,20));
		deletelabel.setMinWidth(200);
		
		
		newmember= new Label(" New Member ?");
		newmember.setTextFill(Color.RED.darker());
		newmember.setFont(Font.font("Enviro", FontWeight.BOLD, FontPosture.ITALIC,20));
		newmember.setMinWidth(200);
		
		border.setTop(vbox);
		border.setLayoutX(560);
		border.setLayoutY(5);
		
		show1 = new ToggleButton("Show");
		show1.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		show1.setMinSize(150, 50);
		show1.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		show1.setTextFill(Color.WHITE);
		
		password = new PasswordField();
		
		
		useridpass = new PasswordField();
		
		
		
		show2 = new ToggleButton("Show");
		show2.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		show2.setMinSize(150, 50);
		show2.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		signin= new Button("SIGN-IN");
		signin.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		signin.setMinSize(150, 50);
		signin.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		signin.setTextFill(Color.WHITE);
		
		
		updatebutton= new Button("Update");
		updatebutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		updatebutton.setMinSize(150, 50);
		updatebutton.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		updatebutton.setTextFill(Color.WHITE);
		
		delete= new Button("Delete");
		delete.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		delete.setMinSize(150, 50);
		delete.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		delete.setTextFill(Color.WHITE);
		
		loginbutton = new Button("LOGIN");
		loginbutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		loginbutton.setMinSize(150, 50);
		loginbutton.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width:50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		loginbutton.setTextFill(Color.WHITE);
		back = new Button("BACK");
		back.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,16));
		back.setMinSize(150, 50);
		back.setStyle(
	            
				 "-fx-background-radius: 2em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		back.setTextFill(Color.WHITE);
		show2.setTextFill(Color.WHITE);
		hbox1.getChildren().addAll(updatelabel,updatebutton);
		hbox2.getChildren().addAll(deletelabel,delete);
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox3.getChildren().addAll(newmember,signin);
		hbox3.setAlignment(Pos.CENTER);
//		vbox2.getChildren().addAll(hbox1,hbox2);
		
		//border.setBottom(loginbutton);
//		hbox3.setAlignment(Pos.CENTER);
//		vbox2.setAlignment(Pos.CENTER);
//		border.setCenter(vbox2);
		
		grid.add(userid, 0, 0);
		grid.add(useridpass, 1, 0);
		grid.add(show1, 2, 0);
		grid.add(userpassword, 0, 1);
		grid.add(password, 1, 1);
		grid.add(show2, 2, 1);
		grid.add(loginbutton, 1, 4);
		grid.setVgap(10);
		grid.setHgap(10);
		
		vbox2.getChildren().addAll(grid,hbox3,hbox1,hbox2);
		border.setCenter(vbox2);
		
		border.setBottom(back);
		border.setAlignment(back,Pos.CENTER);
		
		
		
		
		
		
		
		
		
		
		
		gp.getChildren().addAll(mg,border);
		
		
	}

	public Label getUpdatelabel() {
		return updatelabel;
	}

	public Label getDeletelabel() {
		return deletelabel;
	}

	public Button getUpdatebutton() {
		return updatebutton;
	}

	public Button getDelete() {
		return delete;
	}

	public HBox getHbox1() {
		return hbox1;
	}

	public HBox getHbox2() {
		return hbox2;
	}

	public void setUpdatelabel(Label updatelabel) {
		this.updatelabel = updatelabel;
	}

	public void setDeletelabel(Label deletelabel) {
		this.deletelabel = deletelabel;
	}

	public void setUpdatebutton(Button updatebutton) {
		this.updatebutton = updatebutton;
	}

	public void setDelete(Button delete) {
		this.delete = delete;
	}

	public void setHbox1(HBox hbox1) {
		this.hbox1 = hbox1;
	}

	public void setHbox2(HBox hbox2) {
		this.hbox2 = hbox2;
	}

	public Button getBack() {
		return back;
	}

	public GridPane getGrid() {
		return grid;
	}

	public VBox getVbox2() {
		return vbox2;
	}

	public void setBack(Button back) {
		this.back = back;
	}

	public void setGrid(GridPane grid) {
		this.grid = grid;
	}

	public void setVbox2(VBox vbox2) {
		this.vbox2 = vbox2;
	}

	public Group getGp() {
		return gp;
	}

	public BorderPane getBorder() {
		return border;
	}

	public Label getTitle() {
		return title;
	}

	public Label getLogin() {
		return login;
	}

	public Label getUserid() {
		return userid;
	}

	public Label getUserpassword() {
		return userpassword;
	}

	public Label getNewmember() {
		return newmember;
	}

	public PasswordField getUseridpass() {
		return useridpass;
	}

	public PasswordField getPassword() {
		return password;
	}

	public ToggleButton getShow1() {
		return show1;
	}

	public ToggleButton getShow2() {
		return show2;
	}

	public Button getSignin() {
		return signin;
	}

	public Button getLoginbutton() {
		return loginbutton;
	}

	public VBox getVbox() {
		return vbox;
	}

	

	public HBox getHbox3() {
		return hbox3;
	}

	public void setGp(Group gp) {
		this.gp = gp;
	}

	public void setBorder(BorderPane border) {
		this.border = border;
	}

	public void setTitle(Label title) {
		this.title = title;
	}

	public void setLogin(Label login) {
		this.login = login;
	}

	public void setUserid(Label userid) {
		this.userid = userid;
	}

	public void setUserpassword(Label userpassword) {
		this.userpassword = userpassword;
	}

	public void setNewmember(Label newmember) {
		this.newmember = newmember;
	}

	public void setUseridpass(PasswordField useridpass) {
		this.useridpass = useridpass;
	}

	public void setPassword(PasswordField password) {
		this.password = password;
	}

	public void setShow1(ToggleButton show1) {
		this.show1 = show1;
	}

	public void setShow2(ToggleButton show2) {
		this.show2 = show2;
	}

	public void setSignin(Button signin) {
		this.signin = signin;
	}

	public void setLoginbutton(Button loginbutton) {
		this.loginbutton = loginbutton;
	}

	public void setVbox(VBox vbox) {
		this.vbox = vbox;
	}

	

	public void setHbox3(HBox hbox3) {
		this.hbox3 = hbox3;
	}
	
}
