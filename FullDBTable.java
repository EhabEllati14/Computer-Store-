
import static javafx.stage.Modality.NONE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.converter.IntegerStringConverter;

/**
 * A JavaFX ConnectDB Application
 */
public class FullDBTable extends Application {
	/**
	 * @param args the command line arguments
	 * 
	 * 
	 */
	public ArrayList<Product> data;
	public static ArrayList<Customer> custlist= new ArrayList<>();
	public static HashMap<String, Customer> cushash = new HashMap<>();
	public static HashMap<String, Computer> comphash = new HashMap<>();
	public static HashMap<String, Shop> shophash = new HashMap<>();
	public static HashMap<String, SellerEmp> sellemphash = new HashMap<>();
	public static HashMap<String, RepEmp> repemphash= new HashMap<>();
	public static HashMap<String,Buys> buyhash = new HashMap<>();
	public static HashMap<String,Services>servicehash= new HashMap<>();
	private ObservableList<Product> dataList;

	private String dbURL;
	private String dbUsername = "root";
	private String dbPassword = "EhaboEllati142142";
	private String URL = "127.0.0.1";
	private String port = "3306";
	private String dbName = "sac";
	private Connection con;
	String passwordd="enmcomputerstore2024";
	
	public static Customer customer;// when we do login

	MainPage mainpage = new MainPage();
	Passwordscreen password = new Passwordscreen();
	signcust sign = new signcust();
	createaccount create = new createaccount();
	custidscreendelete deletecus = new custidscreendelete();
	customerdeleteinformation delinfo = new customerdeleteinformation();
	updatecustscreen custup = new updatecustscreen();
	customerupdateinformation custinfo = new customerupdateinformation();
	custchoose custchoose = new custchoose();
	BuyCustScreen buyscreen = new BuyCustScreen();
	RepCustScreen repscreen = new RepCustScreen();
	chooseaddemployee chooseaddemp = new chooseaddemployee();
	addrepscreen addrepscr = new addrepscreen();
	addsellempscreen addsellscr = new addsellempscreen();
	
	Stage stage1 = new Stage();
	Stage stage2 = new Stage();
	Stage stage3 = new Stage();
	Stage stage4 = new Stage();
	Stage stage5 = new Stage();
	Stage stage6 = new Stage();
	Stage stage7 = new Stage();
	Stage stage8 = new Stage();
	Stage stage9 = new Stage();
	Stage stage10 = new Stage();
	Stage stage11 = new Stage();
	Stage stage12 = new Stage();
	Stage stage13 = new Stage();
	Stage stage14 = new Stage();
	
	

	
	
	
	
	Scene scene1 = new Scene(mainpage.getGp(),1250,600);
	Scene scene2 = new Scene(password.getAdmingp(),700,300);
	Scene scene3 = new Scene(sign.getGp(),1100,400);
	Scene scene4 = new Scene(create.getBord(),650,400);
	Scene scene5 = new Scene(deletecus.getBorder(),500,200);
	Scene scene6 = new Scene(delinfo.getBord(),650,400);
	Scene scene7 = new Scene(custup.getBorder(),500,200);
	Scene scene8 = new Scene(custinfo.getBord(),650,400);
	Scene scene9 = new Scene(custchoose.getVbox(),600,380);
	Scene scene10 = new Scene(buyscreen.getBorderPane(),1040,500);
	Scene scene11 = new Scene(repscreen.getGridPane(),600,420);
	Scene scene12 = new Scene(chooseaddemp.getVbox(),400,300);
	Scene scene13= new Scene(addrepscr.getGridPane(),500,450);
	Scene scene14 = new Scene(addsellscr.getGridPane(),500,450);
	
	@Override
	public void start(Stage stage) {
//		stage14.setScene(scene14);
//		stage14.show();
		//showAlert("hello") ;//for warning !!!!
		try {
		custchoose.getBuyRadio().setOnAction(e->{
			stage10.setScene(scene10);
			stage10.show();
			custchoose.getBuyRadio().setTextFill(Color.RED);
			custchoose.getRepairaRadio().setTextFill(Color.WHITE);
		});
		custchoose.getRepairaRadio().setOnAction(e->{
			stage11.setScene(scene11);
			stage11.show();
			custchoose.getRepairaRadio().setTextFill(Color.RED);
			custchoose.getBuyRadio().setTextFill(Color.WHITE);
		});
		
			getDatacustomer();
			getDatacomputer();
			
			 for (Map.Entry<String, Customer> entry : cushash.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue().getName());
		        }
			 
			 for (Map.Entry<String, Computer> entry : comphash.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue().getIsrepair());
		        }
			 
			 getDatashop();
			 getDatasellemp();
			 System.out.println(" names data+++++++++++++++++");
			 for (Map.Entry<String, SellerEmp> entry :sellemphash.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue().getEmpname());
		        }
			 System.out.println(" names data+++++++++++++++++");
			 
			 
			//Services s = new Services("1211567","1122","dc12");
			
			//insertDataServices(s);
			
