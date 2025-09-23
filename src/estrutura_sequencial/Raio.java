package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;
/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais.
 * considere o valor de pi = 3.14159.
 */
public class Raio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double area, raio, pi;
        pi = 3.14159;
        System.out.println("Digite o valor do raio de um circulo: ");
        raio = leia.nextDouble();

        area = pi * (Math.pow(raio,2));

        System.out.printf("A = %.4f", area);
        leia.close();
    }
}
