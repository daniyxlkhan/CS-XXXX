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

public class CharacterCounting extends Application {
    TextField inputField;
    Text instruct;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage Stage) {
        Stage.setTitle("Character Counting");
      	
      	Text heading = new Text("Enter a word or phrase:");
      	inputField = new TextField();
      	inputField.setPrefWidth(210);
      	
      	Button countLetters = new Button("Count Letters");
      	Button countDigits = new Button("Count Digits");
      	countLetters.setOnAction(this::letterCounter);
      	countDigits.setOnAction(this::digitCounter);
      	
      	instruct = new Text("Count digits or letters!");
 
        FlowPane pane = new FlowPane(heading, inputField, countLetters, countDigits, instruct);
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(20);
        pane.setHgap(20);
        
        Scene scene = new Scene(pane, 260, 300);
       	Stage.setScene(scene);
        Stage.show();
    }
    
    public void letterCounter(ActionEvent event) {
    	String inputStr = inputField.getText();
    	int numLetters = 0;
    	for (int i = 0, len = inputStr.length(); i < len; i++) {
    		if(Character.isLetter(inputStr.charAt(i))) {
			numLetters++;
		}
	}
	instruct.setText("The numbers of letters is: " + numLetters);
    }
    
    public void digitCounter(ActionEvent event) {
    	String inputStr = inputField.getText();
    	int numDigits = 0;
    	for (int i = 0, len = inputStr.length(); i < len; i++) {
    		if(Character.isDigit(inputStr.charAt(i))) {
			numDigits++;
		}
	}
	instruct.setText("The numbers of digits is: " + numDigits);
    }	
   
}





