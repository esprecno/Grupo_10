package main;

import Controladores.FXMLMainController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Grupo_10
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) {
        try{
            FXMLLoader loader = new FXMLLoader();
            Parent root = loader.load(getClass().getResourceAsStream("/vistas/FXMLMain.fxml"));
            final FXMLMainController controller = loader.getController();
            controller.setStage(stage);
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/vistas/estilo.css");
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException ex){
            Logger.getLogger(FXMLMainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
