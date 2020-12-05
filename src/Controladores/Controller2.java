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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import main.Funciones;
import main.Main;
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
    @FXML
    private Button Empezar;
    @FXML
    private Label lblError;
    @FXML
    private Button Nuevo;
    
    
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

    @FXML
    private void btnEmpezar(ActionEvent event) {
        String dir="";
            if(direccion.getValue()!=null)
                dir = (String)direccion.getValue();
        boolean dirBool=dir.equals("Derecha");
        Simulador simular = new Simulador();
        int pos;
        if(simular.verificarEntradaInit(txtPos.getText()) && !(dir.equals(""))){
            lblError.setText("");
            pos = Integer.parseInt(txtPos.getText());
            txtPos.setText("");
            Nuevo.setDisable(true);
            Funciones.simular(pos,dirBool);
            Nuevo.setDisable(false);
        }else{
            lblError.setText("Número fuera de rango");
        }
    }

    @FXML
    private void btnNuevo(ActionEvent event) {
        this.stage.close();
        Main m = new Main();
        m.start(new Stage());
    }
    
    
}
