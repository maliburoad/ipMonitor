package application;
	
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Prezes extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		    
			primaryStage.setTitle("Prezes v.1.0");
			primaryStage.setWidth(215);
			primaryStage.setHeight(121);
		        Scene scene = new Scene(new Group());
		        VBox root = new VBox();    

		        final ImageView selectedImage = new ImageView();   

		        //Image image1 = new Image(new FileInputStream("/home/gros/Obrazy/prezes.jpeg"));
		        //Image image1 = new Image(new FileInputStream("prezes.jpeg"));
		        Image image1 = new Image(Prezes.class.getResourceAsStream("prezes.jpeg"));
		        
		        
		        selectedImage.setImage(image1);

		        root.getChildren().addAll(selectedImage);

		        scene.setRoot(root);

		        primaryStage.setScene(scene);
		        primaryStage.show();
		      
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
