package estrutura_condicinal;

import java.util.Scanner;
/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = leia.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
        leia.close();
    }
}
