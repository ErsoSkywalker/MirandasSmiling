
package Controller;
import Model.cDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
public class LoginController {
    static cDatos bd = new cDatos();
    public static boolean login(String Usuario, String Contrasena) throws SQLException{
        boolean Bandera = false;
        bd.conectar();
        ResultSet res = bd.consulta("call spLogin('"+Usuario+"','"+Contrasena+"');");
        while(res.next()){
            Bandera = !(res.getInt("idResultado") == 0);
        }
        bd.cierraConexion();
        
        return Bandera;
    }
    
}
