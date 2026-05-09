package Contenedores;
    import Objetos.*;

public abstract class Lista2DLinkedL extends Lista0DLinkedL implements TADs.OperacionesCL4 {
    
    //lista ordenada
    public void instertar(Object elemento){
        NodoDoble nodo;
        if(estaVacia()){ 
            this.frenteL = this.finalL = new NodoDoble(elemento);
        }else{
            if(esMenor(elemento, this.frenteL.getNodoDato())){
                this.frenteL = new NodoDoble(elemento, null, this.frenteL);
                this.frenteL.getNodoNext().setNodoPrev(this.frenteL);
            }else{
                if(esMayor(elemento, this.finalL.getNodoDato()) || iguales(elemento, this.finalL.getNodoDato())){
                    this.finalL = new NodoDoble(elemento, this.finalL, null);
                    this.finalL.getNodoPrev().setNodoNext(this.finalL);
                }else{
                    //al medio 
                    NodoDoble temp = this.frenteL;
                    boolean flag = false;
                    while(temp.getNodoNext() != null && !flag){
                        if(esMayor(elemento, temp.getNodoNext().getNodoDato()) || iguales(elemento, temp.getNodoNext().getNodoDato())){
                            temp = temp.getNodoNext();
                        }else{
                            flag = true;
                        }
                    }
                    //insercion al medio, entre temp y temp.next
                    nodo = new NodoDoble(elemento, temp, temp.getNodoNext());
                    temp.getNodoNext().setNodoPrev(nodo);
                    temp.setNodoNext(nodo);
                }
            }
        }

        this.ultimo++;
    }

    public abstract boolean iguales(Object elemento1, Object elemento2);
    public abstract boolean esMayor(Object elemento1, Object elemento2);
    public abstract boolean esMenor(Object elemento1, Object elemento2);

    public int buscar(Object elemento){
        int pos = -1;
        int cont = 0;
        Object unElem;
        NodoDoble temp;
        temp = this.frenteL;
        while(temp != null && pos == -1){
            unElem = temp.getNodoDato();
            if(iguales(elemento, unElem)){
                pos = cont;
            }else{
                temp = temp.getNodoNext();
                cont++;
            }
        }

        return pos;
    }

}
