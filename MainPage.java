import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainPage {
	
	Stage stage1;
 private Button adminbutton,cusserbutton,close;
 private HBox hb = new HBox(10);
 private Label titlemain;
 private Group gp = new Group();

MainPage(){
	
	titlemain = new Label("      Computer Store");
	titlemain.setStyle(
    		"-fx-background-color: derive(#61a2b1,1.7);"+"-fx-background-color:black;" +
            "-fx-background-insets: 0.5;" +
            "-fx-padding: 5;" +
            "-fx-background-radius: 100em; " +
            "-fx-min-width: 600px; " +
            "-fx-min-height: 20px; " +
            "-fx-max-width: 200px; " +
            "-fx-border-width: 1;" +
            "-fx-border-radius: 5;" +
            "-fx-fill: white;" 
    );


  
	titlemain.setTextFill(Color.WHITE.brighter().brighter());
	titlemain.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 60));
	titlemain.setLayoutX(340);
	titlemain.setLayoutY(50);

	
	adminbutton = new Button(" Admin ");
	adminbutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	adminbutton.setMinSize(150, 50);
	adminbutton.setStyle(
            
			 "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
    );
	adminbutton.setTextFill(Color.WHITE);
	
	cusserbutton = new Button(" Customer Sevices  ");
	cusserbutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	cusserbutton.setMinSize(150, 50);
	cusserbutton.setStyle(
            
			 "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
    );
	cusserbutton.setTextFill(Color.WHITE);
	
	close = new Button(" Close ");
	close.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	close.setMinSize(150, 50);
	close.setStyle(
            
			 "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
    );
	close.setTextFill(Color.WHITE);
	
	Image m = new Image ("file:///C:/Users/Ehab/eclipse-workspace/SOMIA/src/backipad.jpg");
	ImageView mg = new ImageView(m);
	mg.setFitHeight(600);
	mg.setFitWidth(1250);
	
	hb.getChildren().addAll(cusserbutton,adminbutton,close);
	hb.setLayoutX(300);
	hb.setLayoutY(500);
	gp.getChildren().addAll(mg,titlemain,hb);
	
	
	
}

public Stage getStage1() {
	return stage1;
}

public Button getAdminbutton() {
	return adminbutton;
}

public Button getCusserbutton() {
	return cusserbutton;
}

public Button getClose() {
	return close;
}

public HBox getHb() {
	return hb;
}

public Label getTitlemain() {
	return titlemain;
}

public Group getGp() {
	return gp;
}

public void setStage1(Stage stage1) {
	this.stage1 = stage1;
}

public void setAdminbutton(Button adminbutton) {
	this.adminbutton = adminbutton;
}

public void setCusserbutton(Button cusserbutton) {
	this.cusserbutton = cusserbutton;
}

public void setClose(Button close) {
	this.close = close;
}

public void setHb(HBox hb) {
	this.hb = hb;
}

public void setTitlemain(Label titlemain) {
	this.titlemain = titlemain;
}

public void setGp(Group gp) {
	this.gp = gp;
}
	
	
}
