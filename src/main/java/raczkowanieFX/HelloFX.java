package raczkowanieFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloFX extends Application{
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		String imageSource = "http://www.alemiodzio.pl/darmowe_tapety_na_pulpit,smieszne,2,1,smieszne008,26,1,0.html"; 

		Image image = new Image(imageSource);
		ImageView imageview = new ImageView();
		root.getChildren().add(imageview);

		Scene scene = new Scene(root);
		primaryStage.setTitle("Moja pogoñ za Jav¹ :p");
		primaryStage.show();
		
	}

}
