package Objetos;

public class NodoDoble {
    //Atributos
    private Object Dato;
    private NodoDoble prev, next;

    //Constructor
    public NodoDoble(Object D){
        this(D,null,null);
    }

    public NodoDoble(Object D, NodoDoble nx){
        this(D,null,nx);
    }

    public NodoDoble( Object D, NodoDoble pr, NodoDoble nx) {
        this.Dato = D;
        this.prev = pr;
        this.next = nx;
    }

    //Metodos
    public Object getNodoDato() {
        return this.Dato;
    }

    public void setNodoDato(Object Dato) {
        this.Dato = Dato;
    }

    public NodoDoble getNodoPrev() {
        return this.prev;
    }

    public void setNodoPrev(NodoDoble prev) {
        this.prev = prev;
    }

    public NodoDoble getNodoNext(){
        return this.next;
    }

    public void setNodoNext(NodoDoble nx){
        this.next = nx;
    }

}


