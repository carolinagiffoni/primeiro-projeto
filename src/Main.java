
import java.util.Scanner;

import util.Calculadora;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        double numeroA, numeroB;
        while (true) {
           try {
               System.out.print("Digite uma opção (1-soma, 2-subtracao, 3-multiplicacao, 4-divisao, 5-raiz, 6-piso, 7-teto, 9-exponencial 0-sair): ");
               opcao = scanner.nextInt();

               if (opcao == 0)
                   break;

               System.out.print("Digite o primeiro numero: ");
               numeroA = scanner.nextDouble();

               switch (opcao) {
                   case 1: {
                       System.out.print("Digite o segundo numero: ");
                       numeroB = scanner.nextDouble();
                       System.out.println(calculadora.calcularSoma(numeroA, numeroB));
                       break;
                   }
                   case 2: {
                       System.out.print("Digite o segundo numero: ");
                       numeroB = scanner.nextDouble();
                       System.out.println(calculadora.calcularSubtracao(numeroA, numeroB));
                       break;
                   }
                   case 3: {
                       System.out.print("Digite o segundo numero: ");
                       numeroB = scanner.nextDouble();
                       System.out.println(calculadora.calcularDivisao(numeroA, numeroB));
                       break;
                   }
                   case 4: {
                       System.out.print("Digite o segundo numero: ");
                       numeroB = scanner.nextDouble();
                       System.out.println(calculadora.calcularMultiplicacao(numeroA, numeroB));
                       break;
                   }
                   case 5: {
                       System.out.println(calculadora.calcularRaizQuadrada(numeroA));
                       break;
                   }
                   case 6: {
                       System.out.println(calculadora.calcularPiso(numeroA));
                       break;
                   }
                   case 7: {
                       System.out.println(calculadora.calcularTeto(numeroA));
                       break;
                   }
                   case 8: {
                       System.out.print("Digite o segundo numero: ");
                       numeroB = scanner.nextDouble();
                       System.out.println(calculadora.calcularExponencial(numeroA, numeroB));
                       break;
                   }
                   default:
                       System.out.println("Digite um número entre 0 e 8");
                       break;
               }
           }catch(RuntimeException e){
               System.out.println(e.getMessage() + "Digite outra opcao");
           }
        }
        scanner.close();
    }

}
