package application;
import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		Parent rootNode = FXMLLoader.load(getClass().getResource("prova.fxml"));
		Scene homeScene = new Scene(rootNode, 300, 250);
		primaryStage.setScene(homeScene);
		primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