//			Buys b = new Buys("1211567","1234","dc12");
//			insertDataBuys(b);
			
//			 Shop p = new Shop("ENM SHOPPING","1212","rmamam");
//			 insertShop(p);
		//	 SellerEmp empsell = new SellerEmp("1234","ehab",28,"ellatiehab@gmail.com","0568722661","tierh","Male","ENM SHOPPING");
			// deleteSelleremp(empsell);
			// deleteshop(p);
			//insertDataSelleremp(empsell);
		//	updateSellEmp("1234",13);
			// updateSellEmpgender("1234", "female");
//			 updateSellEmpname("1234","nadia") ;
//			 RepEmp rep = new RepEmp("1212","hebo",19,"ahmderasi@gmail.com","05535353","masyon","male","ENM SHOPPING");
//			 insertDataRepEmp(rep);
			 
			 
			 ////////////////////////////////////////////////////////////
//			 getDataRepEmp();
//			 System.out.println("----------------------------------");
//			 for (Map.Entry<String, RepEmp> entry :repemphash.entrySet()) {
//		            System.out.println(entry.getKey() + ": " + entry.getValue().getEmpname());
//		        }
//			 System.out.println("----------------------------------");
//			 RepEmp empsell = new RepEmp("1122","ehab",28,"ellatiehab@gmail.com","0568722661","tierh","Male","ENM SHOPPING");
//			insertDataRepEmp(empsell);
			 
			 
		data = new ArrayList<>();
		stage1.setScene(scene1);
		stage1.show();
		password.getMassg().setText(null);
		mainpage.getAdminbutton().setOnAction(e->{
		stage2.setScene(scene2);
		stage2.show();
		});
		password.getPass().setOnMouseClicked(e->{
			password.getPass().setText(null);
			password.getMassg().setText(null);
		});
		password.getOk().setOnAction(e->{
			if(password.getPass().getText().equals(passwordd)) {
				password.getPass().setText(null);
				password.getMassg().setText(null);
				stage2.close();
			}
			else {
				password.getMassg().setText("Please Try Again");
				password.getPass().setText(null);
			}
		});
		password.getMain().setOnAction(e->{
			stage2.close();
		});
		
		mainpage.getCusserbutton().setOnAction(e->{
			sign.getUseridpass().setText(null);
			sign.getPassword().setText(null);
			stage3.setScene(scene3);
			stage3.show();
		});
		
		
		sign.getShow1().setOnAction(e->{
			 if (sign.getShow1().isSelected()) {
				 sign.getUseridpass().setPromptText(sign.getUseridpass().getText());
				 sign.getUseridpass().setText("");
	            } else {
	            	sign.getUseridpass().setText(sign.getUseridpass().getPromptText());
	            	sign.getUseridpass().setPromptText("Password");
	            }
		});
		
		
		sign.getShow2().setOnAction(e->{
			 if (sign.getShow2().isSelected()) {
				 sign.getPassword().setPromptText(sign.getPassword().getText());
				 sign.getPassword().setText("");
	            } else {
	            	sign.getPassword().setText(sign.getPassword().getPromptText());
	            	sign.getPassword().setPromptText("Password");
	            }
		});
		
		sign.getSignin().setOnAction(e->{
			stage3.close();
			sign.getPassword().setText(null);
			sign.getUseridpass().setText(null);
			stage4.setScene(scene4);
			stage4.show();
		});
		
		sign.getLoginbutton().setOnAction(e->{
			//check if the customer is exist
			//check if id is string ot digit
			// check if one of the feilds is empty 
		});
		create.getOk().setOnAction(e->{
			 System.out.println("id len "+create.getIdtxt().getText().length());
			 System.out.println("ph len "+create.getPhonetxt().getText().length());
			if (create.getNametxt().getText().isEmpty() || 
				    create.getAddtxt().getText().isEmpty() || 
				    create.getIdtxt().getText().isEmpty() || 
				    create.getPhonetxt().getText().isEmpty() || 
				    create.getPass().getText().isEmpty()) {
				   System.out.println("theres empty fields");
				}
             else if(create.getIdtxt().getText().length()>7 ||create.getIdtxt().getText().length()<7 ) {
				System.out.println("the id must be 7 numbers only");
			}
             else if(create.getPhonetxt().getText().length() < 10 ||create.getPhonetxt().getText().length()>10) {
            	 System.out.println("the phone num  must be 10 numbers only");
            	 
             }
			else if(isOnlyDigits(create.getIdtxt().getText())==false || isOnlyDigits(create.getPhonetxt().getText())==false){
				System.out.println("is not digit");
			}
			else if(isOnlyDigits(create.getPass().getText())==true || isOnlyCharacters(create.getPass().getText())) {
				System.out.println("the password must have letters and digits ");
			}
			else if(cushash.containsKey(create.getIdtxt().getText())) {
				System.out.println("the id is already exists");
			}
			else {
				String cname=create.getNametxt().getText().trim();
				String caddress=create.getAddtxt().getText().trim();
				String cid= create.getIdtxt().getText().trim();
				String cphone = create.getPhonetxt().getText().trim();
				String cpassword=create.getPass().getText().trim();
				Customer c = new Customer(cname,caddress,cid,cphone,cpassword);
				insertDatacustomer(c);
				// screen we add the account sussefuly !!
				create.getNametxt().setText(null);
				create.getAddtxt().setText(null);
				create.getIdtxt().setText(null);
				create.getPhonetxt().setText(null);
				create.getPass().setText(null);
				stage4.close();
				cushash.put(c.getCustid(), c);
			}
		});
		
		
		sign.getDelete().setOnAction(e->{
			stage5.setScene(scene5);
			stage5.show();
		});
		
	   sign.getLoginbutton().setOnAction(e->{
		   if(sign.getUseridpass().getText().isEmpty()==true || sign.getPassword().getText().isEmpty()==true) {
			   System.out.print("emptyfields");
		   }
		   else if(cushash.containsKey(sign.getUseridpass().getText())==false) {
			 System.out.println("The id is not exist") ;
		   }
		   else {
		   Customer c= cushash.get(sign.getUseridpass().getText());
			if(c.getPassword().equals(sign.getPassword().getText())) {
				// you can login
				stage9.setScene(scene9);
				stage9.show();
				System.out.println("correct password");
			}
			else {
				//screen error password
				System.out.println("password errorr");
			}
		   }
	   });

		
		deletecus.getShow().setOnAction(e->{
			 if (deletecus.getShow().isSelected()) {
				 deletecus.getPassid().setPromptText(deletecus.getPassid().getText());
				 sign.getPassword().setText("");
	            } else {
	            	deletecus.getPassid().setText(deletecus.getPassid().getPromptText());
	            	deletecus.getPassid().setPromptText("Password");
	            }
			 });
		
		deletecus.getCancel().setOnAction(e->{
			stage5.close();
		});
		
		deletecus.getOk().setOnAction(e->{
			if(cushash.containsKey(deletecus.getPassid().getText().trim())) {
				System.out.println("here");
				Customer c=cushash.get(deletecus.getPassid().getText().trim());
				delinfo.getNametxt().setText(c.getName());
				delinfo.getAddtxt().setText(c.getAddress());
				delinfo.getIdtxt().setText(c.getCustid());
				delinfo.getPhonetxt().setText(c.getPhonenum());
				delinfo.getPassword().setText(c.getPassword());
				stage6.setScene(scene6);
	stage6.show();
			}
			else {
				System.out.println("This is not exist");
				delinfo.getNametxt().setText(null);
				delinfo.getAddtxt().setText(null);
				delinfo.getIdtxt().setText(null);
				delinfo.getPhonetxt().setText(null);
				delinfo.getPassword().setText(null);	
			}
		});
		delinfo.getYes().setOnAction(e->{
			
			customer=cushash.get(deletecus.getPassid().getText().trim());
			delinfo.getNametxt().setText(customer.getName());
			delinfo.getAddtxt().setText(customer.getAddress());
			delinfo.getIdtxt().setText(customer.getCustid());
			delinfo.getPhonetxt().setText(customer.getPhonenum());
			delinfo.getPassword().setText(customer.getPassword());
      String id=customer.getCustid();
       cushash.remove(id);
			deletecustomer(customer);
			stage5.close();
			stage6.close();
			
		});
		
		delinfo.getNo().setOnAction(e->{
			delinfo.getNametxt().setText(null);
			delinfo.getAddtxt().setText(null);
			delinfo.getIdtxt().setText(null);
			delinfo.getPhonetxt().setText(null);
			delinfo.getPassword().setText(null);	
		});
		
		sign.getUpdatebutton().setOnAction(e->{
			stage7.setScene(scene7);
			stage7.show();
		});
		
		custup.getOk().setOnAction(e->{
			if(cushash.containsKey(custup.getPassid().getText().trim())) {
				System.out.println("here");
				Customer c=cushash.get(custup.getPassid().getText().trim());
				custinfo.getNametxt().setText(c.getName());
				custinfo.getAddtxt().setText(c.getAddress());
				custinfo.getIdtxt().setText(c.getCustid());
				custinfo.getPhonetxt().setText(c.getPhonenum());
				custinfo.getPassword().setText(c.getPassword());
				stage8.setScene(scene8);
	            stage8.show();
			}
			else {
				System.out.println("This is not exist");
				custinfo.getNametxt().setText(null);
				custinfo.getAddtxt().setText(null);
				custinfo.getIdtxt().setText(null);
				custinfo.getPhonetxt().setText(null);
				custinfo.getPassword().setText(null);	
			}
		});
		
		custinfo.getDone().setOnAction(e->{
			if (custinfo.getNametxt().getText().isEmpty() || 
					custinfo.getAddtxt().getText().isEmpty() || 
					custinfo.getIdtxt().getText().isEmpty() || 
					custinfo.getPhonetxt().getText().isEmpty() || 
					custinfo.getPassword().getText().isEmpty()) {
				   System.out.println("theres empty fields");
				}
             else if(custinfo.getPhonetxt().getText().length() < 10 ||custinfo.getPhonetxt().getText().length()>10) {
            	 System.out.println("the phone num  must be 10 numbers only");
            	 
             }
			else if(isOnlyDigits(custinfo.getPassword().getText())==true || isOnlyCharacters(custinfo.getPassword().getText())) {
				System.out.println("the password must have letters and digits ");
			}
			else {
				String cname=custinfo.getNametxt().getText().trim();
				String caddress=custinfo.getAddtxt().getText().trim();
				String cid= custinfo.getIdtxt().getText().trim();
				String cphone = custinfo.getPhonetxt().getText().trim();
				String cpassword=custinfo.getPassword().getText().trim();
				 Customer c = cushash.get(cid);
				c.setName(cname);
				c.setAddress(caddress);
				c.setPhonenum(cphone);
				c.setPassword(cpassword);
				 cushash.put(cid, c);
				updatecustname(cid, cname);
				updatecustaddress(cid, caddress);
				updatecustphone(cid, cphone);
				updatecustpassword(cid, cpassword);
				 custinfo.getNametxt().setText(null);
				 custinfo.getAddtxt().setText(null);
				 custinfo.getIdtxt().setText(null);
				 custinfo.getPhonetxt().setText(null);
				 custinfo.getPassword().setText(null);
			}
		
		});
		custinfo.getNo().setOnAction(e->{
			custup.getPassid().setText(null);
			custinfo.getNametxt().setText(null);
			custinfo.getAddtxt().setText(null);
			custinfo.getIdtxt().setText(null);
			custinfo.getPhonetxt().setText(null);
			custinfo.getPassword().setText(null);
			stage8.close();
			stage7.close();
		});
		
		

			//getData();
		
