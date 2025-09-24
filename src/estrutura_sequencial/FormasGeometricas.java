package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
 * a) a área do triangulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C.(pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 */
public class FormasGeometricas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi;
        pi = 3.14159;

        System.out.println("Digite três valores de ponto flutuante: ");
        A = leia.nextDouble();
        B = leia.nextDouble();
        C = leia.nextDouble();

        triangulo = A * C / 2;
        circulo = pi * (Math.pow(C,2));
        trapezio = (A + B) * C / 2;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f", triangulo);
        System.out.println("");
        System.out.printf("CIRCULO: %.3f", circulo);
        System.out.println("");
        System.out.printf("TRAPEZIO: %.3f", trapezio);
        System.out.println("");
        System.out.printf("QUADRADO: %.3f", quadrado);
        System.out.println("");
        System.out.printf("RETANGULO: %.3f", retangulo);    

        leia.close();
    }
}
