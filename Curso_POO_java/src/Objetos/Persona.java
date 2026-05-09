package Objetos;

public class Persona {
    //Atributos
    protected String nombre;
    protected String apellido;
    protected int DNI;

    //Constructor
    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.DNI = 0;
    }

    public Persona(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    //Metodos
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return this.DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarDatos(){
        if(this.DNI != 0){
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Apellido: " + this.apellido);
            System.out.println("DNI: " + this.DNI);
        }else{
            System.out.println("No se cargaron Datos...");
        }
    }
    
}
