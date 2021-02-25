package spa19tickets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import assets.ThemeWindow;
import java.io.IOException;
import resources.ConexionBD;

/**
 
 * @author DAGG
 * @version 1.0
 */
public class Spa19Tickets {

    public static void main(String[] args) throws IOException {
        ThemeWindow tm = new ThemeWindow();
        tm.WindowTheme();
        ConexionBD x = new ConexionBD();
        x.getConexion();
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String rut, pass;
        
        System.out.println("#### Authentificacion ####");
        System.out.print("Usuario: ");
        rut = bf.readLine();
        System.out.print("Contraseña: ");
        pass = bf.readLine();
//        JOptionPane.showMessageDialog(null, "Usuario: "+rut+"\nClave: "+pass, "Informacion Recibida - Spa19Tickets", JOptionPane.INFORMATION_MESSAGE);
    }  
}
