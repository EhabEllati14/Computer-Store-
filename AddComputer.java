
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
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

public class AddComputer {
	private GridPane gridPane = new GridPane();
	private Label idLabel = new Label("Computer serial Number:");
	private TextField idTextField = new TextField();
	private Label colorLabel = new Label("Color:");
	private TextField colorTextField = new TextField();
	private Label ramLabel = new Label("RAM:");
	private Label cpuLabel = new Label("CPU:");
	private Label modelLabel = new Label("Model:");
	private Label storageLabel = new Label("Storage:");
	private Label priceLabel = new Label("Price:");
	private TextField priceTextField = new TextField();
	private Button okButton = new Button("OK");
	private Button closeButton = new Button("Close");
	private ComboBox<String> ramComboBox, cpuComboBox, modelTextField, storageComboBox;

	AddComputer() {
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setPadding(new Insets(20));

		// Add the following lines to set the background image
		Image backgroundImage = new Image("compu.png");
		BackgroundSize backgroundSize = new BackgroundSize(600, 380, false, false, false, false);
		BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, backgroundSize);

//	        BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, null);

		gridPane.setBackground(new Background(background));

		idLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		idLabel.setTextFill(Color.BLUE);

		colorLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		colorLabel.setTextFill(Color.BLUE);

		ramLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		ramLabel.setTextFill(Color.BLUE);
//	        TextField ramTextField = new TextField();
		ramComboBox = new ComboBox<>(FXCollections.observableArrayList("256MB RAM", "512MB RAM", "1GB RAM", "2GB RAM",
				"4GB RAM", "8GB RAM", "16GB RAM", "32GB RAM", "64GB RAM", "128GB RAM", "256GB RAM", "512GB RAM",
				"1TB RAM", "2TB RAM", "4TB RAM", "8TB RAM", "16TB RAM"));

		cpuLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		cpuLabel.setTextFill(Color.BLUE);
//	        TextField cpuTextField = new TextField();
		cpuComboBox = new ComboBox<>(FXCollections.observableArrayList("CISC", "RISC", "EPIC ", "Desktop CPUs",
				"Desktop CPUs", "Server CPUs", "Mobile CPUs", "Embedded CPUs", "Single-Core CPUs", "Dual-Core CPUs",
				"	Quad-Core CPUs", "Multi-Core CPUs", "Multi-Processor CPUs", "Intel CPUs", "AMD CPUs",
				"	GPU (Graphics Processing Unit)", "AI Processors"));

		modelLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		modelLabel.setTextFill(Color.BLUE);

//		TextField modelTextField = new TextField();
		modelTextField = new ComboBox<>(FXCollections.observableArrayList("Dell XPS", "HP Pavilion", "Lenovo ThinkPad",
				"Apple MacBook Air", "ASUS ROG Strix", "Acer Aspire", "Microsoft Surface Pro", "MSI Gaming Laptop",
				"Alienware", "Lenovo Legion", "HP Spectre", "Dell Inspiron", "MacBook Pro", "ASUS ZenBook",
				"Microsoft Surface Laptop", "Acer Predator", "Dell Precision", "Lenovo Yoga", "HP Envy",
				"Toshiba Satellite"));

		storageLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		storageLabel.setTextFill(Color.BLUE);

//	        TextField storageTextField = new TextField();
		storageComboBox = new ComboBox<>(FXCollections.observableArrayList("28GB Storage", "256GB Storage",
				"512GB Storage", "1TB Storage", "2TB Storage", "4TB Storage", "8TB Storage", "16TB Storage"));

		// Label and TextField for type
		priceLabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		priceLabel.setTextFill(Color.BLUE);

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

		gridPane.add(priceLabel, 0, 7);
		gridPane.add(priceTextField, 1, 7);

		okButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		okButton.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 80px; " + "-fx-min-height: 15px; "
				+ "-fx-max-width: 80px; " + "-fx-max-height: 40px; " + "-fx-background-color: black;");
		okButton.setTextFill(Color.WHITE);
//	        okButton.setOnAction(e -> );

		closeButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		closeButton.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 80px; " + "-fx-min-height: 15px; "
				+ "-fx-max-width: 80px; " + "-fx-max-height: 40px; " + "-fx-background-color: black;");
		closeButton.setTextFill(Color.WHITE);
//		closeButton.setOnAction(e -> detailsStage.close());

		gridPane.add(okButton, 1, 10, 2, 1);
		gridPane.add(closeButton, 0, 10, 4, 1);

//		Scene scene = new Scene(gridPane, 600, 380);
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

	public Label getColorLabel() {
		return colorLabel;
	}

	public void setColorLabel(Label colorLabel) {
		this.colorLabel = colorLabel;
	}

	public TextField getColorTextField() {
		return colorTextField;
	}

	public void setColorTextField(TextField colorTextField) {
		this.colorTextField = colorTextField;
	}

	public Label getRamLabel() {
		return ramLabel;
	}

	public void setRamLabel(Label ramLabel) {
		this.ramLabel = ramLabel;
	}

	public Label getCpuLabel() {
		return cpuLabel;
	}

	public void setCpuLabel(Label cpuLabel) {
		this.cpuLabel = cpuLabel;
	}

	public Label getModelLabel() {
		return modelLabel;
	}

	public void setModelLabel(Label modelLabel) {
		this.modelLabel = modelLabel;
	}

	public Label getStorageLabel() {
		return storageLabel;
	}

	public void setStorageLabel(Label storageLabel) {
		this.storageLabel = storageLabel;
	}

	public Label getPriceLabel() {
		return priceLabel;
	}

	public void setPriceLabel(Label priceLabel) {
		this.priceLabel = priceLabel;
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

	public ComboBox<String> getRamComboBox() {
		return ramComboBox;
	}

	public void setRamComboBox(ComboBox<String> ramComboBox) {
		this.ramComboBox = ramComboBox;
	}

	public ComboBox<String> getCpuComboBox() {
		return cpuComboBox;
	}

	public void setCpuComboBox(ComboBox<String> cpuComboBox) {
		this.cpuComboBox = cpuComboBox;
	}

	public ComboBox<String> getModelTextField() {
		return modelTextField;
	}

	public void setModelTextField(ComboBox<String> modelTextField) {
		this.modelTextField = modelTextField;
	}

	public ComboBox<String> getStorageComboBox() {
		return storageComboBox;
	}

	public void setStorageComboBox(ComboBox<String> storageComboBox) {
		this.storageComboBox = storageComboBox;
	}
	
}