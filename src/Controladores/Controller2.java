/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author darin
 */
public class Controller2 implements Initializable {
    
    private Stage stage;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
    
    public void closeWindows(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/FXMLMainController"));
            Parent root = loader.load();
            FXMLMainController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
          
        } catch (IOException ex) {
            Logger.getLogger(Controller2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setStage(Stage stage){
        this.stage=stage;
    }
    
}
