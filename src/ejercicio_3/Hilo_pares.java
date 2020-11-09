package ejercicio_3;

public class Hilo_pares extends Thread{

	private int total;
	private int num_par;
	
	public Hilo_pares() 
	{
		super("Pares -> ");
		total=0;
		num_par=0;
	}
	
	public void run() 
	{
		for(int x=1;x<=6;x++) 
		{
			num_par=((int)(Math.random()*100+1))*2;
			System.out.println(getName()+num_par);
			total+=num_par;
		}
		
		System.out.println("Suma de todos los pares: "+total);
	}
	
}
