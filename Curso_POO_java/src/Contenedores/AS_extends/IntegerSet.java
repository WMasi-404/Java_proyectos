package Contenedores.AS_extends;
import Objetos.*;
public class IntegerSet extends Contenedores.AbsSet{
	
	public boolean iguales(Object objA, Object objB){
		int valueA, valueB;
		boolean response=false;
		
		valueA=(int)objA;
		valueB=(int)objB;
		if (valueA==valueB){
			response=true;
		}
		return response;
	}
	
	
	public void muestra(){
		Nodo temp;	
		temp=this.conjunto;
		while (temp!=null){
			System.out.println("elemento " + ((int)temp.getNodoDato()));
			temp=temp.getNodoNext();			
		}
	}

}