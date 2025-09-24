package estrutura_sequencial;
/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
    Scanner leia = new Scanner(System.in);
    int numeroFuncionario, horasTrabalhadas;
    double valorHora, salario;

    System.out.println("Digite o número de funcionários: ");
    numeroFuncionario = leia.nextInt();
    System.out.println("Digite o número de horas trabalhadas: ");
    horasTrabalhadas = leia.nextInt();
    System.out.println("Digite o valor que recebe por hora: ");
    valorHora = leia.nextDouble();

    salario = horasTrabalhadas * valorHora;
    
    System.out.println("NUMBER = " + numeroFuncionario);
    System.out.printf("SALARY = U$ %.2f%n", salario);
    leia.close();   
    }


}
