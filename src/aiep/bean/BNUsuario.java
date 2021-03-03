package aiep.bean;

import aiep.model.Usuario;
import BBDD.ConexionBD;
import aiep.model.Perfil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author DGOMEZ
 * @version 1.0
 */
public class BNUsuario extends ConexionBD {
    private Statement stmt = null;
    private ResultSet rs = null;
    private String query = "";
    
    Usuario usu = new Usuario();
    Perfil per = new Perfil();
    
//    public Usuario Authenticate(String rut, String clave) throws SQLException{
    public boolean Authenticate(String rut, String clave) throws SQLException{
        getConexion();
        query ="SELECT usu_rut, usu_clave \n";
        query+="FROM usuario u \n";
        query+="INNER JOIN perfil p ON p.idperfil = u.per_idperfil \n";
        query+="WHERE usu_rut = '" + rut + "' and usu_clave = md5('" + clave + "') \n";

        try {
            stmt = getConexion().createStatement();
            rs = stmt.executeQuery(query);
            if (rs.next()) {
//                usu.setUsuRut(rs.getString("usu_rut"));
//                usu.setUsuClave(rs.getString("usu_clave"));
//                per.setPerId(rs.getInt("per_idperfil"));
                return true;
            }
            
            rs.close();
            stmt.close();
        }catch(SQLException ex){
            System.err.println("Error, "+ex);
        } finally {
            getConexion().close();
        }

        return false;
//        return usu;
    }
    
}
