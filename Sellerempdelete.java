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
public class Sellerempdelete {
	private GridPane gridPane = new GridPane();
	private Label idLabel = new Label("Seller ID:");
	private TextField idTextField = new TextField();
	private Label nameLabel = new Label("Name:");
	private TextField nameTextField = new TextField();
	private Label ageLabel = new Label("Age:");
	private TextField ageTextField = new TextField();
	private Label emailLabel = new Label("Email:");
	private TextField emailTextField = new TextField();
	private Label genderLabel = new Label("Gender:");
	private TextField genderTextField = new TextField();
	private Label addressLabel = new Label("Address:");
	private TextField addressTextField = new TextField();
	private Label phoneLabel = new Label("Phone:");
	private TextField phoneTextField = new TextField();
	private Label shopLabel = new Label("Shop name:");
	private TextField shopTextField = new TextField();
	private Button okButton = new Button("OK");
	private Button closeButton = new Button("Close");

	Sellerempdelete() {
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setPadding(new Insets(20));

		Image backgroundImage = new Image("reps.png");
		BackgroundSize backgroundSize = new BackgroundSize(400, 400, false, false, false, false);
		BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, backgroundSize);

		gridPane.setBackground(new Background(background));
		// Create a Text element to display a message
		// Label and TextField for ID
		idLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		idTextField.setEditable(false);

		// Label and TextField for Name
		nameLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		nameTextField.setEditable(false);
		// Label and TextField for Age
		ageLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		ageTextField.setEditable(false);

		// Label and TextField for Email
		emailLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		emailTextField.setEditable(false);

		// Label and RadioButtons for Gender
		genderLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		genderTextField.setEditable(false);

		// Label and TextField for Address
		addressLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		addressTextField.setEditable(false);

		// Label and TextField for phone
		phoneLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		phoneTextField.setEditable(false);

		shopLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		shopTextField.setEditable(false);

		// Add labels and text fields to the gridPane
		gridPane.add(idLabel, 0, 0);
		gridPane.add(idTextField, 1, 0);

		gridPane.add(nameLabel, 0, 1);
		gridPane.add(nameTextField, 1, 1);

		gridPane.add(ageLabel, 0, 2);
		gridPane.add(ageTextField, 1, 2);

		gridPane.add(emailLabel, 0, 3);
		gridPane.add(emailTextField, 1, 3);

		gridPane.add(genderLabel, 0, 4);
		gridPane.add(genderTextField, 1, 4);

		gridPane.add(addressLabel, 0, 5);
		gridPane.add(addressTextField, 1, 5);

		gridPane.add(phoneLabel, 0, 6);
		gridPane.add(phoneTextField, 1, 6);

		gridPane.add(shopLabel, 0, 7);
		gridPane.add(shopTextField, 1, 7);

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

//	Scene scene = new Scene(gridPane, 400, 400);
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

	public TextField getNameTextField() {
		return nameTextField;
	}

	public void setNameTextField(TextField nameTextField) {
		this.nameTextField = nameTextField;
	}

	public Label getAgeLabel() {
		return ageLabel;
	}

	public void setAgeLabel(Label ageLabel) {
		this.ageLabel = ageLabel;
	}

	public TextField getAgeTextField() {
		return ageTextField;
	}

	public void setAgeTextField(TextField ageTextField) {
		this.ageTextField = ageTextField;
	}

	public Label getEmailLabel() {
		return emailLabel;
	}

	public void setEmailLabel(Label emailLabel) {
		this.emailLabel = emailLabel;
	}

	public TextField getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(TextField emailTextField) {
		this.emailTextField = emailTextField;
	}

	public Label getGenderLabel() {
		return genderLabel;
	}

	public void setGenderLabel(Label genderLabel) {
		this.genderLabel = genderLabel;
	}

	public TextField getGenderTextField() {
		return genderTextField;
	}

	public void setGenderTextField(TextField genderTextField) {
		this.genderTextField = genderTextField;
	}

	public Label getAddressLabel() {
		return addressLabel;
	}

	public void setAddressLabel(Label addressLabel) {
		this.addressLabel = addressLabel;
	}

	public TextField getAddressTextField() {
		return addressTextField;
	}

	public void setAddressTextField(TextField addressTextField) {
		this.addressTextField = addressTextField;
	}

	public Label getPhoneLabel() {
		return phoneLabel;
	}

	public void setPhoneLabel(Label phoneLabel) {
		this.phoneLabel = phoneLabel;
	}

	public TextField getPhoneTextField() {
		return phoneTextField;
	}

	public void setPhoneTextField(TextField phoneTextField) {
		this.phoneTextField = phoneTextField;
	}

	public Label getShopLabel() {
		return shopLabel;
	}

	public void setShopLabel(Label shopLabel) {
		this.shopLabel = shopLabel;
	}

	public TextField getShopTextField() {
		return shopTextField;
	}

	public void setShopTextField(TextField shopTextField) {
		this.shopTextField = shopTextField;
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
