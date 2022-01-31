
package proyectoaereopuerto;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionUsuarios {
    Connection connect = null;
    
    public Connection conectar(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/usersairport","root",""); //NOMBRE DE BD
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error..."+ex);
        }
        return connect;
        
    }
}
