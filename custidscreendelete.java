import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class custidscreendelete {
	private BorderPane border = new BorderPane();
	private Label msg,cusidlab;
	private PasswordField passid;
	private Button cancel,ok;
	private ToggleButton show;
	private HBox hb = new HBox(10);
	private HBox hb2 = new HBox(10);
	
	custidscreendelete(){
		msg = new Label("Please Enter Your ID Here to delete Your Account !");
		msg.setTextFill(Color.RED.darker());
		msg.setFont(Font.font("Enviro", FontWeight.BOLD, FontPosture.ITALIC,20));
		msg.setMinWidth(200);
		
		cusidlab = new Label("User-ID :");
		cusidlab.setTextFill(Color.RED.darker());
		cusidlab.setFont(Font.font("Enviro", FontWeight.BOLD, FontPosture.ITALIC,20));
		cusidlab.setMinWidth(100);
		
		passid= new PasswordField();
		
		show = new ToggleButton("Show");
		show.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		show.setMinSize(150, 50);
		show.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		show.setTextFill(Color.WHITE);
		
		cancel = new Button("Cancel");
		cancel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		cancel.setMinSize(150, 50);
		cancel.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		cancel.setTextFill(Color.WHITE);
		
		ok = new Button("OK");
		ok.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		ok.setMinSize(150, 50);
		ok.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 35px; " +
			                "-fx-max-width: 50px; " +
			                "-fx-max-height: 35px; " +"-fx-background-color: black;" 
	    );
		ok.setTextFill(Color.WHITE);
		
		hb.getChildren().addAll(cusidlab,passid,show);
		hb.setAlignment(Pos.CENTER);
		
		hb2.getChildren().addAll(cancel,ok);
		hb2.setAlignment(Pos.CENTER);
		
		border.setTop(msg);
		border.setAlignment(msg, Pos.CENTER);
		
		border.setCenter(hb);
		
		border.setBottom(hb2);
		
		
	}

	public BorderPane getBorder() {
		return border;
	}

	public Label getMsg() {
		return msg;
	}

	public Label getCusidlab() {
		return cusidlab;
	}

	public PasswordField getPassid() {
		return passid;
	}

	public Button getCancel() {
		return cancel;
	}

	public Button getOk() {
		return ok;
	}

	public ToggleButton getShow() {
		return show;
	}

	public HBox getHb() {
		return hb;
	}

	public HBox getHb2() {
		return hb2;
	}

	public void setBorder(BorderPane border) {
		this.border = border;
	}

	public void setMsg(Label msg) {
		this.msg = msg;
	}

	public void setCusidlab(Label cusidlab) {
		this.cusidlab = cusidlab;
	}

	public void setPassid(PasswordField passid) {
		this.passid = passid;
	}

	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}

	public void setOk(Button ok) {
		this.ok = ok;
	}

	public void setShow(ToggleButton show) {
		this.show = show;
	}

	public void setHb(HBox hb) {
		this.hb = hb;
	}

	public void setHb2(HBox hb2) {
		this.hb2 = hb2;
	}
	
	
	

}
