public class ColaListaEnlazada<T> implements Cola<T> {
    private ListaEnlazada<T> listaE;

    public ColaListaEnlazada(){
        this.listaE = new ListaEnlazada<>();
    }

    @Override
    public void encolar(T item){
        listaE.insertarInicio(item);
    }

    @Override
    public T desencolar(){
        T aux = listaE.obtenerUltimo();
        listaE.eliminarUltimo();
        return aux;
    }

    @Override
    public boolean esVacia(){
        return listaE.esVacia();
    }

    @Override
    public void vaciar(){
        while(!listaE.esVacia()){
            listaE.eliminarUltimo();
        }
    }

    @Override
    public void imprimir(){
        listaE.imprimir();
    }
}
