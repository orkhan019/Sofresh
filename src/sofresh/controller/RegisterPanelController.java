/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofresh.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Orkhan019
 */
public class RegisterPanelController implements Initializable {

    @FXML
    private Button CancelBtn;
    @FXML
    private Button SaveBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    Stage stage;
    public void SetStage( Stage stage){
        this.stage=stage;
    }
    @FXML
    private void actionCancel(ActionEvent event) {
   
    }

    @FXML
    private void actionSave(ActionEvent event) {
    }
    
}
