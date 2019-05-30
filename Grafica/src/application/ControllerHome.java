package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class ControllerHome {

    @FXML
    private Button ButtonPrenota;

    public void initialize(){
     
    	ButtonPrenota.addEventHandler(ActionEvent.ACTION, ActionEvent ->{
    		Main.closestage();
    		new Page2().start(Main.getPrimaryStage());
    	});
   
    }
 
    void PrenotaVoloButton(ActionEvent event) {
    	
    	
    }
}