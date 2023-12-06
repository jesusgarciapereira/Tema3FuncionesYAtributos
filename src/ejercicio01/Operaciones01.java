package ejercicio01;

public class Operaciones01 {

	// Atributos
	double num1, num2;

	// Constructor sin parámetros
	public Operaciones01() {

	}

	// Constructor con parámetros
	public Operaciones01(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Función suma()
	public double suma() {
		// Variable suma
		double suma;
		// Le asignamos a la variable el resultado de la suma de los parámetros
		suma = num1 + num2;
		// La función devolverá dicho valor
		return suma;
	}

	// Función resta()
	public double resta() {
		// Variable resta
		double resta;
		// Le asignamos a la variable el resultado de la resta de los parámetros
		resta = num1 - num2;
		// La función devolverá dicho valor
		return resta;
	}

	// Función multiplicacion()
	public double multiplicacion() {
		// Variable multiplicacion
		double multiplicacion;
		// Le asignamos a la variable el resultado de la multiplicación de los parámetros
		multiplicacion = num1 * num2;
		// La función devolverá dicho valor
		return multiplicacion;

	}

	// Función division()
	public double division() {
		// Variable division
		double division;
		// Le asignamos a la variable el resultado de la división de los parámetros
		division = num1 / num2;
		// La función devolverá dicho valor
		return division;
	}

	// Función max()
	public double max() {
		// Variable numMax
		double numMax;
		// Le asignamos a la variable el valor del parámetro mayor o igual
		numMax = num1 >= num2 ? num1 : num2;
		// La función devolverá dicho valor
		return numMax;
	}

	// Función min()
	public double min() {
		// Variable numMin
		double numMin;
		// Le asignamos a la variable el valor del parámetro menor o igual
		numMin = num1 <= num2 ? num1 : num2;
		// La función devolverá dicho valor
		return numMin;
	}
}
