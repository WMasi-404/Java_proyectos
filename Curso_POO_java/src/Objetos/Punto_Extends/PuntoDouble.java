package Objetos.Punto_Extends;

import Objetos.Punto;

public class PuntoDouble extends Punto{
    //Constructor
    public PuntoDouble() {
        super(0.0,0.0);
    }

    public PuntoDouble(Double x, Double y) {
        super(x, y);
    }

    //Metodos
    public double getDX() {
        return (Double) super.getX();
    }

    public double getDY(){
        return (Double) super.getY();
    }

    public void mostrar(){
        System .out.println("Punto Double: (" + this.getX() + ", " + this.getY() + ")");
    }
    
}
