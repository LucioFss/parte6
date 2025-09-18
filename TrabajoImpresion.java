public class TrabajoImpresion {
    public static void main(String[] args) {
        ColaListaArreglo<String> colaImpresion = new ColaListaArreglo<>();
        colaImpresion.encolar("Trabajo1.txt");
        colaImpresion.encolar("Trabajo2.pdf");
        colaImpresion.encolar("Trabajo3.doc");

    }
}
