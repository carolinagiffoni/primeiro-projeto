package util;

public class Calculadora {
	public double calcularSoma(double numeroA, double numeroB) {
		return numeroA + numeroB;
	}
	
	public double calcularSubtracao(double numeroA, double numeroB) {
		return numeroA - numeroB;
	}
	
	public double calcularDivisao(double numeroA, double numeroB) {
		return numeroA / numeroB;
	}
	
	public double calcularMultiplicacao(double numeroA, double numeroB) {
		return numeroA * numeroB;
	}

	public double calcularRaizQuadrada(double numero) {
		if (numero <= 0){
			throw new RuntimeException("Não é possivel calcular raiz de número igual a zero ou negativo!");
		}
		return Math.sqrt(numero);
	}

	public double calcularPiso(double numero) {
		return (int) Math.floor(numero);
	}

	public double calcularTeto (double numero) {
		return (int) Math.ceil(numero);
	}

	public double calcularExponencial(double base, double expoente) {
		return Math.pow(base, expoente);
	}
}
