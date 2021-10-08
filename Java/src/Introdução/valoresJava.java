package Introdução;

import java.util.Scanner;

public class valoresJava {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int aux;

        Scanner entrada = new Scanner(System.in);

        System.out.println("A = " + a + " B = " + b);
        aux = a;
        a = b;
        b = aux;
        System.out.println("A = " + a + " B = " + b);

        System.out.println("Digite um novo valor para A:");
        a = entrada.nextInt();
        System.out.println("Digite um novo valor para B:");
        b = entrada.nextInt();
        System.out.println("Valores atualizados - A = " + a + " B = " + b);
        aux = a;
        a = b;
        b = aux;
        System.out.println("Valores trocados - A = " + a + " B = " + b);

    }
}
