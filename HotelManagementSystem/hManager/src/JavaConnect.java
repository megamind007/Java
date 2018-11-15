/**
 * this class will connect to the RoomStatusTabale Database (roomStatusDb.sqlite)
 */
/**
 *
 * @author Md Mohiuddin Chowdhury
 */
import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    Connection connection = null;
    
    public static Connection connecterDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:F:\\tutorials\\javascript\\hMan.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return connection;
        }catch(Exception e){
                //JOptionPane.showMessageDialog(null, e);
                return null;
        }
    }
    
}
