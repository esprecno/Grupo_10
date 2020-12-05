package Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Simulador;

/**
 *
 * @author Grupo_10
 */
public class FXMLMainController implements Initializable {
    public static int num;
    
    private Stage stage;
    @FXML
    private Button Iniciar;
    @FXML
    private TextField txtNum;
    @FXML
    private Label mensaje;
    @FXML
    private ChoiceBox direccion;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setStage(Stage stage){
        this.stage=stage;
    }

    @FXML
    private void btnIniciar(ActionEvent event) {    
        
        Simulador simular = new Simulador();
        if(simular.verificarEntrada(txtNum.getText())){
            num=Integer.parseInt(txtNum.getText());
           this.stage.close();
           simular.start(new Stage()); 
        }else{
            mensaje.setText("Numero inválido");
        }
         
    }
    
   
    
    
}
