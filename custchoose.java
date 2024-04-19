import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class custchoose {
private VBox vbox = new VBox(30);
private Label messageText;
private ToggleGroup toggleGroup;
private RadioButton buyRadio,repairaRadio ;
private Button ok,back;
private HBox b = new HBox(20);
custchoose(){
	
	vbox.setPadding(new Insets(20, 50, 50, 50));

	Image backgroundImage = new Image("cus.png");
	BackgroundSize backgroundSize = new BackgroundSize(600, 300, false, false, false, false);
	BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, backgroundSize);
	vbox.setBackground(new Background(background));
	messageText = new Label(
			"Welcome to ENM Computer Store! \n        Please Select one of the Options..");
	messageText.setFont(Font.font(20));
	messageText.setTextFill(Color.WHITE);
	
	// Create a ToggleGroup for the radio buttons
				 toggleGroup = new ToggleGroup();

				// Create the first radio button
				 buyRadio = new RadioButton("Buy a computer");
				buyRadio.setToggleGroup(toggleGroup);
				buyRadio.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
				buyRadio.setTextFill(Color.WHITE);

				// Create the second radio button
				 repairaRadio = new RadioButton("Repair Computer");
				repairaRadio.setToggleGroup(toggleGroup);
				repairaRadio.setTextFill(Color.WHITE);
				repairaRadio.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));

				//buyRadio.setOnAction(e -> updateRadioButtonText(buyRadio, repairaRadio));
				//repairaRadio.setOnAction(e -> updateRadioButtonText(repairaRadio, buyRadio));
				 ok = new Button("OK");
				ok.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
				ok.setMinSize(150, 50);
				ok.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 150px; " + "-fx-min-height: 30px; "
						+ "-fx-max-width: 150px; " + "-fx-max-height: 85px; " + "-fx-background-color: black;");
				ok.setTextFill(Color.WHITE);
				// Set the action for the OK button
//				ok.setOnAction(e -> {
//					if (buyRadio.isSelected()) {
//						buyWindow();
//					} else if (repairaRadio.isSelected()) {
//						repairDetailsWindow();
//					} else {
//						showAlert("Please choose an employee type!");
//					}
//				});

			 back = new Button("Back");
				back.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
				back.setMinSize(150, 50);
				back.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 150px; " + "-fx-min-height: 30px; "
						+ "-fx-max-width: 150px; " + "-fx-max-height: 85px; " + "-fx-background-color: black;");
				back.setTextFill(Color.WHITE);
			//	back.setOnAction(e -> primaryStage.close());
				 b = new HBox(20);
				b.getChildren().addAll(ok, back);
				// Add the radio buttons to the VBox
				vbox.getChildren().addAll(messageText, buyRadio, repairaRadio, b);

	
}
public VBox getVbox() {
	return vbox;
}
public Label getMessageText() {
	return messageText;
}
public ToggleGroup getToggleGroup() {
	return toggleGroup;
}
public RadioButton getBuyRadio() {
	return buyRadio;
}
public RadioButton getRepairaRadio() {
	return repairaRadio;
}
public Button getOk() {
	return ok;
}
public Button getBack() {
	return back;
}
public HBox getB() {
	return b;
}
public void setVbox(VBox vbox) {
	this.vbox = vbox;
}
public void setMessageText(Label messageText) {
	this.messageText = messageText;
}
public void setToggleGroup(ToggleGroup toggleGroup) {
	this.toggleGroup = toggleGroup;
}
public void setBuyRadio(RadioButton buyRadio) {
	this.buyRadio = buyRadio;
}
public void setRepairaRadio(RadioButton repairaRadio) {
	this.repairaRadio = repairaRadio;
}
public void setOk(Button ok) {
	this.ok = ok;
}
public void setBack(Button back) {
	this.back = back;
}
public void setB(HBox b) {
	this.b = b;
}


}
