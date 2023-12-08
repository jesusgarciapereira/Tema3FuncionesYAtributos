package ejercicio04;

public class Cilindro04 {

	// Constante número pi
	static final double PI = Math.PI;

	// Atributos
	double radioBase, altura;

	// Constructor sin parámetros
	public Cilindro04() {

	}

	// Constructor con parámetros
	public Cilindro04(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}

	// Función volumen()
	public double volumen() {
		// Variable volumen
		double volumen;
		// Asignamos la fórmula a la variable
		volumen = PI * Math.pow(radioBase, 2) * altura;
		// La función devolverá el valor del volumen
		return volumen;
	}

	// Función area()
	public double area() {
		// Variable area
		double area;
		// Asignamos la fórmula a la variable
		area = 2 * PI * radioBase * (radioBase + altura);
		// La función devolverá el valor del área
		return area;
	}

}
