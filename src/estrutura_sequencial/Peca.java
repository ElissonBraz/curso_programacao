package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peça 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class Peca {
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner leia = new Scanner(System.in);

     int codigoPeca1, numeroPeca1,codigoPeca2, numeroPeca2;
     double valorPeca1, valorPeca2, totalValorPeca;

     System.out.println(" Digite o codigo da peça 1, o número da peça 1 e o valor unitário da peça 1: ");
     codigoPeca1 = leia.nextInt();
     numeroPeca1 = leia.nextInt();
     valorPeca1 = leia.nextDouble();

     System.out.println(" Digite o codigo da peça 2, o número da peça 2 e o valor unitário da peça 2: ");
     codigoPeca2 = leia.nextInt();
     numeroPeca2 = leia.nextInt();
     valorPeca2 = leia.nextDouble();

     totalValorPeca = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

     System.out.println("A Peça 1 de Código: " + codigoPeca1 + " e a Peça 2 de Código: "+ codigoPeca2 );
     System.out.printf("VALOR A PAGAR: R$ %.2f", totalValorPeca);

     leia.close();
    }
}
