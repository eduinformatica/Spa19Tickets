package resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author DAGG
 * @version 1.0
 */
public class ConexionBD {
    
    private Connection conn;
    private String urlBD = "";
    
    // Constructor
    public ConexionBD() {
        JSONParser parser = new JSONParser();
        
        try {
            Object urlFile = parser.parse(new FileReader("src\\config\\settings.json"));
            JSONObject conexion = (JSONObject) urlFile;
            
            JSONArray array = (JSONArray) conexion.get("CONN_POSTGRES");
            for (int i = 0; i < array.size(); i++) {
                JSONObject parametro = (JSONObject) array.get(i);
                
                Class.forName(parametro.get("drivername").toString());
                urlBD = parametro.get("driver") + "://" + parametro.get("host") + ":" + parametro.get("port") + "/";
                urlBD += parametro.get("database") + "?user=" + parametro.get("usuario") + "&password=" + parametro.get("clave");
                
                conn = DriverManager.getConnection(urlBD, parametro.get("usuario").toString(), parametro.get("clave").toString());
//                System.out.println("!!Conexion Exitosa...");
            }
            
        } catch(FileNotFoundException ex) {
            System.err.println("DG-001: Error, el archivo " + ex.getMessage());
        } catch(IOException ex) {
            System.err.println("DG-002: Error, " + ex.getMessage());
        } catch(ParseException ex) {
            System.err.println("DG-003: Error, " + ex.getMessage());
        } catch(ClassNotFoundException ex) {
            System.err.println("DG-004: Error, " + ex.getMessage());
        } catch(SQLException ex) {
            System.err.println("DG-005: Error, " + ex.getMessage());
        }
    }
    
    public Connection getConexion(){
        return conn;
    }
    
}
