package estrutura_condicinal;

import java.util.Scanner;
/*
 * Leia 2 valores interios (A e B). Após, o programa deve mostrar uma mensagem "São Multiplos" ou "Não são Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
 */
public class Multiplos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite 2 valores inteiros: ");
        int a = leia.nextInt();
        int b = leia.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }
        leia.close();
    } 
}
