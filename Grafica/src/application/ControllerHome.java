package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class ControllerHome {

    @FXML
    private Button ButtonPrenota;

    public void initialize(){
     
    	ButtonPrenota.addEventHandler(ActionEvent.ACTION, ActionEvent ->{
    		PrenotaVoloButton(ActionEvent);
    	});
   
    }
 
   @FXML public void PrenotaVoloButton(ActionEvent event) {
    	
	    Main.closestage();
		new Page2().start(Main.getPrimaryStage());
    }
}