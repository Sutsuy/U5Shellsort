package ListasShellsort;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List <Integer> Lista = new ArrayList <Integer> ();
		Lista.add(24);
		Lista.add(1);
		Lista.add(5);
		Lista.add(8);
		Lista.add(2);
		Lista.add(6);
		Lista.add(3);
		Lista.add(7);
		Lista.add(4);
		//int [] arreglo= {24,1,5,8,2,6,3,7,4};
		
		System.out.println("Lista desordenado");	
		
		for(int i=0;i<Lista.size();i++)
		{
			System.out.println(""+ Lista.get(i));
			
		}
		
		metodoShellsort(Lista);
		
		System.out.println("");
		System.out.println("Lista ordenado");
		
		for(int i=0;i<Lista.size();i++)
		{
			System.out.println(""+ Lista.get(i));
			
		}
		
		}



	    private static void metodoShellsort(List <Integer> Lista){
	    	
	    	int division=Lista.size()/2, aux, salto, i;
	    	
	    	for(salto =division; salto !=0;  salto/=2)
	    	{
	    		boolean cambio=true;
	    		
	    		while(cambio){
	    			cambio=false;
	    			
	    			for(i=salto;i<Lista.size();i++)
	    			{
	    				if(Lista.get(i-salto)>Lista.get(i))
	    				{
	    					aux=Lista.get(i);
	    					Lista.set(i,Lista.get(i-salto));
	    					Lista.set(i-salto,aux);
	    					cambio=true;
	    					
	    				}
	    			}
	    			
	    			
	    		}
	    	}
		
		
		

	}

}
