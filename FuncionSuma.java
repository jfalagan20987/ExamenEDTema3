import java.util.Scanner;

/**
 * Programa suma, para calcular la suma de dos valores introducidos por teclado
 * @version v1.0
 * @author Miquel
 * @see Para más información ver <a href="https://www.google.com" target="_blank">Google</a>
**/


public class FuncionSuma {

	/**
	 * Variable para guardar el primer sumando
	**/
	private static int primerSumando;

	/**
	 * Varaiable para guardar el segundo sumando
	**/
	private static int segundoSumando; 
	
	/**
	 * Función principal del programa
	 * @param args El parámetro habitual de la función main
	**/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " + suma(primerSumando, segundoSumando));
		
		in.close();

	}
	
	
	/**
	 * Función que realiza la suma de los dos operandos
	 * @param sumando1 Primer sumando de la operación suma
	 * @param sumando2 Segundo sumando de la operación suma
	 * @return Devuelve el resultado de sumar los dos sumandos
	**/
	private static int suma (int sumando1, int sumando2) {
		return sumando1+sumando2;
	}

}
