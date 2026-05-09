package Contenedores.PLL_extends;
    import Contenedores.PilaLinkedList;
    import Objetos.Persona;
public class PilaPersona extends PilaLinkedList {
    
    // Constructor  
    public PilaPersona(){
        super();
    }

    // Métodos
    public Persona sacar(){
        return (Persona) super.sacar();
    }
    
}
