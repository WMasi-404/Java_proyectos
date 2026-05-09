package Contenedores.PLL_extends;

import Contenedores.*;

public class PilaEnteros extends PilaLinkedList {
   
    // Constructor
    public PilaEnteros() {
        super();
    }

    // Métodos
    public Integer sacar(){
        return (int) super.sacar();
    }

    public Integer topeP(){
        int a = this.sacar();
        this.meter(a);
        return a;
    }

    public void ordenar(PilaEnteros p){
        ColaLinkedList CA = new ColaLinkedList();
        ColaLinkedList C1 = new ColaLinkedList();

        while(!p.estaVacia()){
            int elem = (Integer)p.sacar();
            if(C1.estaVacia()){
                C1.meter(elem);
            }else{
                while(!C1.estaVacia()){
                    int aux = (Integer)C1.sacar();
                    if(elem > aux){
                        CA.meter(elem);
                        elem = aux;
                    }else{
                        CA.meter(aux);
                    }
                }
                CA.meter(elem);
                while(!CA.estaVacia()){
                    C1.meter(CA.sacar());
                }
            }
        }
        while(!C1.estaVacia()){
            p.meter(C1.sacar());
        }
    }

    
}