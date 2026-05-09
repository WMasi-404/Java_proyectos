package Objetos;

public class Nodo {
    //Atributos
    private Object Dato;
    private Nodo next;

    //Constructor
    public Nodo(Object D){
        this(D,null);
    }
        
    public Nodo(Object Dato, Nodo next) {
        this.Dato = Dato;
        this.next = next;
    }

    //Metodos
    public Object getNodoDato() {
        return this.Dato;
    }

    public void setNodoDato(Object Dato) {
        this.Dato = Dato;
    }

    public Nodo getNodoNext() {
        return this.next;
    }

    public void setNodoNext(Nodo next) {
        this.next = next;
    }

}
