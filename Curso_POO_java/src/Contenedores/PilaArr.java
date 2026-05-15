package Contenedores;

public class PilaArr implements TADs.OperacionesCL1{
    // Atributos
    protected Object[] pila;
    protected int cab;
    protected int tam;

    // Constructor
    public PilaArr(int tam) {
        this.tam = tam;
        this.pila = new Object[this.tam];
        limpiar();
    }

    // Operaciones del TAD
    public void meter(Object elem) {
        if(!estallena()){
            incrementarcab();
            this.pila[this.cab] = elem;
        }else{
            System.out.println("Pila llena");
        }
    }

    public Object sacar(){
        Object elem = null;
        if(!estaVacia()){
            elem = this.pila[this.cab];
            decrementarcab();
        }else{
            System.out.println("Pila vacía");
        }

        return elem;
    }

    public boolean estaVacia() {
        return this.cab == -1;
    }

    public void limpiar() {
        this.cab = -1;
    }
    
    //Metodos
    public boolean estallena() {
        return this.cab == this.tam - 1;
    }

    private void incrementarcab() {
        this.cab++;
    }

    private void decrementarcab() {
        this.cab--;
    }


}
