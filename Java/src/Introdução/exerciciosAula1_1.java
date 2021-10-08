package Introdução;

import java.util.Scanner;

public class exerciciosAula1_1 {
    public static void main(String[] args) {
    // 1 - Área do Retângulo com dados digitados pelo usuario.
    float base, altura, area;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o valor da base(em m):");
    base = entrada.nextFloat();
    System.out.println("Digite o valor da altura(em m):");
    altura = entrada.nextFloat();
    area = base * altura;
    System.out.println("O valor da área é: " + area + "m²");
    entrada.close();
    }
}
