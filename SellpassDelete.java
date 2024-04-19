
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SellpassDelete {
	private ToggleButton show;
	private Stage detailsStage = new Stage();

	private Group admingp = new Group();
	private GridPane g = new GridPane();
	private Label passwordlabel;
	private PasswordField pass;
	private Button ok, main;
	private Label massg;
	private HBox passhbox = new HBox(15);

	SellpassDelete() {
		Image backgroundImage = new Image("pass.png");
		BackgroundSize backgroundSize = new BackgroundSize(500, 200, false, false, false, false);
		BackgroundImage background = new BackgroundImage(backgroundImage, null, null, null, backgroundSize);
		g.setBackground(new Background(background));

		passwordlabel = new Label("Seller ID : ");
		passwordlabel.setTextFill(Color.BLACK);
		passwordlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

		massg = new Label();
		massg.setTextFill(Color.RED.darker());
		massg.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

		pass = new PasswordField();
		pass.setText(null);
		pass.setPrefColumnCount(10);
		pass.setMinSize(200, 20);

		ok = new Button("Ok");
		ok.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
		ok.setStyle(

				"-fx-background-radius: 10em; " + "-fx-min-width: 100px; " + "-fx-min-height: 20px; "
						+ "-fx-max-width: 250px; " + "-fx-max-height: 150px; " + "-fx-background-color: black;");
		ok.setTextFill(Color.WHITE);

		main = new Button("Close");
		main.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
//	main.setMinSize(150, 50);
		main.setStyle(

				"-fx-background-radius: 10em; " + "-fx-min-width: 100px; " + "-fx-min-height: 20px; "
						+ "-fx-max-width: 250px; " + "-fx-max-height: 150px; " + "-fx-background-color: black;");
		main.setTextFill(Color.WHITE);

		show = new ToggleButton("Show");
		show.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 18));
//	show.setMinSize(150, 50);
		show.setStyle(

				"-fx-background-radius: 10em; " + "-fx-min-width: 100px; " + "-fx-min-height: 35px; "
						+ "-fx-max-width: 50px; " + "-fx-max-height: 35px; " + "-fx-background-color: black;");
		show.setTextFill(Color.WHITE);
		show.setOnAction(e -> {
			if (show.isSelected()) {
				pass.setPromptText(pass.getText());
				pass.setText("");
			} else {
				pass.setText(pass.getPromptText());
				pass.setPromptText("Password");
			}
		});

//	// Set the initial state
//	pass.setManaged(!show.isSelected());
//	pass.setVisible(!show.isSelected());

		ok.setOnAction(e -> {
//		sellerDetailsWindow();
		});
		main.setOnAction(e -> detailsStage.close());
		g.setHgap(10);
		g.setVgap(10);

		g.add(passwordlabel, 1, 0);
		g.add(pass, 2, 0);
		g.add(show, 3, 0);

		passhbox.getChildren().addAll(main, ok);

		g.add(passhbox, 2, 1);
		g.setPadding(new Insets(5, 5, 5, 5));
		g.setAlignment(Pos.CENTER);
//	admingp.getChildren().addAll(g);

//	Scene scene = new Scene(g, 500, 200);
	}

	public ToggleButton getShow() {
		return show;
	}

	public void setShow(ToggleButton show) {
		this.show = show;
	}

	public Stage getDetailsStage() {
		return detailsStage;
	}

	public void setDetailsStage(Stage detailsStage) {
		this.detailsStage = detailsStage;
	}

	public Group getAdmingp() {
		return admingp;
	}

	public void setAdmingp(Group admingp) {
		this.admingp = admingp;
	}

	public GridPane getG() {
		return g;
	}

	public void setG(GridPane g) {
		this.g = g;
	}

	public Label getPasswordlabel() {
		return passwordlabel;
	}

	public void setPasswordlabel(Label passwordlabel) {
		this.passwordlabel = passwordlabel;
	}

	public PasswordField getPass() {
		return pass;
	}

	public void setPass(PasswordField pass) {
		this.pass = pass;
	}

	public Button getOk() {
		return ok;
	}

	public void setOk(Button ok) {
		this.ok = ok;
	}

	public Button getMain() {
		return main;
	}

	public void setMain(Button main) {
		this.main = main;
	}

	public Label getMassg() {
		return massg;
	}

	public void setMassg(Label massg) {
		this.massg = massg;
	}

	public HBox getPasshbox() {
		return passhbox;
	}

	public void setPasshbox(HBox passhbox) {
		this.passhbox = passhbox;
	}
	
}

