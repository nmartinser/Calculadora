/**
 * Esta clase implementa las operaciones del interfaz ICalculadora del primer
 * ejercicio del curso. En esta version la mayoria de las operaciones no estan
 * implementadas
 * 
 * @author Nerea
 *
 */

public class Calculadora implements ICalculadora {

	/**
	 * CONSTRUCTOR. Inicialmente no hace nada porque la calculadora no tiene estado
	 * ni necesita guardar nada en memoria.
	 */
	public Calculadora() {
	}

	/**
	 * El metodo suma calcula la suma de dos numeros reales, que son pasados como
	 * parametros.
	 * 
	 * @param a :double -- el sumando 1
	 * @param b :double -- el sumando 2
	 * @return :double -- el resultado de la suma
	 * @throws ArithmeticException if ((a + b) > Double.MAX_VALUE) //postcondicion
	 *                             (large numbers)
	 */
	public double suma(double a, double b) {
		if ((a + b) > Double.MAX_VALUE)
			throw new ArithmeticException("No se puede operar con numeros tan grandes");
		return a + b;
	}

	/**
	 * El metodo resta calcula la diferencia de dos numeros reales, que son pasados
	 * como parametros.
	 * 
	 * @param a :double -- el numero del cual hay que detraer el parametro b
	 * @param b :double -- el numero a restar al parametro a
	 * @return :double -- el resultado de la resta *@throws ArithmeticException if
	 *         ((a - b) > Double.MAX_VALUE) //postcondicion (large numbers)
	 */
	public double resta(double a, double b) {
		if ((a - b) > Double.MAX_VALUE)
			throw new ArithmeticException("No se puede operar con numeros tan grandes");
		return a - b;
	}

	/**
	 * El metodo mult calcula el producto de dos numeros reales, que son pasados
	 * como parametros.
	 * 
	 * @param a :double -- el primer numero
	 * @param b :double -- el segundo numero
	 * @return :double -- el resultado del producto
	 * @throws ArithmeticException if (a * b > Double.MAX_VALUE) //postcondicion
	 *                             (large numbers)
	 */
	public double mult(double a, double b) {
		if (a * b > Double.MAX_VALUE)
			throw new ArithmeticException("No se puede operar con numeros tan grandes");
		return a * b;
	}

	/**
	 * El metodo divide calcula la division de dos numeros reales, que son pasados
	 * como parametros.
	 * 
	 * @param a :double -- el dividendo
	 * @param b :double -- el divisor
	 * @return :double -- el resultado de la division
	 * @throws ArithmeticException (if b==0) //precondition
	 * @throws ArithmeticException (if (result*b!=a)) //postcondicion (large numbers
	 *                             or lack of precision)
	 */
	public double divide(double a, double b) {
		if (b == 0.0)
			throw new ArithmeticException("No se puede dividir entre 0");
		double result = a / b;
		return result;
	}

	/**
	 * El metodo fact calcula el factorial de un numero entero.
	 * 
	 * @param n :int -- numero del cual se quiere calcular el factorial
	 * @return :int -- el factorial de n (n!)
	 * @throws IllegalArgumentException if (n < 0 || n >= 15) //precondition
	 */
	public int fact(int n) {
		if (n < 0 || n >= 15)
			throw new IllegalArgumentException("No se puede calcular el factorial de un n�mero negativo");
		return n > 0 ? n * fact(n - 1) : 1;
	}

	/**
	 * El metodo esPrimo determina si un numero es primo o no.
	 * 
	 * @param n :int -- el numero que se desea saber si es primo o no
	 * @return :boolean -- true si el numero es primo (los numero primos son numeros
	 *         enteros, por lo tanto si esngetaivo no es primo), false en otro caso.
	 */
	public boolean esPrimo(int n) {
		boolean primo = true;
		int d = n - 1;
		while (d > 1) {
			if (n % d == 0)
				primo = false;
			d--;
		}
		if (n < 2)
			primo = false;
		return primo;
	}
}