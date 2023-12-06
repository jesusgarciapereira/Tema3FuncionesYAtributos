package ejercicio01;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Principal01 {

	// Creamos el Scanner
	static Scanner sc = new Scanner(System.in);

	// Función menu()
	public static int menu() {

		// Variable de la opción elegida
		int opcionElegida;

		// Mostramos el menú con las opciones
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir");
		System.out.println(); // Salto de línea

		// Asignamos a la variable el valor devuelto por la funcion pideOpcion()
		opcionElegida = Principal01.pideOpcion();

		// La función devolverá el valor asignado a opcionElegida
		return opcionElegida;
	}

	// Función pideOpcion() - DE CREACIÓN PROPIA
	public static int pideOpcion() {

		// Variable de la opción que pediremos al usuario
		int opcion = -1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario un número entero
				System.out.println("Seleccione una opción");
				// Lo leemos y se lo asignamos a la variable
				opcion = sc.nextInt();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable se sale de estos márgenes, repetiremos el bloque
			// de instrucciones del do
		} while (opcion < 0 || opcion > 6);

		// La función devolverá el valor asignado a opcion
		return opcion;
	}

	// Función pideNumero()
	public static double pideNumero() {
		// Variable del número que pediremos al usuario
		double numero = -1;

		// Variable booleana para determinar si el dato es del tipo correcto
		boolean numeroCorrecto = false;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario un número real
				System.out.println("Seleccione un número");
				// Lo leemos y se lo asignamos a la variable numero
				numero = sc.nextDouble();
				// Si es del tipo correcto, le asignamos true a numeroCorrecto
				numeroCorrecto = true;
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable no es del tipo correcto, repetiremos el bloque
			// de instrucciones del do
		} while (!numeroCorrecto);

		// La función devolverá el valor asignado al numero
		return numero;

	}

	// Función main()
	public static void main(String[] args) {
		// Variable de la opción elegida por el usuario
		int opcion;
		// Variables de los números que le pediremos al usuario
		double numA, numB;
		// Variable del resultado que mostraremos
		double resultado;

		// Configuración para permitir en la consola números decimales con punto
		sc.useLocale(Locale.US);

		// Asignamos a la opción el valor devuelto por la función menu()
		opcion = Principal01.menu();

		// Mientras la opcion sea diferente de 0, ejecutaremos estas instrucciones
		while (opcion != 0) {

			// Asignamos a numA el valor devuelto por la funcion pideNumero()
			numA = Principal01.pideNumero();
			// Asignamos a numB el valor devuelto por la funcion pideNumero()
			numB = Principal01.pideNumero();

			// Creamos un objeto de tipo Operaciones01 con los números solicitados al
			// usuario como parámetros
			Operaciones01 operacion = new Operaciones01(numA, numB);

			// Asignamos al resultado el valor devuelto por una de estas funciones, según
			// cada caso del valor de la opción
			resultado = switch (opcion) {
			case 1 -> operacion.suma();
			case 2 -> operacion.resta();
			case 3 -> operacion.multiplicacion();
			case 4 -> operacion.division();
			case 5 -> operacion.max();
			case 6 -> operacion.min();
			default -> Math.sqrt(-1);
			};

			// Si la opcion es 4 y el segundo número es 0, mostrará este mensaje
			if (opcion == 4 && numB == 0)
				System.out.println("No se puede dividir entre 0");
			// En caso contrario, mostrará el valor del resultado
			else
				System.out.println(resultado);

			// Salto de línea
			System.out.println();

			// Asignamos a la opción un nuevo valor devuelto por la función menu()
			opcion = Principal01.menu();
		}

		// Al salir del bucle, mostraremos este mensaje
		System.out.println("Saliendo del programa");

		// Cerramos el Scanner
		sc.close();
	}

}
