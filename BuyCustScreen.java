//import application.HuffTable;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class BuyCustScreen {
	private TableView<ComputerTable> tableView;
	private ComboBox<String> colorFilter,ramFilter,cpuFilter,pricec;
	private Button addToCartButton,closeButton;
	private Label l,txt;
	private BorderPane borderPane= new BorderPane();
	private VBox centerPane= new VBox(10);
	private VBox filtersAndButtons = new VBox(10);
	private TextField emp;
	
	BuyCustScreen(){
		Image backgroundImage = new Image("cus.png");
		BackgroundSize backgroundSize = new BackgroundSize(1040, 500, false, false, false, false);
		BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, backgroundSize);

		TableColumn<ComputerTable, String> colorColumn = new TableColumn<>("Color");
		colorColumn.setCellValueFactory(new PropertyValueFactory<ComputerTable, String>("color"));

		TableColumn<ComputerTable, String>cpuColumn = new TableColumn<>("CPU");
		cpuColumn.setCellValueFactory(new PropertyValueFactory<ComputerTable, String>("cpu"));

		TableColumn<ComputerTable, Integer> ramColumn = new TableColumn<>("RAM");
		ramColumn.setCellValueFactory(new PropertyValueFactory<ComputerTable, Integer>("ram"));

		TableColumn<ComputerTable, String> serialNumberColumn = new TableColumn<>("Serial Number");
		serialNumberColumn.setCellValueFactory(new PropertyValueFactory<ComputerTable, String>("serialnum"));

		TableColumn<ComputerTable, String> modelColumn = new TableColumn<>("Model");
		modelColumn.setCellValueFactory(new PropertyValueFactory<ComputerTable, String>("model"));

		TableColumn<ComputerTable,Integer> storageColumn = new TableColumn<>("Storage");
		storageColumn.setCellValueFactory(new PropertyValueFactory<ComputerTable, Integer>("storage"));

		TableColumn<ComputerTable, Double> priceColumn = new TableColumn<>("Price");
		priceColumn.setCellValueFactory(new PropertyValueFactory<ComputerTable,  Double>("price"));
		// Create TableView
		 tableView = new TableView<>();
		tableView.getColumns().addAll(colorColumn, ramColumn, cpuColumn, serialNumberColumn, modelColumn, storageColumn,
				priceColumn);
// Populate TableView with sample data
		
//		tableView.setStyle("-fx-control-inner-background: darkturquoise; -fx-table-cell-border-color: darkturquoise;");
		String cellStyle = "-fx-control-inner-background: darkblue; -fx-table-cell-border-color: black;-fx-table-cell-border-color: darkturquoise;";

		tableView.setStyle(cellStyle);

		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		String style = "-fx-background-radius: 10em; " + "-fx-min-width: 150px; " + "-fx-min-height: 15px; "
				+ "-fx-max-width: 150px; " + "-fx-max-height: 40px; " + "-fx-background-color: darkturquoise;";
// Create ComboBox filters
		 colorFilter = new ComboBox<>();
		colorFilter.setPromptText("Color");
		colorFilter.setStyle(style);

//		colorFilter.setTextFill(Color.WHITE);
		 ramFilter = new ComboBox<>();
		ramFilter.setPromptText("RAM");
		ramFilter.setStyle(style);

		cpuFilter = new ComboBox<>();
		cpuFilter.setPromptText("CPU");
		cpuFilter.setStyle(style);

		 emp = new TextField();
		 emp.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
		 emp.setMinWidth(300);
		 emp.setMinHeight(40);
		 emp.setStyle(style);

	    pricec = new ComboBox<>();
		pricec.setPromptText("Price");
		pricec.setStyle(style);

// Create buttons
		addToCartButton = new Button("Add to Cart");
		addToCartButton.setStyle(style);

//		addToCartButton.setOnAction(e -> {
//			handleSelectionChange(tableView);
//			tableView.refresh();
//		});

	    closeButton = new Button("Close");
		closeButton.setStyle(style);

// Set actions for buttons
//		addToCartButton.setOnAction(e -> addToCartAction());
		//closeButton.setOnAction(e -> detailsStage.close());

	 l = new Label("Filters:");
		l.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		l.setTextFill(Color.WHITE);
		filtersAndButtons.getChildren().addAll(l, colorFilter, ramFilter, cpuFilter, emp, pricec, addToCartButton,
				closeButton);
		filtersAndButtons.setPadding(new Insets(10));

// Create BorderPane for the main layout

		 borderPane = new BorderPane();
		borderPane.setBackground(new Background(background));

		 txt = new Label("This is the available computers in the store");
//		borderPane.setCenter(txt);
		txt.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 24));
		txt.setTextFill(Color.WHITE);
//		borderPane.setCenter(createCenterPane(tableView));
		 centerPane.getChildren().addAll(txt, tableView);
		borderPane.setCenter(centerPane);
		borderPane.setRight(filtersAndButtons);

	}

	public TableView<ComputerTable> getTableView() {
		return tableView;
	}

	public ComboBox<String> getColorFilter() {
		return colorFilter;
	}

	public ComboBox<String> getRamFilter() {
		return ramFilter;
	}

	public ComboBox<String> getCpuFilter() {
		return cpuFilter;
	}

	public ComboBox<String> getPricec() {
		return pricec;
	}

	public Button getAddToCartButton() {
		return addToCartButton;
	}

	public Button getCloseButton() {
		return closeButton;
	}

	public Label getL() {
		return l;
	}

	public Label getTxt() {
		return txt;
	}

	public BorderPane getBorderPane() {
		return borderPane;
	}

	public VBox getCenterPane() {
		return centerPane;
	}

	public VBox getFiltersAndButtons() {
		return filtersAndButtons;
	}

	public TextField getEmp() {
		return emp;
	}

	public void setTableView(TableView<ComputerTable> tableView) {
		this.tableView = tableView;
	}

	public void setColorFilter(ComboBox<String> colorFilter) {
		this.colorFilter = colorFilter;
	}

	public void setRamFilter(ComboBox<String> ramFilter) {
		this.ramFilter = ramFilter;
	}

	public void setCpuFilter(ComboBox<String> cpuFilter) {
		this.cpuFilter = cpuFilter;
	}

	public void setPricec(ComboBox<String> pricec) {
		this.pricec = pricec;
	}

	public void setAddToCartButton(Button addToCartButton) {
		this.addToCartButton = addToCartButton;
	}

	public void setCloseButton(Button closeButton) {
		this.closeButton = closeButton;
	}

	public void setL(Label l) {
		this.l = l;
	}

	public void setTxt(Label txt) {
		this.txt = txt;
	}

	public void setBorderPane(BorderPane borderPane) {
		this.borderPane = borderPane;
	}

	public void setCenterPane(VBox centerPane) {
		this.centerPane = centerPane;
	}

	public void setFiltersAndButtons(VBox filtersAndButtons) {
		this.filtersAndButtons = filtersAndButtons;
	}

	public void setEmp(TextField emp) {
		this.emp = emp;
	}
	
}

