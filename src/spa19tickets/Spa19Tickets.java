package spa19tickets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import assets.ThemeWindow;

/**
 
 * @author DAGG
 * @version 1.0
 */
public class Spa19Tickets {

    public static void main(String[] args) {
        ThemeWindow tm = new ThemeWindow();
        tm.WindowTheme();
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        JOptionPane.showMessageDialog(null, "!!Hola Mundo", "Spa19Tickets", JOptionPane.INFORMATION_MESSAGE);
        
    }  
}
