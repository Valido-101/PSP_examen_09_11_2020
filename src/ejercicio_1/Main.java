package ejercicio_1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Cocinero> cocineros = new ArrayList<Cocinero>();
		
		for(int x=0;x<(int)(Math.random()*10+1);x++) 
		{
			cocineros.add(new Cocinero("Cocinero "+(x+1), new ArrayList<Cliente>()));
			
			for(int y=0;y<(int)(Math.random()*10+1);y++) 
			{
				cocineros.get(x).getClientes().add(new Cliente("Cliente "+(y+1)));
			}
			
			cocineros.get(x).start();
		}
		
	}

}
