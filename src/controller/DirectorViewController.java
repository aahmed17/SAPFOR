/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Christophe
 */
public class DirectorViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
     private Main main;
        private Stage secondStage;

    public void setMain(Main main){
        
        this.main=main;
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
