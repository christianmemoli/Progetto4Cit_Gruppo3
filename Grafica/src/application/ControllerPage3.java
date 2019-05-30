package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class ControllerPage3 {

    @FXML
    private Button registrati;

    public void initialize(){
     
    	registrati.addEventHandler(ActionEvent.ACTION, ActionEvent ->{
    		Page3.closestage();
    		new Page4().start(Page3.getPrimaryStage());
    	});
   
    }
 
}