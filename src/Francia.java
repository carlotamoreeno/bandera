import java.util.Scanner;

public class Francia {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Escribe un número del 1 al 9: ");
		int numero1 = numero.nextInt();
		if (numero1 > 9) {
			System.out.println("Este numúmero es mayor que 9");
		} else if (numero1 < 1) {
			System.out.println("Este numero es menor que 1");
		} else {
			if (numero1 < 4) {
				System.out.println("La parte de la bandera es azul");
			} else if (numero1 < 7) {
				System.out.println("La parte de la bandera es blanca");
			} else {
				if (numero1 < 10) {
					System.out.println("La parte de la bandera es roja");
				}
			}
		}
	}

}
