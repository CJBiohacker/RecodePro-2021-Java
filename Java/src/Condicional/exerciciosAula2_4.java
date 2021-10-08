package Condicional;

import java.util.Scanner;

public class exerciciosAula2_4 {
    public static void main(String[] args) {
        // 4 - Fazer um programa para que o usuário digite três números e o programa verifique quais números
        // são iguais (podem ser iguais dois números ou os três). Exibir mensagem de quais números são iguais.
        int a, b, c;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um nº inteiro para A:");
        a = entrada.nextInt();
        System.out.println("Digite um nº inteiro para B:");
        b = entrada.nextInt();
        System.out.println("Digite um nº inteiro para C:");
        c = entrada.nextInt();

        System.out.println("A = " + a + " , B = " + b + " e C = " + c);

        if (a == b && b == c && a == c ) {
            System.out.println("Todos nºs são iguais.");
        } else if (a == b) {
            System.out.println("A = B / B = A");
        } else if (a == c)  {
            System.out.println("A = C / C = A");
        } else if (b == c){
            System.out.println("B = C / C = B");
        } else {
            System.out.println("Todos nº são diferentes");
        }
    }
}
