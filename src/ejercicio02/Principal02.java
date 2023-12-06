package ejercicio02;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//1. Perímetro
//2. Área
//0. Salir
//
//Seleccione una opción
//
//ENTRADA: Elijo Área | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 1.4 | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: -1 | RESULTADO ESPERADO: Seleccione una opción
//ENTRADA: 3 | RESULTADO ESPERADO: Seleccione una opción
//ENTRADA: 1 dos | RESULTADO ESPERADO: El dato introducido no es del tipo correcto
//ENTRADA: 1 5 6| RESULTADO ESPERADO: 22
//ENTRADA: 2 3 4  | RESULTADO ESPERADO: 12
//ENTRADA: 2 1.2 2.2  | RESULTADO ESPERADO: 2.64
//ENTRADA: 0 | RESULTADO ESPERADO: Saliendo del programa

public class Principal02 {

	// Creamos el Scanner
	static Scanner sc = new Scanner(System.in);

	// Función menu()
	public static int menu() {

		// Variable de la opción elegida
		int opcionElegida;

		// Mostramos el menú con las opciones
		System.out.println("1. Perímetro");
		System.out.println("2. Área");
		System.out.println("0. Salir");
		System.out.println(); // Salto de línea

		// Asignamos a la variable el valor devuelto por la funcion pideOpcion()
		opcionElegida = Principal02.pideOpcion();

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

	// Función pideAncho()
	public static double pideAncho() {
		// Variable del valor que pediremos al usuario
		double ancho = -1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario el ancho del rectángulo
				System.out.println("Introduzca el ancho del rectángulo");
				// Lo leemos y se lo asignamos a la variable ancho
				ancho = sc.nextDouble();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor o igual que cero, repetiremos el bloque
			// de instrucciones del do
		} while (ancho <= 0);

		// La función devolverá el valor asignado al ancho
		return ancho;

	}

	// Función pideAncho()
	public static double pideAlto() {

		// Variable del valor que pediremos al usuario
		double alto = -1;

		// Este bloque de instrucciones se ejecutará, al menos, una vez
		do {
			try {
				// Pedimos al usuario el alto del rectángulo
				System.out.println("Introduzca el alto del rectángulo");
				// Lo leemos y se lo asignamos a la variable ancho
				alto = sc.nextDouble();
				// Si el dato introducido es de tipo incorrecto, mostrará este mensaje
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				// Siempre limpiaremos el buffer
			} finally {
				sc.nextLine();
			}
			// Si el valor de la variable es menor o igual que cero, repetiremos el bloque
			// de instrucciones del do
		} while (alto <= 0);

		// La función devolverá el valor asignado al alto
		return alto;

	}

	// Función main()
	public static void main(String[] args) {

		// Variable de la opción elegida por el usuario
		int opcion;
		// Variables de los valores que le pediremos al usuario
		double ancho, alto;
		// Variable del resultado que mostraremos
		double resultado;

		// Configuración para permitir en la consola números decimales con punto
		sc.useLocale(Locale.US);

		// Asignamos a la opción el valor devuelto por la función menu()
		opcion = Principal02.menu();

		// Mientras la opcion sea diferente de 0, ejecutaremos estas instrucciones
		while (opcion != 0) {

			// Asignamos al ancho el valor devuelto por la funcion pideAncho()
			ancho = Principal02.pideAncho();
			// Asignamos a alto el valor devuelto por la funcion pideAlto()
			alto = Principal02.pideAlto();

			// Creamos un objeto de tipo Rectangulo02 con los valores solicitados al
			// usuario como parámetros
			Rectangulo02 rectangulo = new Rectangulo02(ancho, alto);

			// Asignamos al resultado el valor devuelto por una de estas funciones, según
			// cada caso del valor de la opción
			resultado = switch (opcion) {
			case 1 -> rectangulo.perimetro();
			case 2 -> rectangulo.area();
			default -> Math.sqrt(-1);
			};

			// Mostramos el valor del resultado
			System.out.println(resultado);

			// Salto de línea
			System.out.println();

			// Asignamos a la opción un nuevo valor devuelto por la función menu()
			opcion = Principal02.menu();
		}

		// Al salir del bucle, mostraremos este mensaje
		System.out.println("Saliendo del programa");

		// Cerramos el Scanner
		sc.close();
	}

}
