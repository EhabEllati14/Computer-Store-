import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class UpdateComputer {
	private GridPane gridPane = new GridPane();
	private Label idLabel = new Label("Serial Nummber:");
	private TextField idTextField = new TextField();
	private Label nameLabel = new Label("color:");
	private TextField colorTextField = new TextField();
	private Label ageLabel = new Label("CPU:");
	private TextField cpuTextField = new TextField();
	private Label emailLabel = new Label("RAM:");
	private TextField ramTextField = new TextField();
	private Label genderLabel = new Label("Model:");
	private TextField modTextField = new TextField();
	private Label addressLabel = new Label("Storage:");
	private TextField storTextField = new TextField();
	private Label phoneLabel = new Label("Price:");
	private TextField priceTextField = new TextField();
	private Button okButton = new Button("OK");
	private Button closeButton = new Button("Close");

	UpdateComputer() {
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setPadding(new Insets(20));

		Image backgroundImage = new Image("compu.png");
		BackgroundSize backgroundSize = new BackgroundSize(600, 380, false, false, false, false);
		BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, backgroundSize);

		gridPane.setBackground(new Background(background));
		// Label and TextField for ID
		idLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
//	idTextField.setEditable(false);
		// Label and TextField for Name
		nameLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
//	colorTextField.setEditable(false);
		// Label and TextField for Age
		ageLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
//	cpuTextField.setEditable(false);

		// Label and TextField for Email
		emailLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
//	ramTextField.setEditable(false);

		// Label and RadioButtons for Gender
		genderLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
//	modTextField.setEditable(false);

		// Label and TextField for Address
		addressLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
//	storTextField.setEditable(false);

		// Label and TextField for phone
		phoneLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
//	priceTextField.setEditable(false);
//
//	// Label and TextField for type
//	Label shopLabel = new Label("Shop name:");
//	shopLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
//	TextField shopTextField = new TextField();
//	shopTextField.setEditable(false);

		// Add labels and text fields to the gridPane
		gridPane.add(idLabel, 0, 0);
		gridPane.add(idTextField, 1, 0);

		gridPane.add(nameLabel, 0, 1);
		gridPane.add(colorTextField, 1, 1);

		gridPane.add(ageLabel, 0, 2);
		gridPane.add(cpuTextField, 1, 2);

		gridPane.add(emailLabel, 0, 3);
		gridPane.add(ramTextField, 1, 3);

		gridPane.add(genderLabel, 0, 4);
		gridPane.add(modTextField, 1, 4);

		gridPane.add(addressLabel, 0, 5);
		gridPane.add(storTextField, 1, 5);

		gridPane.add(phoneLabel, 0, 6);
		gridPane.add(priceTextField, 1, 6);

//	gridPane.add(shopLabel, 0, 7);
//	gridPane.add(shopTextField, 1, 7);

		okButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		okButton.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 80px; " + "-fx-min-height: 15px; "
				+ "-fx-max-width: 80px; " + "-fx-max-height: 40px; " + "-fx-background-color: black;");
		okButton.setTextFill(Color.WHITE);
//        okButton.setOnAction(e -> );

		closeButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		closeButton.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 80px; " + "-fx-min-height: 15px; "
				+ "-fx-max-width: 80px; " + "-fx-max-height: 40px; " + "-fx-background-color: black;");
		closeButton.setTextFill(Color.WHITE);
//	closeButton.setOnAction(e -> detailsStage.close());

		gridPane.add(okButton, 2, 9, 2, 1);
		gridPane.add(closeButton, 0, 9, 4, 1);

//	Scene scene = new Scene(gridPane, 600, 380);
	}

	public GridPane getGridPane() {
		return gridPane;
	}

	public void setGridPane(GridPane gridPane) {
		this.gridPane = gridPane;
	}

	public Label getIdLabel() {
		return idLabel;
	}

	public void setIdLabel(Label idLabel) {
		this.idLabel = idLabel;
	}

	public TextField getIdTextField() {
		return idTextField;
	}

	public void setIdTextField(TextField idTextField) {
		this.idTextField = idTextField;
	}

	public Label getNameLabel() {
		return nameLabel;
	}

	public void setNameLabel(Label nameLabel) {
		this.nameLabel = nameLabel;
	}

	public TextField getColorTextField() {
		return colorTextField;
	}

	public void setColorTextField(TextField colorTextField) {
		this.colorTextField = colorTextField;
	}

	public Label getAgeLabel() {
		return ageLabel;
	}

	public void setAgeLabel(Label ageLabel) {
		this.ageLabel = ageLabel;
	}

	public TextField getCpuTextField() {
		return cpuTextField;
	}

	public void setCpuTextField(TextField cpuTextField) {
		this.cpuTextField = cpuTextField;
	}

	public Label getEmailLabel() {
		return emailLabel;
	}

	public void setEmailLabel(Label emailLabel) {
		this.emailLabel = emailLabel;
	}

	public TextField getRamTextField() {
		return ramTextField;
	}

	public void setRamTextField(TextField ramTextField) {
		this.ramTextField = ramTextField;
	}

	public Label getGenderLabel() {
		return genderLabel;
	}

	public void setGenderLabel(Label genderLabel) {
		this.genderLabel = genderLabel;
	}

	public TextField getModTextField() {
		return modTextField;
	}

	public void setModTextField(TextField modTextField) {
		this.modTextField = modTextField;
	}

	public Label getAddressLabel() {
		return addressLabel;
	}

	public void setAddressLabel(Label addressLabel) {
		this.addressLabel = addressLabel;
	}

	public TextField getStorTextField() {
		return storTextField;
	}

	public void setStorTextField(TextField storTextField) {
		this.storTextField = storTextField;
	}

	public Label getPhoneLabel() {
		return phoneLabel;
	}

	public void setPhoneLabel(Label phoneLabel) {
		this.phoneLabel = phoneLabel;
	}

	public TextField getPriceTextField() {
		return priceTextField;
	}

	public void setPriceTextField(TextField priceTextField) {
		this.priceTextField = priceTextField;
	}

	public Button getOkButton() {
		return okButton;
	}

	public void setOkButton(Button okButton) {
		this.okButton = okButton;
	}

	public Button getCloseButton() {
		return closeButton;
	}

	public void setCloseButton(Button closeButton) {
		this.closeButton = closeButton;
	}
	
}
