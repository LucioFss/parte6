public class TetsCola {
    public static void main(String[] args) {
        ColaListaArreglo<Integer> cola1 = new ColaListaArreglo<>();
        cola1.encolar(12);
        cola1.encolar(22);
        cola1.encolar(32);
        cola1.encolar(42);
        cola1.encolar(52);
        System.out.println(cola1.esVacia());
        cola1.imprimir();
        System.out.println(cola1.desencolar());
        System.out.println(cola1.desencolar());
        System.out.println(cola1.desencolar());
        cola1.imprimir();
        cola1.vaciar();
        System.out.println(cola1.esVacia());

        ColaListaEnlazada<String> cola2 = new ColaListaEnlazada<>();
        cola2.encolar("LUCAS");
        cola2.encolar("RAFA");
        cola2.encolar("ROBER");
        cola2.encolar("PAULO");
        cola2.encolar("PABLO");
        System.out.println(cola2.esVacia());
        cola2.imprimir();
        System.out.println(cola2.desencolar());
        System.out.println(cola2.desencolar());
        System.out.println(cola2.desencolar());
        cola2.imprimir();
        cola2.vaciar();
        System.out.println(cola2.esVacia());
    }
}
