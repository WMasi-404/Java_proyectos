package Contenedores;

public class ColaArr implements TADs.OperacionesCL1{
    // Atributos
    protected Object[] cola;
    protected int finalC, frenteC, tamC;

    // Constructor
    public ColaArr(int tamC) {
        this.tamC = tamC;
        this.cola = new Object[this.tamC];
        limpiar();
    }
   
    //Operaciones del TAD
    public void limpiar(){
        this.finalC = this.frenteC = tamC - 1;
    }

    public void meter(Object elem) {
        if(!estallena()){
            if(this.finalC == this.tamC - 1){
                this.finalC = 0;
            }else{
                incrementarfinal();
            }
            this.cola[this.finalC] = elem;
        }else{
            System.out.println("Cola llena");
        }
    }

    public Object sacar(){
        Object elem = null;
        if(!estaVacia()){
            if(this.frenteC == this.tamC - 1){
                this.frenteC = 0;
            }else{
                incrementarfrente();
            }
            elem = this.cola[this.frenteC];
        }else{
            System.out.println("Cola vacía");
        }

        return elem;
    }

    public boolean estaVacia() {
        return this.finalC == this.frenteC;
    }

    // Métodos auxiliares
    private void incrementarfinal() {
        this.finalC++;
    }

    private void incrementarfrente() {
        this.frenteC++;
    }

    public boolean estallena() {
        int p;
        if(this.finalC == this.tamC - 1){
            p = 0;
        }else{
            p = this.finalC + 1;
        }

        return (p == this.frenteC);
    } 

}
