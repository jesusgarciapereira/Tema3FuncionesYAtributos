package ejercicio02;

public class Rectangulo02 {

	// Atributos
	double ancho, alto;

	// Constructor sin parámetros
	public Rectangulo02() {

	}

	// Constructor con parámetros
	public Rectangulo02(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	// Función perimetro()
	public double perimetro() {
		// Variable perimetro
		double perimetro;
		// Asignamos la fórmula a la variable
		perimetro = ancho * 2 + alto * 2;
		// La función devolverá dicho valor
		return perimetro;

	}

	// Función area()
	public double area() {
		// Variable area
		double area;
		// Asignamos la fórmula a la variable
		area = ancho * alto;
		// La función devolverá dicho valor
		return area;
	}

}
