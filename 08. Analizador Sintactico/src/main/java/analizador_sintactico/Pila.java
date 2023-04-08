package analizador_sintactico;

public class Pila {

    private Nodo ultimoValorIngresado;

    public Pila() {
        this.ultimoValorIngresado = null;
    }

    //Metodo para insertar dentro de la pila
    public void insertar(char valor) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = valor;

        if (ultimoValorIngresado == null) {
            nuevo_nodo.siguiente = null;
            ultimoValorIngresado = nuevo_nodo;
        } else {
            nuevo_nodo.siguiente = ultimoValorIngresado;
            ultimoValorIngresado = nuevo_nodo;
        }
    }

    //Metodo para extraer de la pila
    public char extraer() {
        if (ultimoValorIngresado != null) {
            char informacion = ultimoValorIngresado.informacion;
            ultimoValorIngresado = ultimoValorIngresado.siguiente;
            return informacion;
        } else {
            return Character.MAX_VALUE;
        }
    }

    //Metodo para saber si la pila esta vacia
    public boolean pilaVacia() {
        return ultimoValorIngresado == null;
    }
}
