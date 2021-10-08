package Condicional;

import java.util.Scanner;

public class exerciciosAula2_2 {
    public static void main(String[] args) {
        // Faça um programa onde o usuário irá digitar um inteiro e exiba se o número é par ou ímpar.
        // Se for par, o número deverá ser multiplicado por 4 e a informação deverá ser exibida.

        int inteiro;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        inteiro = entrada.nextInt();
        System.out.println("Analizando...");

        if (inteiro%2 == 0) {
            System.out.println("Esse nº é par. Multiplicando por "+ inteiro+" * 4 = "  + (inteiro * 4));
        } else {
            System.out.println("Esse nº é ímpar.");
        }
        entrada.close();
    }
}
