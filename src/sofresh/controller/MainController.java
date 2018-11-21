/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofresh.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Orkhan019
 */
public class MainController implements Initializable {
    
    @FXML
    private ImageView GunlukIsler;
    @FXML
    private ImageView Siyahı;
    @FXML
    private ImageView Tanimlar;
    @FXML
    private ImageView User;
    @FXML
    private ImageView Logout;
    @FXML
    private ImageView Siyahi;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    
    private void gunlukClicked(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sofresh/view/Register.fxml"));
        Stage stage= new Stage();
        stage.setTitle("Qeydiyyat");
        stage.setScene(new Scene(root));
        stage.show();
    }
     
        
    }

    
    

