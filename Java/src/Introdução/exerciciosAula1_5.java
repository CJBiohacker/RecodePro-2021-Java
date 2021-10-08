package Introdução;

import java.util.Scanner;

public class exerciciosAula1_5 {
    public static void main(String[] args) {
    // 5 - Cálculo do salário líquido de um professor. Valores fornecidos pelo usuário.
    float salario, valorHoraAula, inss, desconto, salFinal;
    int numAulas;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Qual o valor da sua hora/aula?");
    valorHoraAula = entrada.nextFloat();
    System.out.println("Quantas aulas foram ministradas durante o mês?");
    numAulas = entrada.nextInt();
    salario = (valorHoraAula * numAulas);
    System.out.println("O valor do seu salário bruto mensal é: R$ " + String.format("%.2f" , salario));

    if (salario < 1100.01) {
        inss = 7.5f;
    } else if (salario < 2203.49 ) {
        inss = 9f;
    } else if (salario < 3305.23) {
        inss = 12f;
    } else if (salario < 6433.58) {
        inss = 14f;
    } else {
        inss = 22.5f;
    }

    System.out.println("Com este valor, a alíquota mensal do inss é de: " + inss + "%");
    desconto = (salario * (inss/100));
    salFinal = (salario - desconto);
    System.out.println("Então o seu salário líquido mensal é: R$ " + String.format("%.2f" ,salFinal));

    entrada.close();
    }
}
