package Contenedores;
    import Objetos.*;
public class ColaLinkedList implements TADs.ImplementacionCL {
    //Atributos
    protected Nodo frenteC;
    protected Nodo finalC;
    
    //Constructor
    public ColaLinkedList() {
        limpiar();
    }

    //TADs
    public void meter(Object elemento){
        if(estaVacia()){
            frenteC = finalC = new Nodo(elemento);
        }else{
            finalC.setNodoNext(new Nodo(elemento));
            finalC = finalC.getNodoNext();
        }
    }

    public Object sacar(){
        Object elem = null;
        if(!estaVacia()){
            elem = frenteC.getNodoDato();
            frenteC = frenteC.getNodoNext();
        }else{
            System.err.println("La cola esta vacia...");
        }

        return elem;
    }

    public boolean estaVacia(){
        return frenteC == null;
    }

    public void limpiar(){
        frenteC = finalC = null;
    }

    
}
