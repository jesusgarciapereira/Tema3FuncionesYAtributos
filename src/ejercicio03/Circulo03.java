package ejercicio03;

public class Circulo03 {

	// Atributo
	double radio;

	// Constructor sin parámetros
	public Circulo03() {

	}

	// Constructor con parámetros
	public Circulo03(double radio) {
		this.radio = radio;
	}

	// Función circunferencia()
	public double circunferencia() {
		// Constante número pi
		final double PI = Math.PI;
		// Variable circunferencia
		double circunferencia;
		// Asignamos la fórmula a la variable
		circunferencia = 2 * radio * PI;
		// La función devolverá el valor de la circunferencia
		return circunferencia;

	}

	// Función area()
	public double area() {
		// Constante número pi
		final double PI = Math.PI;
		// Variable area
		double area;
		// Asignamos la fórmula a la variable
		area = PI * Math.pow(radio, 2);
		// La función devolverá el valor del área
		return area;

	}

}
