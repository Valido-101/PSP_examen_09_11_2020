package ejercicio_3;

public class Main {

	public static void main(String[] args) {

		Hilo_pares pares = new Hilo_pares();
		
		Hilo_impares impares = new Hilo_impares();
		
		pares.start();
		impares.start();
		
	}

}
