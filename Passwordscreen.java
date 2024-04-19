

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Passwordscreen {
	//private BorderPane passwordb = new BorderPane();
	private Group admingp = new Group();
	private GridPane g= new GridPane();
	private Label passwordlabel;
	private PasswordField pass;
	private Button ok ,main;
	private Label massg;
	private HBox passhbox= new HBox(15);
	Stage stage7;
	
	Passwordscreen(){
		
		passwordlabel=new Label("Password : ");
		passwordlabel.setTextFill(Color.BLACK);
		passwordlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		passwordlabel.setMaxWidth(200);
		
		massg=new Label();
		massg.setTextFill(Color.RED.darker());
		massg.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		massg.setMinWidth(200);
		
		pass = new PasswordField();
		pass.setText(null);
		pass.setPrefColumnCount(10);
		pass.setMinSize(200, 20);
		
		ok= new Button("Ok");
		ok.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		ok.setMinSize(150, 50);
		ok.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 20px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );
		ok.setTextFill(Color.WHITE);
	
		
		main= new Button("Close");
		main.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		main.setMinSize(150, 50);
		main.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 20px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );
		main.setTextFill(Color.WHITE);
		
		 Image img = new Image("file:///C:/Users/Ehab/eclipse-workspace/SOMIA/src/finalone.jpg");
	      ImageView view = new ImageView(img);
	      view.setFitHeight(300);
	      view.setFitWidth(350);
	      view.setLayoutX(0);
	      view.setLayoutY(0);
//	      Image img2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/SOMIA/src/logocompmo.jpg");
//	      ImageView view2 = new ImageView(img2);
//	      view.setFitHeight(100);
//	      view.setFitWidth(100);
//	      view.setLayoutX(20);
//	      view.setLayoutY(20);
	      
		
		g.setHgap(10);
		g.setVgap(10);
		
		g.add(passwordlabel, 0, 0);
		g.add(pass, 1, 0);
		g.setLayoutX(360);
		g.setLayoutY(100);
		passhbox.getChildren().addAll(main,ok);
		
		g.add(passhbox, 1, 1);
		g.setPadding(new Insets(5, 5, 5, 5));
		g.setAlignment(Pos.CENTER);
		admingp.getChildren().addAll(view,g);
		//admingp.getChildren().add(view2);
		//passwordb.setCenter(g);
		//admingp.setAlignment(g, Pos.CENTER);
		//passwordb.setBottom(massg);
	
	}

	public Button getMain() {
		return main;
	}

	public void setMain(Button main) {
		this.main = main;
	}

	

	public GridPane getG() {
		return g;
	}

	public Label getPasswordlabel() {
		return passwordlabel;
	}

	public PasswordField getPass() {
		return pass;
	}

	public Button getOk() {
		return ok;
	}

	public Label getMassg() {
		return massg;
	}


	public Group getAdmingp() {
		return admingp;
	}

	public HBox getPasshbox() {
		return passhbox;
	}

	public void setAdmingp(Group admingp) {
		this.admingp = admingp;
	}

	public void setPasshbox(HBox passhbox) {
		this.passhbox = passhbox;
	}

	public void setG(GridPane g) {
		this.g = g;
	}

	public void setPasswordlabel(Label passwordlabel) {
		this.passwordlabel = passwordlabel;
	}

	public void setPass(PasswordField pass) {
		this.pass = pass;
	}

	public void setOk(Button ok) {
		this.ok = ok;
	}

	public void setMassg(Label massg) {
		this.massg = massg;
	}
	
	
	

}