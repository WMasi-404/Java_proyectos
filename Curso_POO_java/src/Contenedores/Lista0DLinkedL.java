package Contenedores;
    import Objetos.NodoDoble;
public abstract class Lista0DLinkedL implements TADs.OperacionesCL2 {
    
    //Atributos
    protected NodoDoble frenteL, finalL;
    protected int ultimo;

    //Constructor
    public Lista0DLinkedL(){
        this.limpiar();
    }

    //TADs OperacionesCL2
    public void limpiar(){
        this.frenteL = this.finalL = null;
        this.ultimo = -1;
    }

    public boolean estaVacia(){
        return (this.frenteL == null);
    }

    public int tamanio(){
        return this.ultimo + 1;
    }

    public void eliminar(int posicion){
        if(estaVacia()){
            System.out.println("Error: lista vacia...");
        }else{
            if(posicion >= tamanio() || posicion < 0){
                System.out.println("Error: posicion inexistente...");
            }else{
                if(posicion == 0){
                    if(this.frenteL == this.finalL){
                        limpiar();
                    }else{
                        this.frenteL = this.frenteL.getNodoNext();
                        this.frenteL.setNodoPrev(null);
                        this.ultimo--;
                    }
                }else{
                    if(posicion == tamanio() - 1){
                        this.finalL = this.finalL.getNodoPrev();
                        this.finalL.setNodoNext(null);
                    }else{
                        NodoDoble prev, next;
                        prev = this.frenteL;
                        next = this.frenteL.getNodoNext();
                        for(int counter = 1; counter < posicion; counter++){
                            prev = prev.getNodoNext();
                            next = next.getNodoNext();
                        }
                        next = next.getNodoNext();
                        prev.setNodoNext(next);
                        next.setNodoPrev(prev);
                    }
                    this.ultimo--;
                }
            }
        }
        
    }

    public Object devolver(int posicion){
        Object elemento = null;
        if(estaVacia()){
            System.out.println("Error devolver: lista vacia...");
        }else{
            if(posicion >= tamanio() || posicion < 0){
                System.out.println("Error devolver: La posicion no exite...");
            }else{
                NodoDoble temp;
                temp = this.frenteL;
                for(int counter = 0; counter < posicion; counter++){
                    temp = temp.getNodoNext();
                }
                elemento = temp.getNodoDato();
            }
        }

        return elemento;
    }

    public abstract int buscar(Object elemento);

}
