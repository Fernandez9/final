package modelo;

import java.util.Stack;
import javax.swing.JOptionPane;

public class ListaCliente {

    Stack<Clientes> pilaC;

    public ListaCliente() {
        pilaC = new Stack();
    }

    void PushCliente(Clientes q) {
        int pos = pilaC.indexOf(q);

        if (pos == -1) {
            pilaC.push(q);
            JOptionPane.showMessageDialog(null,
                    "Elemento registrado!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "El cliente ya se encuentra registrado!");
        }
    }


}
