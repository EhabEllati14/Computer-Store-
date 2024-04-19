import javafx.geometry.Insets;
import javafx.scene.control.Button;
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
import javafx.scene.text.Text;

public class chooseaddemployee {
	private VBox vbox = new VBox(30);
	private Text messageText;
	private ToggleGroup toggleGroup;
	private RadioButton sellerRadio,repairRadio;
	private Button ok,back;
	private HBox b= new HBox(20);
	
	chooseaddemployee(){
		vbox.setPadding(new Insets(20, 50, 50, 50));

		Image backgroundImage = new Image("empadd.png");
		BackgroundSize backgroundSize = new BackgroundSize(400, 300, false, false, false, false);
		BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, backgroundSize);
		vbox.setBackground(new Background(background));
		// Create a Text element to display a message
		 messageText = new Text("Which Employee do you want to Add?");
		messageText.setFont(Font.font(20));

		// Create a ToggleGroup for the radio buttons
		 toggleGroup = new ToggleGroup();

		// Create the first radio button
		 repairRadio = new RadioButton("Repair Employee");
		repairRadio.setToggleGroup(toggleGroup);
		repairRadio.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		repairRadio.setStyle(
					"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
		// Create the second radio button
		 sellerRadio = new RadioButton("Seller Employee");
		sellerRadio.setToggleGroup(toggleGroup);
		sellerRadio.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		sellerRadio.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
//		repairRadio.setOnAction(e -> updateRadioButtonText(repairRadio, sellerRadio));
//		sellerRadio.setOnAction(e -> updateRadioButtonText(sellerRadio, repairRadio));

		 ok = new Button("OK");
		ok.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		ok.setMinSize(150, 50);
		ok.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 150px; " + "-fx-min-height: 30px; "
				+ "-fx-max-width: 150px; " + "-fx-max-height: 85px; " + "-fx-background-color: black;");
		ok.setTextFill(Color.WHITE);
        
		 back = new Button("Back");
		back.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		back.setMinSize(150, 50);
		back.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 150px; " + "-fx-min-height: 30px; "
				+ "-fx-max-width: 150px; " + "-fx-max-height: 85px; " + "-fx-background-color: black;");
		back.setTextFill(Color.WHITE);
		
		 b = new HBox(20);
		b.getChildren().addAll(ok, back);
		// Add the radio buttons to the VBox
		vbox.getChildren().addAll(messageText, repairRadio, sellerRadio, b);
	}

	public VBox getVbox() {
		return vbox;
	}

	public Text getMessageText() {
		return messageText;
	}

	public ToggleGroup getToggleGroup() {
		return toggleGroup;
	}

	public RadioButton getSellerRadio() {
		return sellerRadio;
	}

	public RadioButton getRepairRadio() {
		return repairRadio;
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

	public void setMessageText(Text messageText) {
		this.messageText = messageText;
	}

	public void setToggleGroup(ToggleGroup toggleGroup) {
		this.toggleGroup = toggleGroup;
	}

	public void setSellerRadio(RadioButton sellerRadio) {
		this.sellerRadio = sellerRadio;
	}

	public void setRepairRadio(RadioButton repairRadio) {
		this.repairRadio = repairRadio;
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
