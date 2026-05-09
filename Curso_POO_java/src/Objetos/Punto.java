package Objetos;

public class Punto {
    //Atributos
    private Object x;
    private Object y;

    //Constructor
    public Punto() {
        this.x = null;
        this.y = null;
    }

    public Punto(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    //Metodos
    public Object getX() {
        return this.x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return this.y;
    }

    public void setY(Object y) {
        this.y = y;
    }
    
    public void mostrarPunto(){
        System.out.println("Punto: (" + this.x + ", " + this.y + ")");
    }


}
