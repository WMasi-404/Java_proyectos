package Objetos.Persona_Extends;

import Objetos.Persona;

public class Alumno extends Persona {
    //Atibutos
    private int legajo;
    
    //Constructor
    public Alumno() {
        super("","",0);
        this.legajo = 0;
    }
    public Alumno(String nombre, String apellido, int DNI, int legajo) {
        super(nombre, apellido, DNI);
        this.legajo = legajo;
    }

    //Metodos
    public int getLegajo() {
        return this.legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void mostrarDatos(){
        if(legajo != 0){
            super.mostrarDatos();
            System.out.println("Legajo: " + this.legajo);
        }else{
            System.out.println("No se cargaron Datos...");
        }
    }


}
