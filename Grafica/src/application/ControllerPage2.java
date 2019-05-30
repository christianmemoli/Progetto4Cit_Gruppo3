package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class ControllerPage2 {

    @FXML
    private Button accedi;
    private Button registrati;

    public void initialize(){
     
    	accedi.addEventHandler(ActionEvent.ACTION, ActionEvent ->{
    		Page2.closestage();
    		new Page4().start(Page2.getPrimaryStage());
    	});
    	
    	registrati.addEventHandler(ActionEvent.ACTION, ActionEvent ->{
    		Page2.closestage();
    		new Page3().start(Page2.getPrimaryStage());
    	});
   
    }
 
}
