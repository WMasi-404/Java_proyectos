package Objetos.Figura_Extends;
    import Objetos.Figura;
public class Cuadrado extends Figura {
    //Atributos
    private double lado;

    //Constructor
    public Cuadrado() {
        super(0.0, 0.0);
        this.lado = 0.0;
    }

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    //Metodos
    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * this.lado;
    }
    
}
