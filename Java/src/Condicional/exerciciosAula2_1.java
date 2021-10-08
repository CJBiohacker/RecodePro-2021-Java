package Condicional;

import java.util.Scanner;

public class exerciciosAula2_1 {
    public static void main(String[] args) {
        // Para doar sangue é necessário ter idade maior que 20.
        // Faça um programa que pergunte a idade de uma pessoa e exiba a informação se ela pode doar sangue ou não.
        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem vindo ao Sistema de Doação de Sangue");
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();

        if (idade > 20)
            System.out.println("Você tem idade para realizar a doação.");
        else
            System.out.println("A idade mínima para doação são 21 anos");

        entrada.close();
    }
}
