package Contenedores;
    import Objetos.*;
public abstract class Lista0SLinkedL implements TADs.OperacionesCL2{
    
    //Atributos
    protected Nodo frenteL, finalL;
    protected int ultimo;

    //Constructor
    public Lista0SLinkedL(){
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

    public void eliminar(int pos){
        if(estaVacia()){
            System.out.println("Error: lista vacia...");
        }else{
            if(pos >= tamanio() || pos < 0){
                System.out.println("Error: posicion inexistente...");
            }else{
                if(pos == 0){
                    if(this.frenteL == this.finalL){
                        limpiar();
                    }else{
                        this.frenteL = this.frenteL.getNodoNext();
                        this.ultimo--;
                    }
                }else{
                    if(pos == tamanio() - 1){
                        Nodo temp;
                        temp = this.frenteL;
                        while(temp.getNodoNext() != this.finalL){
                            temp = temp.getNodoNext();
                        }
                        this.finalL = temp;
                        temp.setNodoNext(null);
                    }else{
                        Nodo prev, next;
                        prev = this.frenteL;
                        next = this.frenteL.getNodoNext();
                        for(int counter = 1; counter < pos; counter++){
                            prev = next;
                            next = next.getNodoNext();
                        }
                        prev.setNodoNext(next.getNodoNext());
                    }
                    this.ultimo--;
                }
            }
        }
    }

    public Object devolver(int pos){
        Object elem = null;
        if(estaVacia()){
            System.out.println("ERROR: lista vacia...");
        }else{
            if(pos >= tamanio() || pos < 0 ){
                System.out.println("ERROR: posicion inexistente...");
            }else{
                Nodo temp;
                temp = this.frenteL;
                for(int counter = 0; counter < pos; counter++){
                    temp = temp.getNodoNext();
                }
                elem = temp.getNodoDato();
            }
        }

        return elem;
    }

    public void insertarFrente(Object elem){
        Nodo nvo = new Nodo(elem, this.frenteL);
        this.frenteL = nvo;
        if(this.finalL == null){
            this.finalL = nvo;
        }
        this.ultimo++;
    }

    public abstract int buscar(Object elem);

}
