package spa19tickets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import assets.ThemeWindow;
import java.io.IOException;
import BBDD.ConexionBD;
import aiep.bean.BNUsuario;
import java.sql.SQLException;

/**
 * @author DAGG
 * @version 1.0
 */
public class Spa19Tickets {

    public static void main(String[] args) throws IOException, SQLException {
        ThemeWindow tm = new ThemeWindow();
        tm.WindowTheme();
        ConexionBD x = new ConexionBD();
        x.getConexion();
        BNUsuario bnu = new BNUsuario();
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String rut;
//        String pass = "";
        String pass;
        
        System.out.println("#### Authentificacion ####");
        System.out.print("Usuario: ");
        rut = bf.readLine();
        System.out.print("Contraseña: ");
//        pass = pass.replace(bf.readLine(), "*");
//        pass = bf.readLine().replace(pass, "*");
        pass = bf.readLine();
        
        if (bnu.Authenticate(rut, pass)) {
            System.out.println("Usuario validado");
        } else {
            System.err.println("Usuario y Contraseña invalidas");
        }
    }  
}
