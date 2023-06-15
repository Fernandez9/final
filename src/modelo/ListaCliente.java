package modelo;

import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

public class ListaCliente {

    Clientes tope;

    public ListaCliente() {
        tope = null;
    }

    
    //dentro del boton login, validamos, si es true, cambia de ventana 
    //y oculta la de login, si es false, se mantiene la ventana
    
    boolean login(String corre, String contras) {

        while (tope != null) {

            Clientes p = tope;

            if (p.getCorreo().equals(corre) && p.getContra().equals(contras)) {

                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Bienvenido");
                alert.setContentText("Bienvenido");
                alert.showAndWait();
                return true;

            } else if (p.getCorreo().equals(corre) && p.getContra().compareTo(contras) != 0) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Contraseña incorrecta");
                alert.showAndWait();
                return false;

            } else if (p.getCorreo().compareTo(corre) != 0) {

                 Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("No se encuentra registrado");
                alert.showAndWait();
                
                return false;
            }

        }
        
         Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("No hay clientes registrados");
                alert.showAndWait();
        
        return false;
    }
    
    
    void registrar(){
        
    }
    
    

}
