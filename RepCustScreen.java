import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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

public class RepCustScreen {
	private GridPane gridPane= new GridPane();
	private Label idLabel,colorLabel,ramLabel ,cpuLabel ,modelLabel ,storageLabel,typeLabel;
	private TextField  idTextField,colorTextField,ramTextField ,cpuTextField  ,typeTextField;
    private ComboBox<String> ramComboBox, cpuComboBox, modelTextField, storageComboBox;
    private Button okButton,closeButton;
    
    RepCustScreen(){
    	gridPane.setHgap(20);
		gridPane.setVgap(15);
		gridPane.setPadding(new Insets(20));

		// Add the following lines to set the background image
		Image backgroundImage = new Image("rrep.jpeg");
		BackgroundSize backgroundSize = new BackgroundSize(600, 380, false, false, false, false);
		BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, backgroundSize);

//	        BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, null);

		gridPane.setBackground(new Background(background));

	   idLabel = new Label("Computer serial Number:");
		idLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		idLabel.setTextFill(Color.WHITE);

		 idTextField = new TextField();

		 colorLabel = new Label("Color:");
		colorLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		colorLabel.setTextFill(Color.WHITE);

		 colorTextField = new TextField();

		 ramLabel = new Label("RAM:");
		ramLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		ramLabel.setTextFill(Color.WHITE);
//	        TextField ramTextField = new TextField();
		 ramComboBox = new ComboBox<>(FXCollections.observableArrayList(
		       "8GB RAM", "16GB RAM",
		        "32GB RAM", "64GB RAM", "128GB RAM", "256GB RAM", "512GB RAM", "1TB RAM", "2TB RAM"
		));

		 cpuLabel = new Label("CPU:");
		cpuLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		cpuLabel.setTextFill(Color.WHITE);
//	        TextField cpuTextField = new TextField();
	 cpuComboBox = new ComboBox<>(FXCollections.observableArrayList("CISC", "RISC", "EPIC ",
				"Desktop CPUs", "Desktop CPUs", "Server CPUs", "Mobile CPUs", "Embedded CPUs", "Single-Core CPUs",
				"Dual-Core CPUs", "	Quad-Core CPUs", "Multi-Core CPUs", "Multi-Processor CPUs", "Intel CPUs",
				"AMD CPUs", "	GPU (Graphics Processing Unit)", "AI Processors"));

	 modelLabel = new Label("Model:");
		modelLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		modelLabel.setTextFill(Color.WHITE);
		 modelTextField = new ComboBox<>(
				FXCollections.observableArrayList("Dell XPS"
						, "HP Pavilion"
						, "Lenovo ThinkPad"
						, "Apple MacBook Air"
						, "ASUS ROG Strix"
						, "Acer Aspire"
						, "Microsoft Surface Pro"
						, "MSI Gaming Laptop"
						, "Alienware"
						, "Lenovo Legion"
						, "HP Spectre"
						, "Dell Inspiron"
						, "MacBook Pro"
						, "ASUS ZenBook"
						, "Microsoft Surface Laptop"
						, "Acer Predator"
						, "Dell Precision"
						, "Lenovo Yoga"
						,"HP Envy"
						, "Toshiba Satellite"));

//		TextField modelTextField = new TextField();

	 storageLabel = new Label("Storage:");
		storageLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		storageLabel.setTextFill(Color.WHITE);

//	        TextField storageTextField = new TextField();
		 storageComboBox = new ComboBox<>(FXCollections.observableArrayList(
		        "28GB Storage", "256GB Storage", "512GB Storage", "1TB Storage", "2TB Storage",
		        "4TB Storage", "8TB Storage", "16TB Storage"
		));


		// Label and TextField for type
	 typeLabel = new Label("Repair Type:");
		typeLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		typeLabel.setTextFill(Color.WHITE);

	 typeTextField = new TextField();
//            ComboBox<String> typeComboBox = new ComboBox<>(FXCollections.observableArrayList("Hardware", "Software"));

		// Add labels and text fields to the gridPane
		gridPane.add(idLabel, 0, 0);
		gridPane.add(idTextField, 1, 0);

		gridPane.add(colorLabel, 0, 1);
		gridPane.add(colorTextField, 1, 1);

		gridPane.add(ramLabel, 0, 2);
		gridPane.add(ramComboBox, 1, 2);

		gridPane.add(cpuLabel, 0, 3);
		gridPane.add(cpuComboBox, 1, 3);

