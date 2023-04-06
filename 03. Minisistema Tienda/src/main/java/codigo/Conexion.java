/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Carlos Estevez Vargas
 */
public class Conexion {

    // Guardamos en variables lo que necesitamos
    public static String driver = "com.mysql.jdbc.Driver";
    public static String user = "root";
    public static String password = "";
    public static String url = "jdbc:mysql://localhost:3306/minisistema_tienda";

    // Método para efectuar la conexión
    public static Connection conectando() throws ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.err.println("Conexión exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error " + ex, "", JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }
}
