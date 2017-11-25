package sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginInterfaceController implements Initializable {
    
    @FXML private Label lblMensaje;
    @FXML private TextField txtUsuario;
    @FXML private TextField txtContrasena;
    
    @FXML
    private void btnIngresar(ActionEvent event) throws Exception{
        if (txtUsuario.getText().equals("admin") && txtContrasena.getText().equals("1234")){
            ((Node) (event.getSource())).getScene().getWindow().hide();
            try {
            Parent root = FXMLLoader.load(getClass().getResource( "/sistema/SistemaCurso.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.show();
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("excepcion: Nombre de archivo incorrecto: Sistema");

        }
        }
        else{
            lblMensaje.setText("Usuario o contraseña invalido");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
