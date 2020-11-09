package ejercicio_3;

public class Hilo_impares extends Thread{
	private int total;
	private int num_impar;
	
	public Hilo_impares() 
	{
		super("Impares -> ");
		total=0;
		num_impar=0;
	}
	
	public void run() 
	{
		for(int x=1;x<=6;x++) 
		{
			num_impar=(((int)(Math.random()*100+1))*2)-1;
			System.out.println(getName()+num_impar);
			total+=num_impar;
		}
		
		System.out.println("Suma de todos los impares: "+total);
	}
}
