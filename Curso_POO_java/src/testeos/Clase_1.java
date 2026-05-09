package testeos;
    import Contenedores.CCL_extends.ColaEnteros;

public class Clase_1{
    public static void main(String[] args){
        ColaEnteros cola = new ColaEnteros();
        cola.meter(8);
        cola.meter(3);
        cola.meter(10);
        cola.meter(1);
        cola.meter(5);
        cola.meter(7);
        cola.meter(2);
        cola.mostrarC(cola);
        cola.ordenarC(cola);
        cola.mostrarC(cola);
    }
}
