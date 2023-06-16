package controler;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.ListaCliente;

public class LoginController implements Initializable {

    @FXML
    private TextField lblUsuario;

    @FXML
    private TextField lblContra;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btnRegistro;

    @FXML
    private void btnLoginAdmin(ActionEvent event) {

    }

    @FXML
    private void btnLoginCliente(ActionEvent event) {
          ListaCliente ls=new ListaCliente();
          
          ls.login(lblUsuario.getText(),lblContra.getText());
    }

    @FXML
    private void btnRegistro(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
