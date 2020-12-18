
package pacificinstitute;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Valentina
 */
public class Conexion {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public String dataBase = "pacificInstitute";
    public String hostname = "localhost";
    public String port = "3306";
    public String url = "jdbc:mysql://"+ hostname + ":"+ port + "/" + dataBase + "?useSSL=false";
    public String username = "root";
    public String password = "RaMaPo20+";
    
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName(driver);
            con = (Connection)DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    } 
}
