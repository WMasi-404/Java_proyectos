package Objetos.Figura_Extends;
    import Objetos.Figura;

public class Circulo extends Figura {
    //Atributos
    private double radio;

    //Constructor
    public Circulo() {
        super(0.0, 0.0);
        this.radio = 0.0;
    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    //Metodos 
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    

}
