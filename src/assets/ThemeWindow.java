package assets;

/**
 *
 * @author ites_
 * @version 1.0
 */
public class ThemeWindow {
    
    public void WindowTheme() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(spa19tickets.Spa19Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}
