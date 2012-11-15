package raczkowanieFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.GroupBuilder;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.ImageViewBuilder;

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
		String imageSource = "http://www.alemiodzio.pl/vardata/galeria/10000002/n_smieszne008.jpg"; 

        ImageView imageView = ImageViewBuilder.create()
                .image(new Image(imageSource))
                .build();
         
        Group myGroup = GroupBuilder.create()
                .children(imageView)
                .build();
         
        root.getChildren().add(myGroup);

        primaryStage.setScene(new Scene(root, 500, 312));
		primaryStage.setTitle("Moja pogoñ za Jav¹ :p");
        primaryStage.show();
			
	}
}
