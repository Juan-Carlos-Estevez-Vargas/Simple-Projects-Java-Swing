/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Carlos Estevez Vargas
 */
public class CodigoSQL {

    // Variables necesarias
    public Conexion c1 = new Conexion();
    public PreparedStatement pst = null;
    public ResultSet rs = null;
    public int retorno = 0;

    // Método para guardar un cliente
    public int guardarCliente(int id_cliente, String nombre_cliente, String direccion_cliente, String telefono_cliente) {
        Connection con;
        try {
            con = Conexion.conectando(); // Conectandonos a la base de datos
            pst = con.prepareStatement("INSERT INTO clientes (id_cliente, nombre_cliente, direccion_cliente, telefono_cliente) VALUES (?,?,?,?)");

            // Insertando los campos a la base de datos
            pst.setInt(1, id_cliente);
            pst.setString(2, nombre_cliente);
            pst.setString(3, direccion_cliente);
            pst.setString(4, telefono_cliente);

            // Si devuelve 0 NO se insertaron datos, con el 1 si los insertó
            retorno = pst.executeUpdate();
            pst.close(); // Cerrando la conexión
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado al guardar el cliente" + e, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CodigoSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
    public int guardarProducto(int id_producto, String nombre_producto, String descripcion_producto, double precio_producto) {
        Connection con;
        try {
            con = Conexion.conectando(); // Conectandonos a la base de datos
            pst = con.prepareStatement("INSERT INTO productos (id_producto, nombre_producto, descripcion_producto, precio_producto) VALUES (?,?,?,?)");

            // Insertando los campos a la base de datos
            pst.setInt(1, id_producto);
            pst.setString(2, nombre_producto);
            pst.setString(3, descripcion_producto);
            pst.setDouble(4, precio_producto);

            // Si devuelve 0 NO se insertaron datos, con el 1 si los insertó
            retorno = pst.executeUpdate();
            pst.close(); // Cerrando la conexión
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado al guardar el producto" + e, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CodigoSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
    public int guardarProveedor(int id_proveedor, String nombre_proveedor, String direccion_proveedor, String telefono_proveedor) {
        Connection con;
        try {
            con = Conexion.conectando(); // Conectandonos a la base de datos
            pst = con.prepareStatement("INSERT INTO proveedor (id_proveedor, nombre_proveedor, direccion_proveedor, telefono_proveedor) VALUES (?,?,?,?)");

            // Insertando los campos a la base de datos
            pst.setInt(1, id_proveedor);
            pst.setString(2, nombre_proveedor);
            pst.setString(3, direccion_proveedor);
            pst.setString(4, telefono_proveedor);

            // Si devuelve 0 NO se insertaron datos, con el 1 si los insertó
            retorno = pst.executeUpdate();
            pst.close(); // Cerrando la conexión
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado al guardar el producto" + e, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CodigoSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

}
