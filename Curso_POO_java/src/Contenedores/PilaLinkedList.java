package Contenedores;
    import Objetos.*;
public class PilaLinkedList implements TADs.OperacionesCL1 {
    //Atributos
    protected Nodo pila;

    //Constructor
    public PilaLinkedList() {
        limpiar();
    }

    //TADs
    public void meter(Object elemento){
            pila = new Nodo(elemento, pila);
    }

    public Object sacar(){
        Object elem = null;
        if(!estaVacia()){
            elem = pila.getNodoDato();
            pila = pila.getNodoNext();
        }else{
            System.out.println("La pila esta vacia...");
        }

        return elem;
    }

    public boolean estaVacia(){
        return pila == null;
    }

    public void limpiar(){
        pila = null;
    }

}
