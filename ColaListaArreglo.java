/**
 * CLASE QUE IMPLEMENTA UNA SIMULACION DE COLA "El primero que entra, el primero que sale"
 * Se implementa mediante la clase ListaArreglo
 */
public class ColaListaArreglo<T> implements Cola<T>{
    private ListaArreglo<T> lista;

    /**
     * Constructor
     * Se incializa la lista y sus metodos
     */
    public ColaListaArreglo(){
        this.lista = new ListaArreglo<>();
    }

    /**
     * Metodo que encola un elemento en la lista
     * @param T elemento a encolar
     */
    @Override
    public void encolar(T item) {
        lista.insertarInicio(item);
    }

    /**
     * Metodo que desencola desde el primer elemento ingresado y lo devuelve
     * @return T elemento desencolado
     */
    @Override
    public T desencolar() {
        if(lista.esVacia()){
            throw new IndexOutOfBoundsException("Cola vacia");
        }
        T aux = lista.obtenerUltimo();
        lista.eliminarUltimo();
        return aux;
    }

    /**
     * Metodo que devuelve si la lista esta vacia, true o false
     * @return True si la cola no tiene elementos, False si tiene elementos encolados
     */
    @Override
    public boolean esVacia() {
        return lista.esVacia();
    }

    /**
     * Metodo que desencola todos los elementos de la lista y no los devuelve 
     */
    @Override
    public void vaciar() {
        while(!lista.esVacia()){
            lista.eliminarPrimero();
        }
    }

    /**
     * Metodo que imprime en el terminal la cola
     */
    @Override
    public void imprimir(){
        lista.imprimir();
    }
    
} 