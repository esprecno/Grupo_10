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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
<<<<<<< Updated upstream
=======
import main.Funciones;
>>>>>>> Stashed changes
import main.Simulador;
import main.Persona;


/**
 * FXML Controller class
 *
 * @author darin
 */
public class Controller2 implements Initializable {
    
    private Stage stage;
    @FXML
    private TextField txtPos;
    @FXML
    private ChoiceBox direccion;
    @FXML
    private AnchorPane anchor;
    @FXML
    private Circle Circulo;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        anchor = Funciones.crearLista(anchor, Circulo, FXMLMainController.num);
    }  
    
    
    public void closeWindows(){
        this.stage.close();
        Simulador simular = new Simulador();
        simular.start(new Stage());
    }
    
    public void setStage(Stage stage){
        this.stage=stage;
    }    
     
     
    private void DividirCirculo(){
        
    }
    
    
}
