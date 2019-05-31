package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	public static Stage PrimaryStage;
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			//Scene homeScene = new Scene(root,400,400);
			PrimaryStage=primaryStage;
			Parent rootNode = FXMLLoader.load(getClass().getResource("prova.fxml"));
			Scene homeScene = new Scene(rootNode);
			PrimaryStage.setScene(homeScene);
			PrimaryStage.show();
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
