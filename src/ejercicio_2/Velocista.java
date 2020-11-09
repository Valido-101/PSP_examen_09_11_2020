package ejercicio_2;

import java.util.concurrent.Semaphore;

public class Velocista extends Thread{

	private int velocidad;
	private Posicion posicion;
	private Semaphore semaforo = new Semaphore(1);
	
	public Velocista(int velocidad, String nombre, Posicion posicion) 
	{
		super(nombre);
		
		this.velocidad = velocidad;
		this.posicion = posicion;
	}
	
	public void run() 
	{
		for(int x=1;x<=10;x++) 
		{
			try 
			{
				sleep(velocidad);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.print("=");
		}
		
		try {
			semaforo.acquire();
			
			System.out.println("\n>>>>>>>>>>El corredor "+getName()+" ha quedado en "+posicion.getPosicion()+" ª posición.");
			
			posicion.setPosicion(posicion.getPosicion()+1);
			
			semaforo.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
