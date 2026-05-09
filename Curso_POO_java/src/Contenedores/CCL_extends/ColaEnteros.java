package Contenedores.CCL_extends;
import Contenedores.PLL_extends.*;

public class ColaEnteros extends Contenedores.ColaLinkedList{
    
    //Constructor
    public ColaEnteros() {
        super();
    }

    public  Integer sacar(){
        return (int) super.sacar();
    }

    public void meter(int num){
        super.meter(num);
    }

    public void ordenarC(ColaEnteros cola){
        PilaEnteros P1 = new PilaEnteros();
        PilaEnteros Paux = new PilaEnteros();
        while(!cola.estaVacia()){
            int elem = cola.sacar();
            if(P1.estaVacia()){
                P1.meter(elem);
            }else{
                while(!P1.estaVacia()){
                    if(elem > P1.topeP()){
                        Paux.meter(P1.sacar());
                        if(P1.estaVacia()){
                            Paux.meter(elem);
                        }
                    }else{
                        Paux.meter(elem);
                        Paux.meter(P1.sacar());
                        while(!P1.estaVacia()){
                            Paux.meter(P1.sacar());
                        }
                    }
                }
                while(!Paux.estaVacia()){
                    P1.meter(Paux.sacar());
                }
            }
        }
        while(!P1.estaVacia()){
            cola.meter(P1.sacar());
        }

    }

    public void mostrarC(ColaEnteros c){
        ColaEnteros aux = new ColaEnteros();
        System.out.println("Muestra de la Cola: ");
        while(!c.estaVacia()){
            int j = c.sacar();
            System.out.println(j);
            aux.meter(j);
        }
        System.out.println("Fin de la cola...");
        while(!aux.estaVacia()){
            c.meter(aux.sacar());
        }
    }

    
}
