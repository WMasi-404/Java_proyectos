package Objetos;

import Objetos.Punto_Extends.PuntoDouble;

public abstract class Figura extends PuntoDouble {
    
    //Constructor
    public Figura() {
        super(0.0, 0.0);
    }

    public Figura(double x, double y) {
        super(x, y);
    }

    //Metodos
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

}
