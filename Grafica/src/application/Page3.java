package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Page3 extends Application {
	
	public static Stage PrimaryStage;
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			//Scene homeScene = new Scene(root,400,400);
			Parent rootNode = FXMLLoader.load(getClass().getResource("page3.fxml"));
			Scene homeScene = new Scene(rootNode,600,400);
			primaryStage.setScene(homeScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closestage() {
		PrimaryStage.close();
	}
	
	public static Stage getPrimaryStage() {
		return PrimaryStage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
