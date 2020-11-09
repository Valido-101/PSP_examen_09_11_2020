package ejercicio_1;

public class Cliente {

	private int tiempo_pedido;
	private String nombre;
	
	public Cliente(String nombre) 
	{
		tiempo_pedido=(int)(Math.random()*5+1000);
		this.nombre = nombre;
	}

	public int getTiempo_pedido() {
		return tiempo_pedido;
	}

	public void setTiempo_pedido(int tiempo_pedido) {
		this.tiempo_pedido = tiempo_pedido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
