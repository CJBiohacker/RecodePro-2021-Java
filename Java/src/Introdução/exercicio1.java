package Introdução;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
    // Programa onde o usuário digita um nome, uma idade e um salário. Em sequência, exibir as informações.

    Scanner entrada = new Scanner(System.in);

    System.out.println("Olá usuário, digite o seu nome:");
    String nome = entrada.next();
    System.out.println("Digite o seu sobrenome:");
    String sobreNome = entrada.next();
    System.out.println("Qual é sua idade?");
    int idade = entrada.nextInt();
    System.out.println("OK. E qual é o seu salário mensal ?");
    float salario = entrada.nextFloat();

    System.out.println("Confirmando os dados. Temos então:");
    System.out.println("Nome Completo: " + nome + " " + sobreNome);
    System.out.println("Idade: " + idade);
    System.out.println("Salário: R$ " + salario);
    entrada.close();
    }
}
