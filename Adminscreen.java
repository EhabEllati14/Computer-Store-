
public class Adminscreen {
//	private GridPane additionalPane;
//	Stage additionalStage = new Stage();
//	Stage removeShopStage = new Stage();
//	Stage removeComputerStage = new Stage();
//	String cellStyle = "-fx-control-inner-background: darkblue; -fx-table-cell-border-color: black;-fx-table-cell-border-color: darkturquoise;";
//	String style = "-fx-background-radius: 10em; " + "-fx-min-width: 150px; " + "-fx-min-height: 15px; "
//			+ "-fx-max-width: 150px; " + "-fx-max-height: 40px; " + "-fx-background-color: darkturquoise;";
//
//	public ShopInterface() {
//		Stage stage = new Stage();
//		additionalStage = new Stage(); // Initialize additionalStage
//		additionalPane = createAdditionalPane(); // Initialize additionalPane
//		// Create a TabPane
//		TabPane tabPane = new TabPane();
//
//		// Create three tabs
//		Tab shopTab = createShopTab();
//		Tab customerTabe = createCustomerTab();
//		Tab sellerEmp = new Tab(" Seller ");// done
//		Tab repairEmp = new Tab(" Repair ");
//		Tab order = createMixed2Tab();
//		Tab Services = createMixedTab();
//		Tab computerTab = createComputerTab();
//		// Apply styling to the Shop tab
//		sellerEmp.setContent(SellerInterFace());
//		repairEmp.setContent(RepairInterFace());
//
//		// Apply styling to the TabPane
//		tabPane.setStyle("-fx-background-color: white; " + "-fx-text-fill: white; ");
//		// Add tabs to the TabPane
//		tabPane.getTabs().addAll(shopTab, customerTabe, computerTab, sellerEmp, repairEmp, order, Services);
//
//		// Create a scene and set it on the stage
//		Scene scene = new Scene(tabPane, 700, 580);
//		stage.setTitle("Shop Interface");
//		stage.setScene(scene);
//		stage.show();
//	}
//
//	private void createRemoveShopStage() {
//		removeShopStage = new Stage();
//		GridPane removeShopPane = createRemoveShopPane();
//		removeShopStage.setTitle("Remove Shop");
//		removeShopStage.setScene(new Scene(removeShopPane, 300, 150));
//
//		removeShopStage.show();
//	}
//
//	private void createAdditionalStage() {
//		additionalPane = createAdditionalPane();
//
//		additionalStage = new Stage(); // Create a new instance of additionalStage
//		additionalStage.setTitle("Additional Pane");
//		additionalStage.setScene(new Scene(additionalPane, 300, 150));
//		additionalStage.show();
//	}
//
//	private GridPane createRemoveShopPane() {
//		// Create labels, text fields, and an "OK" button
//		Label removeShopLabel = new Label("Enter the shop name:");
//		TextField shopNameTextField = new TextField();
//
//		Button removeShopOkButton = new Button("OK");
//		removeShopOkButton.setOnAction(event -> removeShopStage.close());
//		removeShopOkButton.setStyle(style);
//		// Create the additional pane (GridPane) for removing a shop
//		GridPane removeShopPane = new GridPane();
//		removeShopPane.addRow(0, removeShopLabel, shopNameTextField);
//		removeShopPane.add(removeShopOkButton, 0, 1, 2, 1);
//
//		// Apply styling to the additional pane for removing a shop
//		removeShopPane.setStyle("-fx-background-color: black; " + "-fx-text-fill: white; ");
//
//		// Apply styling to labels and text fields
//		for (Node node : removeShopPane.getChildren()) {
//			if (node instanceof Labeled) {
//				((Labeled) node).setTextFill(Color.WHITE);
//			} else if (node instanceof TextField) {
//				((TextField) node).setStyle("-fx-control-inner-background: white;");
//			}
//		}
//
//		// Set padding and spacing
//		removeShopPane.setPadding(new Insets(10));
//		removeShopPane.setHgap(10);
//		removeShopPane.setVgap(10);
//
//		return removeShopPane;
//	}
//
//	private Tab createCustomerTab() {
//		// Create TableView and columns for customers
//		TableView<CustomerData> customerTableView = new TableView<>();
//		TableColumn<CustomerData, String> customerNameColumn = new TableColumn<>("Customer Name");
//		TableColumn<CustomerData, String> customerAddressColumn = new TableColumn<>("Address");
//		TableColumn<CustomerData, String> customerIdColumn = new TableColumn<>("Customer ID");
//		TableColumn<CustomerData, String> customerPhoneColumn = new TableColumn<>("Customer Phone");
//		TableColumn<CustomerData, String> customerPasswordColumn = new TableColumn<>("Customer Password");
//
//		customerNameColumn.setCellValueFactory(new PropertyValueFactory<>("customerName"));
//		customerAddressColumn.setCellValueFactory(new PropertyValueFactory<>("customerAddress"));
//		customerIdColumn.setCellValueFactory(new PropertyValueFactory<>("customerId"));
//		customerPhoneColumn.setCellValueFactory(new PropertyValueFactory<>("customerPhone"));
//		customerPasswordColumn.setCellValueFactory(new PropertyValueFactory<>("customerPassword"));
//
//		customerTableView.getColumns().addAll(customerNameColumn, customerAddressColumn, customerIdColumn,
//				customerPhoneColumn, customerPasswordColumn);
//
//		// Apply styling to the TableView
//		customerTableView.setStyle(cellStyle);
//		// Set preferred widths for each column
//		customerNameColumn.setPrefWidth(150); // Adjust as needed
//		customerIdColumn.setPrefWidth(120);
//		customerPhoneColumn.setPrefWidth(150);
//		customerPasswordColumn.setPrefWidth(150);
//		// Apply styling to the TableView columns
//		for (TableColumn<CustomerData, ?> column : customerTableView.getColumns()) {
//			column.setStyle("-fx-background-color: white; -fx-text-fill: white;");
//		}
//
//		// Create a VBox to hold the customer TableView
//		VBox vbox = new VBox(customerTableView);
//		vbox.setSpacing(15);
//
//		// Create a Tab and set its content
//		Tab customerTab = new Tab("Customer");
//		customerTab.setContent(vbox);
//
//		return customerTab;
//	}
//
//	private Tab createMixed2Tab() {
//		// Create TableView and columns for mixed data
//		TableView<Mixed2> mixedTableView = new TableView<>();
//		TableColumn<Mixed2, String> custNameColumn = new TableColumn<>("Customer Name");
//		TableColumn<Mixed2, String> customerIdColumn = new TableColumn<>("Customer ID");
//		TableColumn<Mixed2, String> sellerIdColumn = new TableColumn<>("Seller ID");
//		TableColumn<Mixed2, String> serialNumColumn = new TableColumn<>("Serial Number");
//		TableColumn<Mixed2, String> sellerNameColumn = new TableColumn<>("Seller Name");
//		TableColumn<Mixed2, String> modelColumn = new TableColumn<>("Model");
//		TableColumn<Mixed2, Double> priceColumn = new TableColumn<>("Price");
//
//		custNameColumn.setCellValueFactory(new PropertyValueFactory<>("custName"));
//		customerIdColumn.setCellValueFactory(new PropertyValueFactory<>("customerId"));
//		sellerIdColumn.setCellValueFactory(new PropertyValueFactory<>("sellerId"));
//		serialNumColumn.setCellValueFactory(new PropertyValueFactory<>("serialNum"));
//		sellerNameColumn.setCellValueFactory(new PropertyValueFactory<>("sellerName"));
//		modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
//		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
//
//		mixedTableView.getColumns().addAll(custNameColumn, customerIdColumn, sellerIdColumn, serialNumColumn,
//				sellerNameColumn, modelColumn, priceColumn);
//
//		// Apply styling to the TableView
//		mixedTableView.setStyle(cellStyle);
//
//		serialNumColumn.setPrefWidth(120);
//
//		// Apply styling to the TableView columns
//		for (TableColumn<Mixed2, ?> column : mixedTableView.getColumns()) {
//			column.setStyle("-fx-background-color: white; -fx-text-fill: white;");
//		}
//
//		// Create a VBox to hold the mixed TableView
//		VBox vbox = new VBox(mixedTableView);
//		vbox.setSpacing(15);
//
//		// Create a Tab and set its content
//		Tab mixedTab = new Tab("Sold Computers");
//		mixedTab.setContent(vbox);
//
//		return mixedTab;
//	}
//
//	private Tab createComputerTab() {
//		// Create TableView and columns for computers
//		TableView<Computer> computerTableView = new TableView<>();
//		TableColumn<Computer, String> colorColumn = new TableColumn<>("Color");
//		TableColumn<Computer, String> cpuColumn = new TableColumn<>("CPU");
//		TableColumn<Computer, Integer> ramColumn = new TableColumn<>("RAM");
//		TableColumn<Computer, String> modelColumn = new TableColumn<>("Model");
//		TableColumn<Computer, Integer> storageColumn = new TableColumn<>("Storage");
//		TableColumn<Computer, String> serialNumColumn = new TableColumn<>("Serial Number");
//		TableColumn<Computer, Double> priceColumn = new TableColumn<>("Price");
//
//		colorColumn.setCellValueFactory(new PropertyValueFactory<>("color"));
//		cpuColumn.setCellValueFactory(new PropertyValueFactory<>("cpu"));
//		ramColumn.setCellValueFactory(new PropertyValueFactory<>("ram"));
//		modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
//		storageColumn.setCellValueFactory(new PropertyValueFactory<>("storage"));
//		serialNumColumn.setCellValueFactory(new PropertyValueFactory<>("serialnum"));
//		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
//
//		computerTableView.getColumns().addAll(colorColumn, cpuColumn, ramColumn, modelColumn, storageColumn,
//				serialNumColumn, priceColumn);
//
//		// Apply styling to the TableView
//		computerTableView.setStyle(cellStyle);
//
//		serialNumColumn.setPrefWidth(120);
//
//		// Apply styling to the TableView columns
//		for (TableColumn<Computer, ?> column : computerTableView.getColumns()) {
//			column.setStyle("-fx-background-color: white; -fx-text-fill: white;");
//		}
//
//		// Create a VBox to hold the computer TableView
//		VBox vbox = new VBox(computerTableView);
//		vbox.setSpacing(15);
//
//		// Create a Tab and set its content
//		Tab computerTab = new Tab("Computer");
//		computerTab.setContent(vbox);
//
//		return computerTab;
//	}
//
//	private Tab createMixedTab() {
//		// Create TableView and columns for mixed data
//		TableView<Mixed> mixedTableView = new TableView<>();
//		TableColumn<Mixed, String> repNameColumn = new TableColumn<>("Rep Name");
//		TableColumn<Mixed, String> custNameColumn = new TableColumn<>("Cust Name");
//		TableColumn<Mixed, String> custIdColumn = new TableColumn<>("Cust ID");
//		TableColumn<Mixed, String> serialNumColumn = new TableColumn<>("Serial Number");
//		TableColumn<Mixed, String> repIdColumn = new TableColumn<>("Rep ID");
//
//		repNameColumn.setCellValueFactory(new PropertyValueFactory<>("repName"));
//		custNameColumn.setCellValueFactory(new PropertyValueFactory<>("custName"));
//		custIdColumn.setCellValueFactory(new PropertyValueFactory<>("custId"));
//		serialNumColumn.setCellValueFactory(new PropertyValueFactory<>("serialNum"));
//		repIdColumn.setCellValueFactory(new PropertyValueFactory<>("repId"));
//
//		mixedTableView.getColumns().addAll(repNameColumn, custNameColumn, custIdColumn, serialNumColumn, repIdColumn);
//
//		// Apply styling to the TableView
//		mixedTableView.setStyle(cellStyle);
//
//		serialNumColumn.setPrefWidth(120);
//
//		// Apply styling to the TableView columns
//		for (TableColumn<Mixed, ?> column : mixedTableView.getColumns()) {
//			column.setStyle("-fx-background-color: white; -fx-text-fill: black;");
//		}
//
//		// Create labels
//		Label titleLabel = createStyledLabel("Repair Employee Work List");
//		Label subTitleLabel = createSubTitleLabel("These are the services which have to Repair");
//		Label bottomLabel = createSubTitleLabel("Select the row you want to reject it");
//
//		// Create a VBox to organize labels
//		VBox labelsVBox = new VBox();
//		labelsVBox.setAlignment(Pos.CENTER_LEFT);
//		labelsVBox.setSpacing(10);
//		labelsVBox.getChildren().add(titleLabel);
//		labelsVBox.getChildren().add(subTitleLabel);
//		labelsVBox.getChildren().add(mixedTableView);
//		labelsVBox.getChildren().add(bottomLabel);
//
//		// Create a Tab and set its content
//		Tab mixedTab = new Tab(" Repair Employee Services");
//		mixedTab.setContent(labelsVBox);
//
//		return mixedTab;
//	}
//
//	private Label createStyledLabel(String text) {
//		Label label = new Label(text);
//		label.setFont(Font.font("Arial", FontWeight.BOLD, 20));
//		label.setStyle("-fx-text-fill: Black;");
//		return label;
//	}
//
//	private Label createSubTitleLabel(String text) {
//		Label label = new Label(text);
//		label.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
//		label.setStyle("-fx-text-fill: Black;");
//		return label;
//	}
//
//	public static class CustomerData {
//		private String customerName;
//		private String customerAddress;
//		private String customerId;
//		private String customerPhone;
//		private String customerPassword;
//
//		public CustomerData(String customerName, String customerAddress, String customerId, String customerPhone,
//				String customerPassword) {
//			this.customerName = customerName;
//			this.customerAddress = customerAddress;
//			this.customerId = customerId;
//			this.customerPhone = customerPhone;
//			this.customerPassword = customerPassword;
//		}
//
//		// Getters for customer data
//		public String getCustomerName() {
//			return customerName;
//		}
//
//		public String getCustomerAddress() {
//			return customerAddress;
//		}
//
//		public String getCustomerId() {
//			return customerId;
//		}
//
//		public String getCustomerPhone() {
//			return customerPhone;
//		}
//
//		public String getCustomerPassword() {
//			return customerPassword;
//		}
//	}
//
//	public VBox RepairInterFace() {
//		Stage stage = new Stage();
//		// Create TableView and columns
//
//		TableView<RepEmployee> tableView = new TableView<>();
//		TableColumn<RepEmployee, String> empeemailColumn = new TableColumn<>("Email");
//		TableColumn<RepEmployee, String> empphoneColumn = new TableColumn<>("Phone Number");
//		TableColumn<RepEmployee, String> sellidColumn = new TableColumn<>("Repair ID");
//		TableColumn<RepEmployee, Integer> empageColumn = new TableColumn<>("Age");
//		TableColumn<RepEmployee, String> empaddressColumn = new TableColumn<>("Address");
//		TableColumn<RepEmployee, String> empnameColumn = new TableColumn<>("Name");
//		TableColumn<RepEmployee, String> ShopnameColumn = new TableColumn<>("Shop Name");
//		TableColumn<RepEmployee, String> empgenderColumn = new TableColumn<>("Gender");
//
//		empeemailColumn.setCellValueFactory(new PropertyValueFactory<>("Email"));
//		empphoneColumn.setCellValueFactory(new PropertyValueFactory<>("Phone Number"));
//		sellidColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
//		empageColumn.setCellValueFactory(new PropertyValueFactory<>("Age"));
//		empaddressColumn.setCellValueFactory(new PropertyValueFactory<>("Address"));
//		empnameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
//		ShopnameColumn.setCellValueFactory(new PropertyValueFactory<>("Computer Name"));
//		empgenderColumn.setCellValueFactory(new PropertyValueFactory<>("Gender"));
//
//		tableView.getColumns().addAll(empeemailColumn, empphoneColumn, sellidColumn, empageColumn, empaddressColumn,
//				empnameColumn, ShopnameColumn, empgenderColumn);
//		empphoneColumn.setPrefWidth(150);
//		// Apply styling to the TableView
//		tableView.setStyle(cellStyle);
//
//		// Apply styling to the TableView columns
//		for (TableColumn<RepEmployee, ?> column : tableView.getColumns()) {
//			column.setStyle("-fx-background-color: white; -fx-text-fill: white;");
//		}
//
//		// Ensure additionalPane is initialized before adding it to the VBox
//		VBox vbox = new VBox(tableView);
//		vbox.setSpacing(15);
//
//		// Create a Back button
//		Button backButton = new Button("Back");
//		backButton.setAlignment(Pos.CENTER);
//		// Add event handler for the Back button
//		backButton.setOnAction(event -> {
//			// Handle back button action (e.g., switch to another scene)
//			System.out.println("Back button clicked");
//		});
//
//		backButton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
//		backButton.setMinSize(150, 50);
//		backButton.setStyle(style);
//		backButton.setTextFill(Color.WHITE);
//		// Add the Back button to the bottom of the VBox
//		vbox.getChildren().add(backButton);
//
//		return vbox;
//
//	}
//
//	private Tab createShopTab() {
//		// Create TableView and columns
//		TableView<ShopData> tableView = new TableView<>();
//		TableColumn<ShopData, String> shopNameColumn = new TableColumn<>("Shop Name");
//		TableColumn<ShopData, String> phoneNumberColumn = new TableColumn<>("Phone Number");
//		TableColumn<ShopData, String> addressColumn = new TableColumn<>("Address");
//
//		shopNameColumn.setCellValueFactory(new PropertyValueFactory<>("shopName"));
//		phoneNumberColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
//		addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
//
//		tableView.getColumns().addAll(shopNameColumn, phoneNumberColumn, addressColumn);
//		shopNameColumn.setPrefWidth(150); // Adjust as needed
//		phoneNumberColumn.setPrefWidth(150); // Adjust as needed
//		addressColumn.setPrefWidth(150); // Adjust as needed
//
//		tableView.setStyle(cellStyle);
//
//		// Apply styling to the TableView columns
//		for (TableColumn<ShopData, ?> column : tableView.getColumns()) {
//			column.setStyle("-fx-background-color: white; -fx-text-fill: white;");
//		}
//
//		// Create buttons
//		Button button1 = new Button("Add Shop");
//		Button button2 = new Button("Remove Shop");
//		Button button3 = new Button("Update Shop");
//		Button button4 = new Button("Add Employee");
//		Button button5 = new Button("Remove Employee");
//		Button button6 = new Button("Update Employee");
//		button1.setMinSize(150, 50);
//		button1.setStyle(style);
//
//		button2.setMinSize(150, 50);
//		button2.setStyle(style);
//
//		button3.setMinSize(150, 50);
//		button3.setStyle(style);
//
//		button6.setMinSize(150, 50);
//		button6.setStyle(style);
//
//		button4.setMinSize(150, 50);
//		button4.setStyle(style);
//
//		button5.setMinSize(150, 50);
//		button5.setStyle(style);
//		// Create HBoxes and VBox
//		HBox hbox1 = new HBox(button1, button2, button3);
//		HBox hbox2 = new HBox(button4, button5, button6);
//		hbox1.setSpacing(10);
//		hbox2.setSpacing(10);
//
//		// Ensure additionalPane is initialized before adding it to the VBox
//		VBox vbox = new VBox(tableView, hbox1, hbox2);
//		vbox.setSpacing(15);
//
//		hbox1.setAlignment(Pos.CENTER);
//		hbox2.setAlignment(Pos.CENTER);
//
//		// Create a Back button
//		Button backButton = new Button("Back");
//		backButton.setAlignment(Pos.CENTER);
//		// Add event handler for the Back button
//		backButton.setOnAction(event -> {
//			// Handle back button action (e.g., switch to another scene)
//			System.out.println("Back button clicked");
//		});
//		backButton.setMinSize(150, 50);
//		backButton.setStyle(style);
//		// Add the Back button to the bottom of the VBox
//		vbox.getChildren().add(backButton);
//
//		button1.setOnAction(event -> {
//			showAdditionalPane();
//			createAdditionalStage();
//			additionalStage.setTitle("Add A Shop");
//
//		});
//		button2.setOnAction(event -> {
//			createRemoveShopStage();
//		});
//
//		button3.setOnAction(event -> {
//			showAdditionalPane();
//			createAdditionalStage();
//			additionalStage.setTitle("Update A Shop");
//
//		});
//		// Create a Tab and set its content
//		Tab shopTab = new Tab("Shop");
//		shopTab.setContent(vbox);
//
//		return shopTab; // Updated here
//	}
//
//	private GridPane createAdditionalPane() {
//		// Create labels, text fields, and an "OK" button
//		Label label1 = new Label("Name :");
//		Label label2 = new Label("Phone :");
//		Label label3 = new Label("Address :");
//
//		TextField textField1 = new TextField();
//		TextField textField2 = new TextField();
//		TextField textField3 = new TextField();
//
//		Button okButton = new Button("OK");
//		okButton.setOnAction(event -> handleOkButton());
//
//		// Create the additional pane (GridPane)
//		GridPane gridPane = new GridPane();
//		gridPane.addRow(0, label1, textField1);
//		gridPane.addRow(1, label2, textField2);
//		gridPane.addRow(2, label3, textField3);
//		gridPane.add(okButton, 0, 3, 2, 1); // Span the "OK" button across two columns
//
//		// Apply styling to the additional pane
//		gridPane.setStyle("-fx-background-color: black; " + "-fx-text-fill: white; ");
//
//		// Apply styling to labels and text fields
//		for (Node node : gridPane.getChildren()) {
//			if (node instanceof Labeled) {
//				((Labeled) node).setTextFill(Color.WHITE);
//			} else if (node instanceof TextField) {
//				((TextField) node).setStyle("-fx-control-inner-background: white;");
//			}
//		}
//
//		// Set padding and spacing
//		gridPane.setPadding(new Insets(10));
//		gridPane.setHgap(10);
//		gridPane.setVgap(10);
//
//		return gridPane;
//	}
//
//	private void showAdditionalPane() {
//		additionalPane.setVisible(true);
//	}
//
//	private void handleOkButton() {
//		additionalStage.close();
//	}
//
//	public VBox SellerInterFace() {
//		Stage stage = new Stage();
//		// Create TableView and columns
//
//		TableView<SellerEmp> tableView = new TableView<>();
//		TableColumn<SellerEmp, String> empeemailColumn = new TableColumn<>("Email");
//		TableColumn<SellerEmp, String> empphoneColumn = new TableColumn<>("Phone Number");
//		TableColumn<SellerEmp, String> sellidColumn = new TableColumn<>("Seller ID");
//		TableColumn<SellerEmp, Integer> empageColumn = new TableColumn<>("Age");
//		TableColumn<SellerEmp, String> empaddressColumn = new TableColumn<>("Address");
//		TableColumn<SellerEmp, String> empnameColumn = new TableColumn<>("Name");
//		TableColumn<SellerEmp, String> ShopnameColumn = new TableColumn<>("Shop Name");
//		TableColumn<SellerEmp, String> empgenderColumn = new TableColumn<>("Gender");
//
//		tableView.setStyle(cellStyle);
//		empeemailColumn.setCellValueFactory(new PropertyValueFactory<>("Email"));
//		empphoneColumn.setCellValueFactory(new PropertyValueFactory<>("Phone Number"));
//		sellidColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
//		empageColumn.setCellValueFactory(new PropertyValueFactory<>("Age"));
//		empaddressColumn.setCellValueFactory(new PropertyValueFactory<>("Address"));
//		empnameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
//		ShopnameColumn.setCellValueFactory(new PropertyValueFactory<>("Computer Name"));
//		empgenderColumn.setCellValueFactory(new PropertyValueFactory<>("Gender"));
//
//		tableView.getColumns().addAll(empeemailColumn, empphoneColumn, sellidColumn, empageColumn, empaddressColumn,
//				empnameColumn, ShopnameColumn, empgenderColumn);
//		empphoneColumn.setPrefWidth(150);
//		// Apply styling to the TableView
//		tableView.setStyle(cellStyle);
//
//		// Apply styling to the TableView columns
//		for (TableColumn<SellerEmp, ?> column : tableView.getColumns()) {
//			column.setStyle("-fx-background-color: white; -fx-text-fill: white;");
//		}
//
//		// Create buttons
//		Button button1 = new Button("Add computer");
//		Button button2 = new Button("Remove computer");
//		Button button3 = new Button("Update computer");
//		button1.setMinSize(150, 50);
//		button1.setStyle(style);
//
//		button2.setMinSize(150, 50);
//		button2.setStyle(style);
//
//		button3.setMinSize(150, 50);
//		button3.setStyle(style);
//
//		// Create HBoxes and VBox
//		HBox hbox1 = new HBox(button1, button2, button3);
//		hbox1.setSpacing(10);
//
//		// Ensure additionalPane is initialized before adding it to the VBox
//		VBox vbox = new VBox(tableView, hbox1);
//		vbox.setSpacing(15);
//
//		hbox1.setAlignment(Pos.CENTER);
//
//		// Create a Back button
//		Button backButton = new Button("Back");
//		backButton.setAlignment(Pos.CENTER);
//		// Add event handler for the Back button
//		backButton.setOnAction(event -> {
//			// Handle back button action (e.g., switch to another scene)
//			System.out.println("Back button clicked");
//		});
//		backButton.setMinSize(150, 50);
//		backButton.setStyle(style);
//		// Add the Back button to the bottom of the VBox
//		vbox.getChildren().add(backButton);
//
//		button1.setOnAction(event -> {
//
//		});
//		button2.setOnAction(event -> {
//			createRemoveComputerStage();
//		});
//
//		button3.setOnAction(event -> {
//
//		});
//
//		return vbox;
//
//	}
//
//	private void createRemoveComputerStage() {
//		removeComputerStage = new Stage();
//		GridPane removeComputerPane = createRemoveComputerPane();
//		removeComputerStage.setTitle("Remove Computer");
//		removeComputerStage.setScene(new Scene(removeComputerPane, 300, 150));
//
//		removeComputerStage.show();
//	}
//
//	private GridPane createRemoveComputerPane() {
//		// Create labels, text fields, and an "OK" button
//		Label removeComputerLabel = new Label("Enter the computer Serial number:");
//		TextField ComputerNameTextField = new TextField();
//
//		Button removeComputerOkButton = new Button("OK");
//		removeComputerOkButton.setOnAction(event -> removeComputerStage.close());
//		removeComputerOkButton.setStyle(style);
//
//		// Create the additional pane (GridPane) for removing a Computer
//		GridPane removeComputerPane = new GridPane();
//		removeComputerPane.addRow(0, removeComputerLabel, ComputerNameTextField);
//		removeComputerPane.add(removeComputerOkButton, 0, 1, 2, 1);
//
//		// Apply styling to the additional pane for removing a Computer
//		removeComputerPane.setStyle("-fx-background-color: black; " + "-fx-text-fill: white; ");
//
//		// Apply styling to labels and text fields
//		for (Node node : removeComputerPane.getChildren()) {
//			if (node instanceof Labeled) {
//				((Labeled) node).setTextFill(Color.WHITE);
//			} else if (node instanceof TextField) {
//				((TextField) node).setStyle("-fx-control-inner-background: white;");
//			}
//		}
//
//		// Set padding and spacing
//		removeComputerPane.setPadding(new Insets(10));
//		removeComputerPane.setHgap(10);
//		removeComputerPane.setVgap(10);
//
//		return removeComputerPane;
//	}
//
//	public static class ShopData {
//		private String shopName;
//		private String phoneNumber;
//		private String address;
//
//		public ShopData(String shopName, String phoneNumber, String address) {
//			this.shopName = shopName;
//			this.phoneNumber = phoneNumber;
//			this.address = address;
//		}
//
//		public String getShopName() {
//			return shopName;
//		}
//
//		public String getPhoneNumber() {
//			return phoneNumber;
//		}
//
//		public String getAddress() {
//			return address;
//		}
//	}
//

}
