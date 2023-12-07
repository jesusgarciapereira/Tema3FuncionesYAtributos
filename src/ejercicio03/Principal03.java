package ejercicio03;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//1. Circunferencia
//2. Área
//0. Salir
//
//Seleccione una opción
//
//ENTRADA: Elijo Circunferencia | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 2.7 | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: -1 | RESULTADO ESPERADO: Seleccione una opción
//ENTRADA: 3 | RESULTADO ESPERADO: Seleccione una opción
//ENTRADA: 1 dos | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 1 5 | RESULTADO ESPERADO: 31.4
//ENTRADA: 2 10  | RESULTADO ESPERADO: 314.1
//ENTRADA: 1 5.6  | RESULTADO ESPERADO: 35.1
//ENTRADA: 0 | RESULTADO ESPERADO: Saliendo del programa

public class Principal03 {

	// Activamos el Scanner
	static Scanner sc = new Scanner(System.in);

	// Función menu()
	public static int menu() {

		// Variable de la opción elegida
		int opcionElegida;

		// Mostramos el menú con las opciones
		System.out.println("1. Circunferencia");
		System.out.println("2. Área");
		System.out.println("0. Salir");
		System.out.println(); // Salto de línea

		// Asignamos a la variable el valor devuelto por la funcion pideOpcion()
		opcionElegida = Principal03.pideOpcion();

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

	// Función pideRadio()
	public static double pideRadio() {

		// Variable del valor que pediremos al usuario
		double radio = -1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario el radio del círculo
				System.out.println("Introduzca el radio del círculo");
				// Lo leemos y se lo asignamos a la variable radio
				radio = sc.nextDouble();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor o igual que cero, repetiremos el bloque
			// de instrucciones del do
		} while (radio <= 0);

		// La función devolverá el valor asignado al radio
		return radio;

	}

	// Función main()
	public static void main(String[] args) {
		// Variable de la opción elegida por el usuario
		int opcion;
		// Variables del valor que le pediremos al usuario
		double radio;
		// Variable del resultado que mostraremos
		double resultado;

		// Configuración para permitir en la consola números decimales con punto
		sc.useLocale(Locale.US);

		// Asignamos a la opción el valor devuelto por la función menu()
		opcion = Principal03.menu();

		// Mientras la opcion sea diferente de 0, ejecutaremos estas instrucciones
		while (opcion != 0) {

			// Asignamos al radio el valor devuelto por la funcion pideRadio()
			radio = Principal03.pideRadio();

			// Creamos un objeto de tipo Circulo03 con el valor solicitado al
			// usuario como parámetros
			Circulo03 circulo = new Circulo03(radio);

			// Asignamos al resultado el valor devuelto por una de estas funciones, según
			// cada caso del valor de la opción
			resultado = switch (opcion) {
			case 1 -> circulo.circunferencia();
			case 2 -> circulo.area();
			default -> Math.sqrt(-1);
			};

			// Mostramos el valor del resultado
			System.out.println(resultado);

			// Salto de línea
			System.out.println();

			// Asignamos a la opción un nuevo valor devuelto por la función menu()
			opcion = Principal03.menu();
		}

		// Al salir del bucle, mostraremos este mensaje
		System.out.println("Saliendo del programa");

		// Cerramos el Scanner
		sc.close();
	}

}
