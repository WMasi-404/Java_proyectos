package Contenedores.CCL_extends.ColaPr_extends;
import Objetos.*;

public class GraphPriorityQueue extends Contenedores.CCL_extends.ColaPrioridad {
	
	
	public boolean esMenor(Object objA, Object objB){
		boolean response=false;
				
		if (((Connection)objA).getConnectionCost()<((Connection)objB).getConnectionCost()){
			response=true;
		}
		return response;
	}

	public boolean esMayor(Object objA, Object objB){
		boolean response=false;

		if (((Connection)objA).getConnectionCost()>((Connection)objB).getConnectionCost()){
			response=true;
		}	
		return response;
	}
	
	public boolean iguales(Object objA, Object objB){
		boolean response=false;
	
		if (((Connection)objA).getConnectionCost()==((Connection)objB).getConnectionCost()){
			response=true;
		}	
		return response;
	}
	
	
	void muestra(){
		Nodo temp; Connection conexion;		
		if (!estaVacia()){
			temp=this.frenteC;
			while (temp!=null){
				conexion=(Connection)temp.getNodoDato();
				System.out.println("Conexion " + conexion.getVertexI() + " - " + conexion.getVertexJ() + ":" + conexion.getConnectionCost());
				temp=temp.getNodoNext();
			}			
		}else{
			System.out.println("Error muestra. Cola vacia");
		}		
	}	
}