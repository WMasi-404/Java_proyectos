package Objetos;

public class Transaccion {
    
    //Metodos
    private String tipo;
    private double monto;
    private long fecha;
    private String descripcion;

    //Constructor
    public Transaccion(String tipo, double monto, long fecha, String descripcion){
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    //Getters
    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public long getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
