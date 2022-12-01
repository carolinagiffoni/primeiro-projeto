import util.Calculadora;

public class CalculadoraDeArea {

 Calculadora calculadora;
  
  public CalculadoraDeArea(){
    this.calculadora = new Calculadora();
  }

  public double calcularArea(double base, double altura) {
		return this.calculadora.calcularMultiplicacao(base, altura);
	}

}


