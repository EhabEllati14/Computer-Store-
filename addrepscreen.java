import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class addrepscreen {
	private GridPane gridPane = new GridPane();
	private Label  idLabel,nameLabel,ageLabel,emailLabel,genderLabel,addressLabel,phoneLabel,shopLabel;
	private Button okButton,closeButton;
	private TextField idTextField,nameTextField,ageTextField,emailTextField,genderTextField,addressTextField,phoneTextField,shopTextField;
    private ToggleGroup genderToggleGroup;
    private RadioButton maleRadioButton,femaleRadioButton;
    
    addrepscreen(){
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20));

        Image backgroundImage = new Image("empadd.png");
		BackgroundSize backgroundSize = new BackgroundSize(500, 450, false, false, false, false);
		BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, backgroundSize);
		gridPane.setBackground(new Background(background));
        // Label and TextField for ID
        // Label and TextField for ID
         idLabel = new Label("Rep ID:");
        idLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
       idLabel.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
         idTextField = new TextField();
        
        // Label and TextField for Name
         nameLabel = new Label("Name:");
        nameLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
       nameLabel.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
         nameTextField = new TextField();

        // Label and TextField for Age
        ageLabel = new Label("Age:");
        ageLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
       ageLabel.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
        ageTextField = new TextField();

        // Label and TextField for Email
        emailLabel = new Label("Email:");
        emailLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
       emailLabel.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
        emailTextField = new TextField();
       
     // Label and RadioButtons for Gender
        genderLabel = new Label("Gender:");
        genderLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
        genderLabel.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
       genderToggleGroup = new ToggleGroup();
         maleRadioButton = new RadioButton("Male");
        maleRadioButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 15));
        maleRadioButton.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
         femaleRadioButton = new RadioButton("Female");
        femaleRadioButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 15));
        femaleRadioButton.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");

        maleRadioButton.setToggleGroup(genderToggleGroup);
        femaleRadioButton.setToggleGroup(genderToggleGroup);
        
//        maleRadioButton.setOnAction(e -> updateRadioButtonText(maleRadioButton, femaleRadioButton));
//        femaleRadioButton.setOnAction(e -> updateRadioButtonText(femaleRadioButton, maleRadioButton));
        // Label and TextField for Address
        addressLabel = new Label("Address:");
        addressLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
        addressTextField = new TextField();
        addressLabel.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
        // Label and TextField for phone
        phoneLabel = new Label("Phone:");
        phoneLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
        phoneLabel.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
       
        phoneTextField = new TextField();
        
        // Label and TextField for type
     
        
        // Label and TextField for type
        shopLabel = new Label("Shop Name:");
        shopLabel.setStyle(
				"-fx-font-size: 20px; -fx-background-color: linear-gradient(to bottom right, #FF69B4, #87CEEB); -fx-text-fill: white;");
        shopLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
       shopTextField = new TextField();
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
        gridPane.add(maleRadioButton, 1, 4);
        gridPane.add(femaleRadioButton, 2, 4);
        
        gridPane.add(addressLabel, 0, 5);
        gridPane.add(addressTextField, 1, 5);
        
        gridPane.add(phoneLabel, 0, 6);
        gridPane.add(phoneTextField, 1, 6);

        gridPane.add(shopLabel, 0, 7);
        gridPane.add(shopTextField, 1, 7);
        
        okButton = new Button("OK");
        okButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
        okButton.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 80px; " + "-fx-min-height: 15px; "
				+ "-fx-max-width: 80px; " + "-fx-max-height: 40px; " + "-fx-background-color: black;");
        okButton.setTextFill(Color.WHITE);