		gridPane.add(modelLabel, 0, 4);
		gridPane.add(modelTextField, 1, 4);

		gridPane.add(storageLabel, 0, 6);
		gridPane.add(storageComboBox, 1, 6);

		gridPane.add(typeLabel, 0, 7);
		gridPane.add(typeTextField, 1, 7);

	 okButton = new Button("OK");
		okButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		okButton.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 80px; " + "-fx-min-height: 15px; "
				+ "-fx-max-width: 80px; " + "-fx-max-height: 40px; " + "-fx-background-color: black;");
		okButton.setTextFill(Color.WHITE);
//	        okButton.setOnAction(e -> );

		 closeButton = new Button("Close");
		closeButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		closeButton.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 80px; " + "-fx-min-height: 15px; "
				+ "-fx-max-width: 80px; " + "-fx-max-height: 40px; " + "-fx-background-color: black;");
		closeButton.setTextFill(Color.WHITE);
		//closeButton.setOnAction(e -> detailsStage.close());

		gridPane.add(okButton, 1, 10, 2, 1);
		gridPane.add(closeButton, 0, 10, 4, 1);
    	
    }

	public GridPane getGridPane() {
		return gridPane;
	}

	public Label getIdLabel() {
		return idLabel;
	}

	public Label getColorLabel() {
		return colorLabel;
	}

	public Label getRamLabel() {
		return ramLabel;
	}

	public Label getCpuLabel() {
		return cpuLabel;
	}

	public Label getModelLabel() {
		return modelLabel;
	}

	public Label getStorageLabel() {
		return storageLabel;
	}

	public Label getTypeLabel() {
		return typeLabel;
	}

	public TextField getIdTextField() {
		return idTextField;
	}

	public TextField getColorTextField() {
		return colorTextField;
	}

	public TextField getRamTextField() {
		return ramTextField;
	}

	public TextField getCpuTextField() {
		return cpuTextField;
	}

	public TextField getTypeTextField() {
		return typeTextField;
	}

	public ComboBox<String> getRamComboBox() {
		return ramComboBox;
	}

	public ComboBox<String> getCpuComboBox() {
		return cpuComboBox;
	}

	public ComboBox<String> getModelTextField() {
		return modelTextField;
	}

	public ComboBox<String> getStorageComboBox() {
		return storageComboBox;
	}

	public Button getOkButton() {
		return okButton;
	}

	public Button getCloseButton() {
		return closeButton;
	}

	public void setGridPane(GridPane gridPane) {
		this.gridPane = gridPane;
	}

	public void setIdLabel(Label idLabel) {
		this.idLabel = idLabel;
	}

	public void setColorLabel(Label colorLabel) {
		this.colorLabel = colorLabel;
	}

	public void setRamLabel(Label ramLabel) {
		this.ramLabel = ramLabel;
	}

	public void setCpuLabel(Label cpuLabel) {
		this.cpuLabel = cpuLabel;
	}

	public void setModelLabel(Label modelLabel) {
		this.modelLabel = modelLabel;
	}

	public void setStorageLabel(Label storageLabel) {
		this.storageLabel = storageLabel;
	}

	public void setTypeLabel(Label typeLabel) {
		this.typeLabel = typeLabel;
	}

	public void setIdTextField(TextField idTextField) {
		this.idTextField = idTextField;
	}

	public void setColorTextField(TextField colorTextField) {
		this.colorTextField = colorTextField;
	}

	public void setRamTextField(TextField ramTextField) {
		this.ramTextField = ramTextField;
	}

	public void setCpuTextField(TextField cpuTextField) {
		this.cpuTextField = cpuTextField;
	}

	public void setTypeTextField(TextField typeTextField) {
		this.typeTextField = typeTextField;
	}

	public void setRamComboBox(ComboBox<String> ramComboBox) {
		this.ramComboBox = ramComboBox;
	}

	public void setCpuComboBox(ComboBox<String> cpuComboBox) {
		this.cpuComboBox = cpuComboBox;
	}

	public void setModelTextField(ComboBox<String> modelTextField) {
		this.modelTextField = modelTextField;
	}

	public void setStorageComboBox(ComboBox<String> storageComboBox) {
		this.storageComboBox = storageComboBox;
	}

	public void setOkButton(Button okButton) {
		this.okButton = okButton;
	}

	public void setCloseButton(Button closeButton) {
		this.closeButton = closeButton;
	}
    
}
