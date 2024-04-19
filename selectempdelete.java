
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
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
public class selectempdelete {

		private VBox vbox = new VBox(30);
		private Text messageText = new Text("Which Employee do you want to Delete?");
		private ToggleGroup toggleGroup = new ToggleGroup();
		private RadioButton repairRadio = new RadioButton("Repair Employee");
		private RadioButton sellerRadio = new RadioButton("Seller Employee");
		private Button ok = new Button("OK");
		private Button back = new Button("Back");
		private HBox b = new HBox(20);
		selectempdelete(){
			// Create a VBox to hold the radio buttons and text
						vbox = new VBox(30);
						vbox.setPadding(new Insets(20, 50, 50, 50));

						Image backgroundImage = new Image("empp.png");
						BackgroundSize backgroundSize = new BackgroundSize(400, 300, false, false, false, false);
						BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, backgroundSize);

						vbox.setBackground(new Background(background));
						// Create a Text element to display a message
						messageText.setFont(Font.font(20));

						// Create a ToggleGroup for the radio buttons

						// Create the first radio button
						repairRadio.setToggleGroup(toggleGroup);
						repairRadio.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
						repairRadio.setStyle("-fx-background-color: yellow;");
						// Create the second radio button
						sellerRadio.setToggleGroup(toggleGroup);
						sellerRadio.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
//						repairRadio.setOnAction(e -> updateRadioButtonText(repairRadio, sellerRadio));
//						sellerRadio.setOnAction(e -> updateRadioButtonText(sellerRadio, repairRadio));
						sellerRadio.setStyle("-fx-background-color: yellow;");

						ok.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
						ok.setMinSize(150, 50);
						ok.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 150px; " + "-fx-min-height: 30px; "
								+ "-fx-max-width: 150px; " + "-fx-max-height: 85px; " + "-fx-background-color: black;");
						ok.setTextFill(Color.WHITE);
						// Set the action for the OK button
						ok.setOnAction(e -> {
							if (repairRadio.isSelected()) {
//								Passwordscreenr();
//			                    repairDetailsWindow();
							} else if (sellerRadio.isSelected()) {
//			                    sellerDetailsWindow();
//								Passwordscreens();

							} else {
								showAlert("Please choose an employee type!");
							}
						});

						back.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
						back.setMinSize(150, 50);
						back.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 150px; " + "-fx-min-height: 30px; "
								+ "-fx-max-width: 150px; " + "-fx-max-height: 85px; " + "-fx-background-color: black;");
						back.setTextFill(Color.WHITE);
//						back.setOnAction(e -> primaryStage.close());

						b.getChildren().addAll(ok, back);
						// Add the radio buttons to the VBox
						vbox.getChildren().addAll(messageText, repairRadio, sellerRadio, b);

		}
		private void showAlert(String message) {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Warning");
			alert.setHeaderText(null);
			alert.setContentText(message);
			alert.showAndWait();
		}
		public VBox getVbox() {
			return vbox;
		}
		public void setVbox(VBox vbox) {
			this.vbox = vbox;
		}
		public Text getMessageText() {
			return messageText;
		}
		public void setMessageText(Text messageText) {
			this.messageText = messageText;
		}
		public ToggleGroup getToggleGroup() {
			return toggleGroup;
		}
		public void setToggleGroup(ToggleGroup toggleGroup) {
			this.toggleGroup = toggleGroup;
		}
		public RadioButton getRepairRadio() {
			return repairRadio;
		}
		public void setRepairRadio(RadioButton repairRadio) {
			this.repairRadio = repairRadio;
		}
		public RadioButton getSellerRadio() {
			return sellerRadio;
		}
		public void setSellerRadio(RadioButton sellerRadio) {
			this.sellerRadio = sellerRadio;
		}
		public Button getOk() {
			return ok;
		}
		public void setOk(Button ok) {
			this.ok = ok;
		}
		public Button getBack() {
			return back;
		}
		public void setBack(Button back) {
			this.back = back;
		}
		public HBox getB() {
			return b;
		}
		public void setB(HBox b) {
			this.b = b;
		}
		
	}


