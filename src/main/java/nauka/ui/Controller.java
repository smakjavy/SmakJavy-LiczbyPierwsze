package nauka.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.Pane;

public class Controller {

	@FXML
	private ChoiceBox<String> choiceBox;
	
	@FXML
	private Pane pane;
	
	public Controller(){
		System.out.println(choiceBox);
	}
	
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        Canvas canvas = new Canvas(1000,1000);
        System.out.println(pane.getChildren().add(canvas));
        canvas.getGraphicsContext2D().fillOval(10, 10, 1000, 1000);
    }
    

}
