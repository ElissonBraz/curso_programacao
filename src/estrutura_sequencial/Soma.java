package estrutura_sequencial;

import java.util.Scanner;

/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números na tela com uma mensagem explicativa.
 */
public class Soma {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       int x, y;

       System.out.println("Digite o primeiro número: ");
       x = leia.nextInt();
       System.out.println("Digite o segundo número: ");
       y = leia.nextInt();

       int soma = x + y;

       System.out.println("SOMA = " + soma);
       
       leia.close();
    }
}
