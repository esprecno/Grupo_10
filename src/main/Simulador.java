/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Controladores.Controller2;
import Controladores.FXMLMainController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author darin
 */
public class Simulador extends Application {
    
    public boolean verificarEntradaSol(String entrada){
        if(entrada.isEmpty()){
            return false;
        }if(isNumeric(entrada)){
            int ingreso=Integer.parseInt(entrada);
            if(ingreso>7 && ingreso<41){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
       
    public void start(Stage stage){
    try {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResourceAsStream("/vistas/vista2.fxml"));
        final Controller2 controller = loader.getController();
        controller.setStage(stage);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/vistas/estiloVentana2.css");        
        stage.setScene(scene);
        stage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainController.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    
    public boolean verificarEntradaInit(String entrada){
        if(entrada.isEmpty()){
            return false;
        }if(isNumeric(entrada)){
            int ingreso=Integer.parseInt(entrada);
            if(ingreso>=0 && ingreso<FXMLMainController.num){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
