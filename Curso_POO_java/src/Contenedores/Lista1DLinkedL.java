package Contenedores;
    import Objetos.NodoDoble;
public abstract class Lista1DLinkedL extends Lista0DLinkedL implements TADs.OperacionesCL3 {
    
    public void insertar(Object elemento, int posicion){
        NodoDoble nodo;
        if(posicion > tamanio() || posicion < 0){
            System.out.println("Error: posicion inexistente...");
        }else{
            if(posicion == 0){
                if(!estaVacia()){
                    this.frenteL = new NodoDoble(elemento,null,this.frenteL);
                    this.frenteL.getNodoNext().setNodoPrev(this.frenteL);
                }else{
                    this.frenteL = this.finalL = new NodoDoble(elemento);
                }
            }else{
                if(posicion == tamanio()){
                    this.finalL = new NodoDoble(elemento,this.finalL,null);
                    this.finalL.getNodoPrev().setNodoNext(this.finalL);
                }else{
                    NodoDoble prev, next;
                    prev = this.frenteL;
                    next = this.frenteL.getNodoNext();
                    for(int counter = 1; counter < posicion; counter++){
                        prev = prev.getNodoNext();
                        next = next.getNodoNext();
                    }
                    nodo = new NodoDoble(elemento, prev, next);
                    prev.setNodoNext(nodo);
                    next.setNodoPrev(nodo);
                }
            }
            this.ultimo++;
        }
    }

    public void reemplazar(Object elemento, int posicion){
        if(estaVacia()){
            System.out.println("Error: lista vacia...");
        }else{
            if(posicion >= tamanio() || posicion < 0){
                System.out.println("Error: la posicion no existe...");
            }else{
                if(posicion == 0){
                    this.frenteL.setNodoDato(elemento);
                }else{
                    if(posicion == tamanio() - 1){
                        this.finalL.setNodoDato(elemento);
                    }else{
                        NodoDoble temp;
                        temp = this.frenteL;
                        for(int counter = 0; counter < posicion; counter++){
                            temp = temp.getNodoNext();
                        }
                        temp.setNodoDato(elemento);
                    }
                }
            }
        }
    }

    public int buscar(Object elemento){
        int posicion = -1;
        int contador = 0;
        Object unElem;
        NodoDoble temp;
        temp = this.frenteL;
        while(temp != null && posicion == -1){
            unElem = temp.getNodoDato();
            if(iguales(unElem,elemento)){
                posicion = contador;
            }else{
                temp = temp.getNodoNext();
                contador++;
            }
        }

        return posicion;
    }

    public abstract boolean iguales(Object elemL, Object elem);
    
}
