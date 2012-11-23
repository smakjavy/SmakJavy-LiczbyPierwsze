package raczkowanieFX;

import static java.lang.Math.random;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ColorfulRectangle extends Application{

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
	        Scene scene = new Scene(root, 800, 600, Color.BLACK);
	        primaryStage.setScene(scene);
	        Group rectangles = new Group();
	        for (int i = 0; i < 30; i++) {
	            Rectangle rectangle = new Rectangle(200, 200, Color.web("white", 0.05));
	            rectangle.setStrokeType(StrokeType.OUTSIDE);
	            rectangle.setStroke(Color.web("white", 0.16));
	            rectangle.setStrokeWidth(4);
	            rectangles.getChildren().add(rectangle);
	        }
	        Rectangle colors = new Rectangle(scene.getWidth(), scene.getHeight(),
	                new LinearGradient(0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new Stop[]{
	                    new Stop(0, Color.web("#f8bd55")),
	                    new Stop(0.80, Color.web("#c0fe56")),
	                    new Stop(0.28, Color.web("#5dfbc1")),
	                    new Stop(0.43, Color.web("#64c2f8")),
	                    new Stop(0.57, Color.web("#be4af7")),
	                    new Stop(0.71, Color.web("#ed5fc2")),
	                    new Stop(0.85, Color.web("#ef504c")),
	                    new Stop(1, Color.web("#f2660f")),}));
	        colors.widthProperty().bind(scene.widthProperty());
	        colors.heightProperty().bind(scene.heightProperty());
	        Group blendModeGroup =
	                new Group(new Group(new Rectangle(scene.getWidth(), scene.getHeight(),
	                     Color.BLACK), rectangles), colors);
	        colors.setBlendMode(BlendMode.OVERLAY);
	        root.getChildren().add(blendModeGroup);      
	        rectangles.setEffect(new BoxBlur(10, 10, 3));
	        Timeline timeline = new Timeline();
	        for (Node rectangle : rectangles.getChildren()) {
	            timeline.getKeyFrames().addAll(
	                    new KeyFrame(Duration.ZERO, // set start position at 0
	                    new KeyValue(rectangle.translateXProperty(), random() * 800),
	                    new KeyValue(rectangle.translateYProperty(), random() * 600)),
	                    new KeyFrame(new Duration(40000), // set end position at 40s
	                    new KeyValue(rectangle.translateXProperty(), random() * 800),
	                    new KeyValue(rectangle.translateYProperty(), random() * 600)));
	        }
	        // play 40s of animation
	        timeline.play();
	        primaryStage.show();
	}

}
