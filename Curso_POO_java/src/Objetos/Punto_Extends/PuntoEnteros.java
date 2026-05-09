package Objetos.Punto_Extends;

import Objetos.Punto;

public class PuntoEnteros extends Punto{
    //Constructor
    public PuntoEnteros() {
        super(0,0);
    }

    public PuntoEnteros(Integer x, Integer y) {
        super(x, y);
    }

    //Metodos

    public int getIX() {
        return (Integer) super.getX();
    }

    public int getIY(){
        return (Integer) super.getY();
    }

    public void mostrar(){
        System .out.println("Punto Enteros: (" + this.getIX() + ", " + this.getIY() + ")");
    }

}
