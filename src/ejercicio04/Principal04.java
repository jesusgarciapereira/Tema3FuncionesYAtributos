package ejercicio04;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//1. Volumen
//2. Área
//0. Salir
//
//Seleccione una opción
//
//ENTRADA: Elijo Volumen | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 0.3 | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: -1 | RESULTADO ESPERADO: Seleccione una opción
//ENTRADA: 3 | RESULTADO ESPERADO: Seleccione una opción
//ENTRADA: 1 dos | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 1 3 7 | RESULTADO ESPERADO: 197.9
//ENTRADA: 2 8 8  | RESULTADO ESPERADO: 804.2
//ENTRADA: 2 3.4 1.1  | RESULTADO ESPERADO: 96.1
//ENTRADA: 0 | RESULTADO ESPERADO: Saliendo del programa

public class Principal04 {

	// Creamos el Scanner
	static Scanner sc = new Scanner(System.in);

	// Función menu()
	public static int menu() {

		// Variable de la opción elegida
		int opcionElegida;

		// Mostramos el menú con las opciones
		System.out.println("1. Volumen");
		System.out.println("2. Área");
		System.out.println("0. Salir");
		System.out.println(); // Salto de línea

		// Asignamos a la variable el valor devuelto por la funcion pideOpcion()
		opcionElegida = Principal04.pideOpcion();

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
		} while (opcion < 0 || opcion > 2);

		// La función devolverá el valor asignado a opcion
		return opcion;
	}

	// Función pideRadioBase()
	public static double pideRadioBase() {

		// Variable del valor que pediremos al usuario
		double radioBase = -1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario el radio de la base del cilindro
				System.out.println("Introduzca el radio de la base del cilindro");
				// Lo leemos y se lo asignamos a la variable radio
				radioBase = sc.nextDouble();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor o igual que cero, repetiremos el bloque
			// de instrucciones del do
		} while (radioBase <= 0);

		// La función devolverá el valor asignado al radio de la base del cilindro
		return radioBase;

	}

	// Función altura()
	public static double altura() {

		// Variable del valor que pediremos al usuario
		double altura = -1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario la altura del cilindro
				System.out.println("Introduzca la altura del cilindro");
				// Lo leemos y se lo asignamos a la variable radio
				altura = sc.nextDouble();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor o igual que cero, repetiremos el bloque
			// de instrucciones del do
		} while (altura <= 0);

		// La función devolverá el valor asignado a la altura del cilindro
		return altura;

	}

	// Función main()
	public static void main(String[] args) {
		// Variable de la opción elegida por el usuario
		int opcion;
		// Variables de lps valores que le pediremos al usuario
		double radioBase, altura;
		// Variable del resultado que mostraremos
		double resultado;

		// Configuración para permitir en la consola números decimales con punto
		sc.useLocale(Locale.US);

		// Asignamos a la opción el valor devuelto por la función menu()
		opcion = Principal04.menu();

		// Mientras la opcion sea diferente de 0, ejecutaremos estas instrucciones
		while (opcion != 0) {

			// Asignamos al radio de la base el valor devuelto por la funcion
			// pideRadioBase()
			radioBase = Principal04.pideRadioBase();
			// Asignamos a la altura el valor devuelto por la funcion altura()
			altura = Principal04.altura();

			// Creamos un objeto de tipo Cilindro04 con los valores solicitados al
			// usuario como parámetros
			Cilindro04 cilindro = new Cilindro04(radioBase, altura);

			// Asignamos al resultado el valor devuelto por una de estas funciones, según
			// cada caso del valor de la opción
			resultado = switch (opcion) {
			case 1 -> cilindro.volumen();
			case 2 -> cilindro.area();
			default -> Math.sqrt(-1);
			};

			// Mostramos el valor del resultado
			System.out.println(resultado);

			// Salto de línea
			System.out.println();

			// Asignamos a la opción un nuevo valor devuelto por la función menu()
			opcion = Principal04.menu();
		}

		// Al salir del bucle, mostraremos este mensaje
		System.out.println("Saliendo del programa");

		// Cerramos el Scanner
		sc.close();
	}

}