//			Customer c= new Customer("Eliana","AlQuds","1202825","0568722661","elianpass");
//			deletecustomer(c);
			
			
			
			for (int i = 0; i < custlist.size(); i++) {
				System.out.println("The cus name in arr: "+custlist.get(i).getName()+" The Id :"+custlist.get(i).getCustid());
			}
			
			
//			for (Map.Entry<String, Customer> entry : cushash.entrySet()) {
//	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//	        }

			// convert data from arraylist to observable arraylist
			//dataList = FXCollections.observableArrayList(data);

			
			// really bad method
			//tableView(stage);
			//stage.show();
			

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")

//	private void tableView(Stage stage) {
//
//		TableView<Product> myDataTable = new TableView<Product>();
//
//		Scene scene = new Scene(new Group());
//		stage.setTitle("Product Table");
//		stage.setWidth(550);
//		stage.setHeight(500);
//
//
//		myDataTable.setEditable(true);
//		myDataTable.setMaxHeight(200);
//		myDataTable.setMaxWidth(408);
//
//		// name of column for display
//		TableColumn<Product, Integer> pidCol = new TableColumn<Product, Integer>("pid");
//		pidCol.setMinWidth(50);
//
//		// to get the data from specific column
//		pidCol.setCellValueFactory(new PropertyValueFactory<Product, Integer>("pid"));
//
//		TableColumn<Product, String> pnameCol = new TableColumn<Product, String>("pname");
//		pnameCol.setMinWidth(100);
//		pnameCol.setCellValueFactory(new PropertyValueFactory<Product, String>("pname"));
//
//		pnameCol.setCellFactory(TextFieldTableCell.<Product>forTableColumn());
//		pnameCol.setOnEditCommit((CellEditEvent<Product, String> t) -> {
//		((Product) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPname(t.getNewValue()); // display                                                                                   // only
//		updateName(t.getRowValue().getPid(), t.getNewValue());
//		});
//
//		TableColumn<Product, Integer> priceCol = new TableColumn<Product, Integer>("price");
//		priceCol.setMinWidth(50);
//		priceCol.setCellValueFactory(new PropertyValueFactory<Product, Integer>("price"));
//
//		priceCol.setCellFactory(TextFieldTableCell.<Product, Integer>forTableColumn(new IntegerStringConverter()));
//
//		priceCol.setOnEditCommit((CellEditEvent<Product, Integer> t) -> {
//			((Product) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPrice(t.getNewValue());
//			updatePrice(t.getRowValue().getPid(), t.getNewValue());
//		});
//		TableColumn<Product, Integer> stockCol = new TableColumn<Product, Integer>("stockQuantity");
//		stockCol.setMinWidth(50);
//		stockCol.setCellValueFactory(new PropertyValueFactory<Product, Integer>("stockQuantity"));
//		
//		stockCol.setCellFactory(TextFieldTableCell.<Product, Integer>forTableColumn(new IntegerStringConverter()));
//
//		stockCol.setOnEditCommit((CellEditEvent<Product, Integer> t) -> {
//			((Product) t.getTableView().getItems().get(t.getTablePosition().getRow())).setStockQuantity(t.getNewValue());
//			updateQuantity(t.getRowValue().getPid(), t.getNewValue());
//		});
//		TableColumn<Product, String> descriptionCol = new TableColumn<Product, String>("description");
//		descriptionCol.setCellFactory(TextFieldTableCell.<Product>forTableColumn());
//
//		descriptionCol.setMinWidth(100);
//		descriptionCol.setCellValueFactory(new PropertyValueFactory<Product, String>("description"));
//
//		descriptionCol.setOnEditCommit((CellEditEvent<Product, String> t) -> {
//			((Product) t.getTableView().getItems().get(t.getTablePosition().getRow())).setDescription(t.getNewValue());
//			updateDescription(t.getRowValue().getPid(), t.getNewValue());
//		});
//
//		myDataTable.setItems(dataList);
//
//		myDataTable.getColumns().addAll(pidCol, pnameCol, priceCol, stockCol, descriptionCol);
//
//		final TextField addPid = new TextField();
//		addPid.setPromptText("Pid");
//		addPid.setMaxWidth(pidCol.getPrefWidth());
//
//		final TextField addPname = new TextField();
//		addPname.setMaxWidth(pnameCol.getPrefWidth());
//		addPname.setPromptText("Pname");
//
//		final TextField addPrice = new TextField();
//		addPrice.setMaxWidth(priceCol.getPrefWidth());
//		addPrice.setPromptText("Price");
//
//		final TextField addStock = new TextField();
//		addStock.setMaxWidth(stockCol.getPrefWidth());
//		addStock.setPromptText("Stock Quantity");
//
//		final TextField addDescription = new TextField();
//		addDescription.setMaxWidth(descriptionCol.getPrefWidth());
//		addDescription.setPromptText("Description");
//
//		final Button addButton = new Button("Add");
//		addButton.setOnAction((ActionEvent e) -> {
//			Product rc;
//			rc = new Product(Integer.valueOf(addPid.getText()), addPname.getText(), Integer.valueOf(addPrice.getText()),
//					Integer.valueOf(addStock.getText()), addDescription.getText());
//			dataList.add(rc);
//			insertData(rc);
//			addPid.clear();
//			addPname.clear();
//			addPrice.clear();
//			addStock.clear();
//			addDescription.clear();
//		});
//
//		final HBox hb = new HBox();
//
//		final Button deleteButton = new Button("Delete");
//	deleteButton.setOnAction((ActionEvent e) -> {
//			ObservableList<Product> selectedRows = myDataTable.getSelectionModel().getSelectedItems();
//		ArrayList<Product> rows = new ArrayList<>(selectedRows);
//			rows.forEach(row -> {
//				myDataTable.getItems().remove(row);
//				deleteRow(row);
//				myDataTable.refresh();
//			});
//		});
//
//		hb.getChildren().addAll(addPid, addPname, addPrice, addStock, addDescription, addButton, deleteButton);
//		hb.setSpacing(3);
//
//		final Button refreshButton = new Button("Refresh");
//		refreshButton.setOnAction((ActionEvent e) -> {
//			myDataTable.refresh();
//		});
//
////		Button ownedNoneButton = new Button("Owned None");
////		ownedNoneButton.setOnAction(c -> );
//
//		final Button clearButton = new Button("Clear All");
//		clearButton.setOnAction((ActionEvent e) -> {
//			showDialog(stage, NONE, myDataTable);
//
//		});
//
//		final HBox hb2 = new HBox();
//		hb2.getChildren().addAll(clearButton, refreshButton);
//		hb2.setAlignment(Pos.CENTER_RIGHT);
//		hb2.setSpacing(3);
//
//		final VBox vbox = new VBox();
//		vbox.setSpacing(5);
//		vbox.setPadding(new Insets(10, 0, 0, 10));
//		vbox.setAlignment(Pos.CENTER);
//		vbox.getChildren().addAll(myDataTable, hb, hb2);
//		// vbox.getChildren().addAll(label, myDataTable);
//		((Group) scene.getRoot()).getChildren().addAll(vbox);
//		stage.setScene(scene);
//	}
	
	
	
	
	private void insertShop(Shop shop) {

		try {
		//	System.out.println("The name : "+com.getModel());
			
			connectDB();
			ExecuteStatement("INSERT INTO Shop (shopname,shopphone,shopaddress) VALUES ('" + shop.getShopname() + "','" + shop.getPhonenum() + "','" + shop.getAddress()+"')");
			con.close();
			//System.out.println("Connection closed" + data.size());

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	private void insertDatacomputer(Computer com) {

		try {
			System.out.println("The name : "+com.getModel());
			
			connectDB();
			ExecuteStatement("INSERT INTO Computer (compcolor, cputype, compram, compmodel, compstorage, serialnum, isbuy, compprice) VALUES ('" + com.getColor() + "','" + com.getCpu() + "','" + com.getRam() + "','" + com.getModel() + "', '" + com.getStorage() + "', '"+com.getSerialnum()+"', '"+com.getIsbuy()+"', '"+com.getPrice()+"')");
			con.close();
			//System.out.println("Connection closed" + data.size());

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	private void insertDatacustomer(Customer cus) {

		try {
			System.out.println("The name : "+cus.getName()+"The address: "+cus.getAddress()+"The cusid "+cus.getCustid()+" The phone "+cus.getPhonenum()+" pass"+cus.getPassword());

			connectDB();
			ExecuteStatement("INSERT INTO Customer (custname, address, custid, custphone, custpassword) VALUES ('" + cus.getName() + "','" + cus.getAddress() + "','" + cus.getCustid() + "','" + cus.getPhonenum() + "', '" + cus.getPassword() + "')");
			con.close();
			System.out.println("Connection closed" + data.size());

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void insertDataBuys(Buys buy) {

		try {
			//System.out.println("The name : "+cus.getName()+"The address: "+cus.getAddress()+"The cusid "+cus.getCustid()+" The phone "+cus.getPhonenum()+" pass"+cus.getPassword());

			connectDB();
			ExecuteStatement("INSERT INTO buys(custid,sellid,serialnum) VALUES ('" + buy.getCustid() + "','" + buy.getSellid()+"','"+buy.getSerialnum()+"')");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	private void insertDataSelleremp(SellerEmp emp) {

		try {
			//System.out.println("The name : "+cus.getName()+"The address: "+cus.getAddress()+"The cusid "+cus.getCustid()+" The phone "+cus.getPhonenum()+" pass"+cus.getPassword());

			connectDB();
			ExecuteStatement("INSERT INTO SellEmp(sellid,empname,empage,empemail, empphone, empaddress, empgender,shopname) VALUES ('" + emp.getSellid() + "','" + emp.getEmpname()+"','"+emp.getEmpage() + "','" + emp.getEmpemail() + "','" + emp.getEmpphone() + "', '" + emp.getEmpaddress() +"', '"+emp.getEmpgender()+"', '"+emp.getShopname()+ "')");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void insertDataRepEmp(RepEmp emp) {
		try {
			//System.out.println("The name : "+cus.getName()+"The address: "+cus.getAddress()+"The cusid "+cus.getCustid()+" The phone "+cus.getPhonenum()+" pass"+cus.getPassword());

			connectDB();
			ExecuteStatement("INSERT INTO RepEmp(repid,empname,empage,empemail, empphone, empaddress, empgender,shopname) VALUES ('" + emp.getRepid() + "','" + emp.getEmpname()+"','"+emp.getEmpage() + "','" + emp.getEmpemail() + "','" + emp.getEmpphone() + "', '" + emp.getEmpaddress() +"', '"+emp.getEmpgender()+"', '"+emp.getShopname()+ "')");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void insertDataServices(Services ser) {
		try {
			//System.out.println("The name : "+cus.getName()+"The address: "+cus.getAddress()+"The cusid "+cus.getCustid()+" The phone "+cus.getPhonenum()+" pass"+cus.getPassword());

			connectDB();
			ExecuteStatement("INSERT INTO service(custid,repid,serialnum) VALUES ('" + ser.getCustid() + "','" + ser.getRepid()+"','"+ser.getSerialnum()+ "')");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void getDatacomputer() throws SQLException, ClassNotFoundException {
		String SQL;
		connectDB();
		System.out.println("Connection customer");
		SQL = "select compcolor,cputype,compram,compmodel,compstorage,serialnum,isbuy,compprice,isrepair from Computer ORDER BY compprice";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			 Computer comp = new Computer(
				        rs.getString(1),
				        rs.getString(2), 
				        rs.getInt(3), 
				        rs.getString(4), 
				        rs.getInt(5) ,
				        rs.getString(6) ,
				        rs.getInt(7),
				        rs.getDouble(8),rs.getInt(9)
				    );
			 comphash.put(rs.getString(6), comp);
		}
		
		rs.close();
		stmt.close();

		con.close();
		//System.out.println("Connection closed" + custlist.size());
		
	}
	
	private void getDatashop() throws SQLException, ClassNotFoundException {
		String SQL;
		connectDB();
		System.out.println("Connection customer");
		SQL = "select shopname,shopphone,shopaddress from Shop";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			 Shop shop = new Shop(rs.getString(1),rs.getString(2),rs.getString(3));
			 shophash.put(rs.getString(1),shop);
		}
		
		rs.close();
		stmt.close();

		con.close();
		//System.out.println("Connection closed" + custlist.size());
		
	}
	
	private void getDataRepEmp() throws SQLException, ClassNotFoundException {
		String SQL;
		connectDB();
		System.out.println("Connection customer");
		SQL = "select repid,empname,empage,empemail,empphone,empaddress,empgender,shopname from RepEmp";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			RepEmp rep = new RepEmp(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getNString(6),rs.getString(7),rs.getString(8));
			repemphash.put(rs.getString(1), rep);
		}
		
		rs.close();
		stmt.close();

		con.close();
		//System.out.println("Connection closed" + custlist.size());
		
	}
	
	private void getDatacustomer() throws SQLException, ClassNotFoundException {
		String SQL;
		connectDB();
		System.out.println("Connection customer");
		SQL = "select custname,address,custid,custphone,custpassword from Customer ORDER BY custid";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			 Customer customer = new Customer(
				        rs.getString(1), // custname
				        rs.getString(2), // address
				        rs.getString(3), // custid
				        rs.getString(4), // custphone
				        rs.getString(5)  // custpassword
				    );
			 custlist.add(customer);
			 cushash.put(rs.getString(3), customer);
		}
		
		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + custlist.size());
		
	}
	
	private void getDatasellemp() throws SQLException, ClassNotFoundException {
		String SQL;
		connectDB();
		System.out.println("Connection customer");
		SQL = "select sellid,empname,empage,empemail,empphone,empaddress,empgender,shopname from SellEmp";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			SellerEmp sells = new SellerEmp(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getNString(6),rs.getString(7),rs.getString(8));
			sellemphash.put(rs.getString(1), sells);
		}
		
		rs.close();
		stmt.close();

		con.close();
		//System.out.println("Connection closed" + custlist.size());
		
	}
	private void deletecomputer(Computer com) {
		// TODO Auto-generated method stub
		try {
			connectDB();
			ExecuteStatement("DELETE FROM Computer WHERE serialnum = '" + com.getSerialnum() + "';");
			con.close();
			System.out.println("Connection closed comp delete method");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void deleteshop(Shop shop) {
		// TODO Auto-generated method stub

		try {
		//	System.out.println("delete from  Customer where custid=" + cust.getCustid() + ";");
			connectDB();
			ExecuteStatement("DELETE FROM Shop WHERE shopname = '" + shop.getShopname() + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void deleteSelleremp(SellerEmp sellemp) {
		// TODO Auto-generated method stub

		try {
		//	System.out.println("delete from  Customer where custid=" + cust.getCustid() + ";");
			connectDB();
			ExecuteStatement("DELETE FROM SellEmp WHERE sellid = '" + sellemp.getSellid() + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void deleteSelleremp(RepEmp repemp) {
		// TODO Auto-generated method stub

		try {
		//	System.out.println("delete from  Customer where custid=" + cust.getCustid() + ";");
			connectDB();
			ExecuteStatement("DELETE FROM RepEmp WHERE repid = '" + repemp.getRepid() + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void deleteservice(Services ser) {
		// TODO Auto-generated method stub

		try {
			//System.out.println("delete from  Customer where custid=" + cust.getCustid() + ";");
			connectDB();
			ExecuteStatement("DELETE FROM service WHERE serialnum = '" + ser.getSerialnum() + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	private void deletecustomer(Customer cust) {
		// TODO Auto-generated method stub

		try {
			System.out.println("delete from  Customer where custid=" + cust.getCustid() + ";");
			connectDB();
			ExecuteStatement("delete from  Customer where custid=" + cust.getCustid() + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	private void connectDB() throws ClassNotFoundException, SQLException {

		dbURL = "jdbc:mysql://" + URL + ":" + port + "/" + dbName + "?verifyServerCertificate=false";
		Properties p = new Properties();
		p.setProperty("user", dbUsername);
		p.setProperty("password", dbPassword);
		p.setProperty("useSSL", "false");
		p.setProperty("autoReconnect", "true");
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(dbURL, p);

	}

	public void ExecuteStatement(String SQL) throws SQLException {
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(SQL);
			stmt.close();

		} catch (SQLException s) {
			s.printStackTrace();
			System.out.println("SQL statement is not executed!");

		}

	}
	public void updateSellEmpage(String sellid,int empage) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE SellEmp SET empage = '" + empage + "' WHERE sellid = '" + sellid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void updateRepempage(String repid,int empage) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE RepEmp SET empage = '" + empage + "' WHERE repid = '" + repid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updateSellEmpphone(String sellid,String phonenum) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE SellEmp SET empphone = '" + phonenum + "' WHERE sellid = '" + sellid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updateRepphone(String repid,String phonenum) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE RepEmp SET empphone = '" + phonenum + "' WHERE repid = '" + repid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updateSellEmpemail(String sellid,String email) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE SellEmp SET empemail = '" + email + "' WHERE sellid = '" + sellid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updateRepEmail(String repid,String email) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE RepEmp SET empemail = '" + email + "' WHERE repid = '" + repid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateSellEmpaddress(String sellid,String address) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE SellEmp SET empaddress = '" + address + "' WHERE sellid = '" + sellid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updateRepaddress(String repid,String address) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE RepEmp SET empaddress = '" + address + "' WHERE repid = '" + repid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updateSellEmpgender(String sellid,String gender) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE SellEmp SET empgender = '" + gender + "' WHERE sellid = '" + sellid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updateRepEmpgender(String repid,String gender) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE RepEmp SET empgender = '" + gender + "' WHERE repid = '" + repid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void updateSellEmpname(String sellid,String name) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE SellEmp SET empname = '" + name + "' WHERE sellid = '" + sellid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updateRepEmpname(String repid,String name) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE RepEmp SET empname = '" + name + "' WHERE repid = '" + repid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	public void updateShopphone(String shopname,String shopphone) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Shop SET shopphone = '" + shopphone + "' WHERE shopname = '" + shopname + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updateShopaddress(String shopname,String shopaddress) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Shop SET shopaddress = '" + shopaddress + "' WHERE shopname = '" + shopname + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updatecomputercolor(String serial,String color) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Computer SET compcolor = '" + color + "' WHERE serialnum = '" + serial + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updatecomputerCPU(String serial,String cputype) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Computer SET cputype = '" + cputype + "' WHERE serialnum = '" + serial + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updatecomputerRam(String serial,int compram) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Computer SET compram = '" + compram + "' WHERE serialnum = '" + serial + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updatecomputermodel(String serial,String compmodel) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Computer SET compmodel = '" + compmodel + "' WHERE serialnum = '" + serial + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updatecomputerStorage(String serial,int compstorage) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Computer SET compstorage = '" + compstorage + "' WHERE serialnum = '" + serial + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updatecomputerIsBuy(String serial,int isbuy) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Computer SET isbuy = '" + isbuy + "' WHERE serialnum = '" + serial + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updatecomputerprice(String serial,double compprice) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Computer SET compprice = '" + compprice + "' WHERE serialnum = '" + serial + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updatecomputerisrepair(String serial,int isrepair) {
		try {
			//System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Computer SET isrepair = '" + isrepair + "' WHERE serialnum = '" + serial + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
public void updatecustname(String custid,String name) {
	try {
		System.out.println("update  product set pname = '" + name + "' where pid = " + custid);
		connectDB();
		ExecuteStatement("update  Customer set custname = '" + name + "' where custid = " + custid + ";");
		con.close();
		System.out.println("Connection closed");

	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}



	public void updatecustaddress(String custid, String address) {

		try {
			System.out.println("update  product set price = " + address + " where pid = " + custid);
			connectDB();
			ExecuteStatement("UPDATE Customer SET address = '" + address + "' WHERE custid = '" + custid + "';");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

//	public void updatecustid(String custid, String newcustid) {
//
//		try {
//			System.out.println("update  product set stock_quantity = '" + custid + "' where pid = " + newcustid);
//			connectDB();
//			ExecuteStatement("update  Customer set custid = '" + newcustid + "' where custid = " + custid + ";");
//			con.close();
//			System.out.println("Connection closed");
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}

	public void updatecustphone(String custid, String phonenum) {

		try {
			System.out.println("update  product set `description` = '" + custid + "' where pid = " +  phonenum);
			connectDB();
			ExecuteStatement("update  Customer set custphone = '" + phonenum + "' where custid = " +  custid + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void updatecustpassword(String custid, String password) {

		try {
			//System.out.println("update  product set `description` = '" + custid + "' where pid = " +  password);
			connectDB();
			ExecuteStatement("update  Customer set custpassword = '" + password + "' where custid = " +  custid + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void deleteRow(Product row) {
		// TODO Auto-generated method stub

		try {
			System.out.println("delete from  product where pid=" + row.getPid() + ";");
			connectDB();
			ExecuteStatement("delete from  product where pid=" + row.getPid() + ";");
			con.close();
			System.out.println("Connection closed");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

//	private void showDialog(Window owner, Modality modality, TableView<Product> table) {
//		// Create a Stage with specified owner and modality
//		Stage stage = new Stage();
//		stage.initOwner(owner);
//		stage.initModality(modality);
//		// Label modalityLabel = new Label(modality.toString());
//
//		Button yesButton = new Button("Confirm");
//		yesButton.setOnAction(e -> {
//			for (Product row : dataList) {
//				deleteRow(row);
//				table.refresh();
//			}
//			table.getItems().removeAll(dataList);
//			stage.close();
//
//		});

//		Button noButton = new Button("Cancel");
//		noButton.setOnAction(e -> stage.close());
//
//		HBox root = new HBox();
//		root.setPadding(new Insets(10, 10, 10, 10));
//		root.setAlignment(Pos.CENTER);
//		root.setSpacing(10);
//
//		root.getChildren().addAll(yesButton, noButton);
//		Scene scene = new Scene(root, 200, 100);
//		stage.setScene(scene);
//		stage.setTitle("Confirm Delete?");
//		stage.show();
//	}
	
	 public static boolean isOnlyDigits(String input) {
	        return input.matches("\\d+");
	    }
	 public static boolean isOnlyCharacters(String input) {
	        return input.matches("[a-zA-Z]+");
	    }
	 public  void showAlert(String message) {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Warning");
			alert.setHeaderText(null);
			alert.setContentText(message);
			alert.showAndWait();
		}

	
	public static void main(String[] args) {

		Application.launch(args);
	}

}

