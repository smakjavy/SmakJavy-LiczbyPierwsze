package nauka.ui;

import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import nauka.Licz;
import nauka.Sito;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import nauka.LiczbyPierwsze;
import nauka.LicznikLiczbPierwszych;

public class Controller implements Initializable{
        @FXML
        private TextField textField;
	@FXML
	private Pane pane;
        
        @FXML
        private ComboBox<String> comboBox;
        
        @FXML
        private ListView<String> listView;
	
	private HashMap<String,LicznikLiczbPierwszych>mapaMetod=new HashMap<String,LicznikLiczbPierwszych>();
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String metoda = comboBox.getSelectionModel().getSelectedItem();
        listView.getItems().add("metoda liczenia:"+metoda);
           
    	Canvas c=new Canvas();
    	pane.getChildren().add(c);
    	c.setWidth(pane.getWidth());
    	c.setHeight(pane.getHeight());
    	
    	LicznikLiczbPierwszych l=mapaMetod.get(metoda);
        int max=Integer.parseInt(textField.getText());
        l.liczLiczbyPierwsze(max);
    	int li[]=l.liczLiczbyPierwsze((int)c.getWidth()*5);
        listView.getItems().add("czas liczenia:"+l.dajCzasLiczenia()+" ms");
    	
    	for(int i=0; i<c.getWidth(); i++){
    		c.getGraphicsContext2D().fillOval(i, li[i]/10, 2,2);	
    	}
    	
    	
    }

	public void initialize(URL url, ResourceBundle rb) {
		mapaMetod.put("Sito", new Sito());
                mapaMetod.put("Liczby", new LiczbyPierwsze());
                comboBox.getItems().addAll(mapaMetod.keySet());
	}
    

}
