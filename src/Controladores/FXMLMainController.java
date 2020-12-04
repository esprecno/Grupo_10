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
import javafx.scene.control.Label;
import javafx.stage.Stage;
import main.Simulador;
import util.CircularDoubleLinkedList;

/**
 *
 * @author Grupo_10
 */
public class FXMLMainController implements Initializable {
    private Stage stage;
    @FXML
    private Label label;
    @FXML
    private Button button;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        Simulador simular = new Simulador();
        simular.start(new Stage());        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setStage(Stage stage){
        this.stage=stage;
    }
    
}
