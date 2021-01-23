
package Controller;
import javax.swing.JTextField;
public class validateInput {
    
    public static boolean validarExistenciaCampos(JTextField CampoTexto){
        return CampoTexto.getText().matches("[a-zA-Z]+");
    }
    
}
