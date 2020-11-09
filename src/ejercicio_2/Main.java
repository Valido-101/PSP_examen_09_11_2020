package ejercicio_2;

public class Main {

	public static void main(String[] args) {

		Posicion posicion = new Posicion();
		
		Velocista v1 = new Velocista(1000,"Usain Bolt",posicion);
		Velocista v2 = new Velocista(3000,"Rayo McQueen",posicion);
		Velocista v3 = new Velocista(500,"Flash",posicion);
		
		v1.start();
		v2.start();
		v3.start();
		
	}

}
