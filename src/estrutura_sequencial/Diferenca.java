package estrutura_sequencial;

import java.util.Scanner;

/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
public class Diferenca {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Digite quatro números: ");
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("DIFERENÇA = " + diferenca);
        leia.close();
    }
}
