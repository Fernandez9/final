package modelo;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class ListaCliente {

    Clientes tope;

    public ListaCliente() {
        tope = null;
    }

    
    //dentro del boton login, validamos, si es true, cambia de ventana 
    //y oculta la de login, si es false, se mantiene la ventana
    
    Clientes login(String corre, String contras) {

        
        Clientes p = tope;
        do {

            if (p.getCorreo().equals(corre) && p.getContra().equals(contras)) {

                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Bienvenido");
                alert.setContentText("Bienvenido");
                alert.showAndWait();
                return p;

            } else if (p.getCorreo().equals(corre) && p.getContra().compareTo(contras) != 0) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Contraseña incorrecta");
                alert.showAndWait();
                return null;

            } 
            p=p.sig;
        }while (p != tope);
        
         Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("No se encuentra registrado");
                alert.showAndWait();
        
        return null;
    }
    
     public Clientes buscarId(int registro) {

        if (tope == null) {
            return null;
        } else {

            Clientes p = tope;

            do {

                if (p.getId()==registro) {
                    return p;
                } else {
                    p = p.sig;
                }

            }while (p!=tope);

        }

        return null;
    }

    
    public Clientes CrearNodo(TextField cod,TextField name, TextField email,TextField password,
            TextField cellph,TextField localiza,TextField pago) {

        Clientes buscar = null;

        try {
            buscar = buscarId(Integer.parseInt(cod.getText()));

            
                    if (buscar != null) {
                        JOptionPane.showMessageDialog(null,
                                "Error: Este ´n° de registro´ ya se encuentra "
                                + "registrado.  Reemplazarlo!");
                        cod.setText("");
                        cod.requestFocus();
                        return null;
                    }else{

                    Clientes info = new Clientes(Integer.parseInt(cod.getText()),name.getText(),
                            email.getText(),password.getText(),Integer.parseInt(cellph.getText()),
                                    localiza.getText(),pago.getText());
                    return info;
                    }
               
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
            return null;
        }

    }

    
    
    
    void registrar(TextField cod,TextField name, TextField email,TextField password,
            TextField cellph,TextField localiza,TextField pago){
        
        Clientes info = CrearNodo(cod, name, email, password, cellph, localiza, pago);

        if (info != null) {
            if (tope == null) {
                tope = info;
                JOptionPane.showMessageDialog(null,
                        "Se ha registrado un nuevo elemento "
                        + "a la lista.  La lista estaba vacía.");
            } else {
  //Enlazamos el nuevo nodo a la lista
                info.sig = tope;
                //Ahora se debe mover cab al primer 
                //nuevo elemento
                tope = info;
                JOptionPane.showMessageDialog(null,
                        "Se ha registrado un nuevo elemento al "
                        + "inicio de la lista.");
            }
        } else {
        }

        
    }
    
    

}