//        okButton.setOnAction(e -> );
        
         closeButton = new Button("Close");
        closeButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
        closeButton.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 80px; " + "-fx-min-height: 15px; "
				+ "-fx-max-width: 80px; " + "-fx-max-height: 40px; " + "-fx-background-color: black;");
        closeButton.setTextFill(Color.WHITE);
     //   closeButton.setOnAction(e -> detailsStage.close());
        
        gridPane.add(okButton, 1, 10, 2, 1);
        gridPane.add(closeButton, 0, 10, 4, 1);
    }

	public GridPane getGridPane() {
		return gridPane;
	}

	public Label getIdLabel() {
		return idLabel;
	}

	public Label getNameLabel() {
		return nameLabel;
	}

	public Label getAgeLabel() {
		return ageLabel;
	}

	public Label getEmailLabel() {
		return emailLabel;
	}

	public Label getGenderLabel() {
		return genderLabel;
	}

	public Label getAddressLabel() {
		return addressLabel;
	}

	public Label getPhoneLabel() {
		return phoneLabel;
	}

	public Label getShopLabel() {
		return shopLabel;
	}

	public Button getOkButton() {
		return okButton;
	}

	public Button getCloseButton() {
		return closeButton;
	}

	public TextField getIdTextField() {
		return idTextField;
	}

	public TextField getNameTextField() {
		return nameTextField;
	}

	public TextField getAgeTextField() {
		return ageTextField;
	}

	public TextField getEmailTextField() {
		return emailTextField;
	}

	public TextField getGenderTextField() {
		return genderTextField;
	}

	public TextField getAddressTextField() {
		return addressTextField;
	}

	public TextField getPhoneTextField() {
		return phoneTextField;
	}

	public TextField getShopTextField() {
		return shopTextField;
	}

	public ToggleGroup getGenderToggleGroup() {
		return genderToggleGroup;
	}

	public RadioButton getMaleRadioButton() {
		return maleRadioButton;
	}

	public RadioButton getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public void setGridPane(GridPane gridPane) {
		this.gridPane = gridPane;
	}

	public void setIdLabel(Label idLabel) {
		this.idLabel = idLabel;
	}

	public void setNameLabel(Label nameLabel) {
		this.nameLabel = nameLabel;
	}

	public void setAgeLabel(Label ageLabel) {
		this.ageLabel = ageLabel;
	}

	public void setEmailLabel(Label emailLabel) {
		this.emailLabel = emailLabel;
	}

	public void setGenderLabel(Label genderLabel) {
		this.genderLabel = genderLabel;
	}

	public void setAddressLabel(Label addressLabel) {
		this.addressLabel = addressLabel;
	}

	public void setPhoneLabel(Label phoneLabel) {
		this.phoneLabel = phoneLabel;
	}

	public void setShopLabel(Label shopLabel) {
		this.shopLabel = shopLabel;
	}

	public void setOkButton(Button okButton) {
		this.okButton = okButton;
	}

	public void setCloseButton(Button closeButton) {
		this.closeButton = closeButton;
	}

	public void setIdTextField(TextField idTextField) {
		this.idTextField = idTextField;
	}

	public void setNameTextField(TextField nameTextField) {
		this.nameTextField = nameTextField;
	}

	public void setAgeTextField(TextField ageTextField) {
		this.ageTextField = ageTextField;
	}

	public void setEmailTextField(TextField emailTextField) {
		this.emailTextField = emailTextField;
	}

	public void setGenderTextField(TextField genderTextField) {
		this.genderTextField = genderTextField;
	}

	public void setAddressTextField(TextField addressTextField) {
		this.addressTextField = addressTextField;
	}

	public void setPhoneTextField(TextField phoneTextField) {
		this.phoneTextField = phoneTextField;
	}

	public void setShopTextField(TextField shopTextField) {
		this.shopTextField = shopTextField;
	}

	public void setGenderToggleGroup(ToggleGroup genderToggleGroup) {
		this.genderToggleGroup = genderToggleGroup;
	}

	public void setMaleRadioButton(RadioButton maleRadioButton) {
		this.maleRadioButton = maleRadioButton;
	}

	public void setFemaleRadioButton(RadioButton femaleRadioButton) {
		this.femaleRadioButton = femaleRadioButton;
	}
    
}
