package Contenedores.CCL_extends;
import Objetos.*;

public abstract class ColaPrioridad extends Contenedores.ColaLinkedList{
	public abstract boolean esMenor(Object objA, Object objB);
	public abstract boolean esMayor(Object objA, Object objB);
	public abstract boolean iguales(Object objA, Object objB);

	public void meter(Object elemento){
		Nodo node;
		node = new Nodo(elemento);
		if (estaVacia()){
			this.frenteC=this.finalC= new Nodo(elemento);
		} else{
			if (esMenor(elemento, this.frenteC.getNodoDato())){
				node.setNodoNext(this.frenteC);
				this.frenteC=node;

			}else{
				Nodo temp = this.frenteC;
				boolean flag=false;
				while (temp.getNodoNext()!=null && !flag){
					if (esMayor(elemento,temp.getNodoNext().getNodoDato()) ||
							iguales(elemento,temp.getNodoNext().getNodoDato())){
						temp=temp.getNodoNext();
					}else{
						flag=true;
					}
				}
				node.setNodoNext(temp.getNodoNext());
				temp.setNodoNext(node);				
			}
		}
	}	
}
