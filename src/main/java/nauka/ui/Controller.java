package nauka.ui;

import java.net.URL;
import java.util.ResourceBundle;

import nauka.Licz;
import nauka.Sito;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

public class Controller implements Initializable{

	@FXML
	Pane pane;
	
	
    @FXML
    private void handleButtonAction(ActionEvent event) {
    	Canvas c=new Canvas();
    	pane.getChildren().add(c);
    	c.setWidth(pane.getWidth());
    	c.setHeight(pane.getHeight());
    	

    	Licz l=new Licz();
    	int li[]=l.licz((int)c.getWidth()*5);
    	
    	for(int i=0; i<c.getWidth(); i++){
    		c.getGraphicsContext2D().fillOval(i, li[i]/10, 2,2);	
    	}
    	
    	
    }

	public void initialize(URL url, ResourceBundle rb) {
		System.out.println(url);
	}
    

}
