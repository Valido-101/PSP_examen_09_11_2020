package ejercicio_1;

import java.util.ArrayList;

public class Cocinero extends Thread{

	ArrayList<Cliente> clientes;
	
	public Cocinero(String nombre, ArrayList<Cliente> clientes) 
	{
		super(nombre);
		
		this.clientes = clientes;
	}
	
	public void run() 
	{
		for(int x=0;x<clientes.size();x++) 
		{
			System.out.println("El cocinero "+getName()+" va a comenzar el  pedido del cliente "+clientes.get(x).getNombre()+"\n");
			try 
			{
				sleep(clientes.get(x).getTiempo_pedido());
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("El cocinero "+getName()+" ha terminado el  pedido del cliente "+clientes.get(x).getNombre()+"\n");
			
		}
		
		System.out.println("El cocinero "+getName()+" ha terminado todos los pedidos."+"\n");
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}
