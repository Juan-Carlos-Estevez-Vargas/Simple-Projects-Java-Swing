/*
    El supermercado El Futuro está creciendo en la cantidad de productos que 
    ofrece a sus clientes. Don José está teniendo problemas en llevar manualmente 
    la cantidad de productos que tiene disponibles para la venta. 

    Mientras comprabas el mercado de la semana,  escuchaste esta conversación y 
    decides ayudarlo. Don José te cuenta en mayor detalle los problemas que ha 
    tenido y le propones una aplicación de escritorio.  

    Don José te da los siguientes requerimientos:

        * Registrar productos con su nombre, categoría, cantidad y precio
        * Listar todos los productos creados
        * Consultar la información de un producto en específico
        * Eliminar un producto

    Planteamiento del reto

        Con respecto a la situación planteada, ¿De qué manera crees que se puede 
        llegar a automatizar el proceso de almacenamiento, consulta y eliminación 
        de productos?

 */
package logica;

/**
 * @author Juan Carlos Estevez Vargas
 */
public class Producto {

    private int id, cantidad;
    private String nombre, categoria;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, String categoria, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
}
