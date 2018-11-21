/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofresh.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Orkhan019
 */
public class RegisterController implements Initializable {

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void RegisterClick(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sofresh/view/RegisterPanel.fxml"));
        Stage stage= new Stage();
        stage.setTitle("Register form");
        stage.setScene(new Scene(root));
        stage.show();
        
        
    }

    @FXML
    private void TeslimClick(MouseEvent event) {
    }
    
}
