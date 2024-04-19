import javafx.geometry.Pos;
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

public class Customersignorcreacc {
	private Label idlabel,passwordlabel,createlabel,signin;
	private PasswordField idpasstxt,passtxt;
	private Button createaccount,cancel;
	private HBox hb = new HBox(10);
	BorderPane bordercus = new BorderPane();
	GridPane grid = new GridPane();
	
	Customersignorcreacc(){
		idlabel= new Label("Customer ID : ");
		idlabel.setTextFill(Color.WHITE);
		idlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		idlabel.setMaxWidth(200);
		
		passwordlabel=new Label("Password : ");
		passwordlabel.setTextFill(Color.WHITE);
		passwordlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		passwordlabel.setMaxWidth(200);
		
		createlabel= new Label("If You Dont Have Account Please Press Create Account");
		createlabel.setTextFill(Color.WHITE);
		createlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		createlabel.setMaxWidth(200);
		
		signin= new Label("Sign In");
		signin.setTextFill(Color.WHITE);
		signin.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		signin.setMaxWidth(200);
		
		idpasstxt= new PasswordField();
		idpasstxt.setText(null);
		idpasstxt.setPrefColumnCount(10);
		idpasstxt.setMinSize(200, 20);
		
		passtxt= new PasswordField();
		passtxt.setText(null);
		passtxt.setPrefColumnCount(10);
		passtxt.setMinSize(200, 20);
		
		createaccount= new Button("Create Account");
		createaccount.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		createaccount.setMinSize(150, 50);
		createaccount.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 30px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );
		createaccount.setTextFill(Color.WHITE);
		
		cancel= new Button("Cancel");
		cancel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		cancel.setMinSize(150, 50);
		cancel.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 30px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );
		cancel.setTextFill(Color.WHITE);
		
		hb.getChildren().addAll(createaccount,cancel);
		grid.add(idlabel, 0, 0);
		grid.add(idpasstxt, 0, 1);
		grid.add(passwordlabel, 1, 0);
		grid.add(passtxt, 1, 1);
		grid.setAlignment(Pos.CENTER);
		
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/SOMIA/src/passwordback.jpeg");
		ImageView mg = new ImageView(m);
		mg.setFitWidth(500);
		mg.setFitHeight(500);
		
		
	}
	

}
