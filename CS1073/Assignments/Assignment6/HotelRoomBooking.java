import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import java.text.NumberFormat;

/**
This class represents a javadoc application for Character Counting
@author Daniyal Khan 3765942
*/

public class HotelRoomBooking extends Application {
    private TextField nameField;
    private TextField guestField;
    private TextField bedField;
    private TextField nightField;
    private NumberFormat currency;
    private Text intro;
    private Text checkOut;
    private Text display;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage Stage) {
        Stage.setTitle("Hotel Room Booking");
      	
      	Text name = new Text("Name:");
      	nameField = new TextField();
      	nameField.setPrefWidth(100);
      	Text numGuests = new Text("Number of Guests:");
      	guestField = new TextField();
      	guestField.setPrefWidth(60);
      	Text numBeds = new Text("Number of Beds:");
      	bedField = new TextField();
      	bedField.setPrefWidth(60);
      	Text numNights = new Text("Number of Nights:");
 	nightField = new TextField();
 	nightField.setPrefWidth(60);
 	
 	Button suite = new Button("Suite");
 	Button standard = new Button("Standard");
 	Button reset = new Button("Reset");
 	reset.setOnAction(this::resetFields);
 	suite.setOnAction(this::suiteRoom);
 	standard.setOnAction(this::standardRoom);
 	
 	intro = new Text("Welcome to Hotels R Us");
 	checkOut = new Text("Take note of your check-out time.");
 	display = new Text("Enter your information");
 	
        FlowPane pane = new FlowPane(name, nameField, numGuests, guestField, numBeds, bedField, 			numNights, nightField, suite, standard, reset, intro, checkOut, display);
        
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(20);
        pane.setHgap(15);
        
        Scene scene = new Scene(pane, 260, 370);
       	Stage.setScene(scene);
        Stage.show();
    }
    
    public void suiteRoom(ActionEvent event) {
    	currency = NumberFormat.getCurrencyInstance();
    	String nameStr = nameField.getText();
    	String guestStr = guestField.getText();
    	String bedStr = bedField.getText();
    	String nightStr = nightField.getText();
    	int numGuests = Integer.parseInt(guestStr);
    	int numBeds = Integer.parseInt(bedStr);
    	int numNights = Integer.parseInt(nightStr);
    	
    	Suite suite = new Suite(nameStr, numNights, numGuests, numBeds);
    	
    	intro.setText("Your room perk is: " + suite.randPerk());
    	checkOut.setText("Please check-out by: " + suite.checkOutTime());
    	display.setText("Total Cost: " + currency.format(suite.getRate()));
    }
    
    public void standardRoom(ActionEvent event) {
    	currency = NumberFormat.getCurrencyInstance();
    	String nameStr = nameField.getText();
    	String guestStr = guestField.getText();
    	String bedStr = bedField.getText();
    	String nightStr = nightField.getText();
    	int numGuests = Integer.parseInt(guestStr);
    	int numBeds = Integer.parseInt(bedStr);
    	int numNights = Integer.parseInt(nightStr);

	Standard standard = new Standard(nameStr, numNights, numGuests, numBeds);
	
	intro.setText("Breakfast included in room cost.");
    	checkOut.setText("Please check-out by: " + standard.checkOutTime());
    	display.setText("Total Cost: " + currency.format(standard.getRate()));
    }
    
    public void resetFields(ActionEvent event) {
    	nameField.clear();
    	guestField.clear();
    	bedField.clear();
    	nightField.clear();
    }	
   
}





