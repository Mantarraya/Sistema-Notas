package sistema;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SistemaCurso extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = 
           FXMLLoader.load(getClass().getResource("/sistema/SistemaCurso.fxml"));
 
        Scene scene = new Scene(root);
        stage.setTitle("Sistema de evaluacion de cursos");
        stage.setScene(scene);
        stage.show();
        
    }
    
   public static void main(String[] args) {
      launch(args);
   }
}