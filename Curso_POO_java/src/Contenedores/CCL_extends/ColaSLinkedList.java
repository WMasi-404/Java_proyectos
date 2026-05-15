package Contenedores.CCL_extends;
import Objetos.*;

public class ColaSLinkedList extends Contenedores.ColaLinkedList{

	public void meter(Object elemento){
		if (!estaVacia()){
			this.finalC.setNodoNext(new Nodo(elemento));
			this.finalC=this.finalC.getNodoNext();
			// nuevo nodo es el ultimo.
		}else{
			this.frenteC=this.finalC= new Nodo(elemento);	
		}
	}
		
}
