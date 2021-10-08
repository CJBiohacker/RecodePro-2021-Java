package Condicional;

import java.util.Scanner;

public class exerciciosAula2_5 {
    public static void main(String[] args) {
        // 5 - Fazer um programa para que o usuário digite três números e o programa deverá verificar qual é o número
        // do meio. Exibir mensagem com o número. O programa não poderá aceitar valor zero para nenhum dos três números.
        int a, b, c;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um nº inteiro para A:");
        a = entrada.nextInt();
        System.out.println("Digite um nº inteiro para B:");
        b = entrada.nextInt();
        System.out.println("Digite um nº inteiro para C:");
        c = entrada.nextInt();

        System.out.println("A = " + a + " , B = " + b + " e C = " + c);

        if (a != 0 && b != 0 && c != 0) {
            if (( a > b && a < c) || ( a < b && a > c)) {
                System.out.println("A é o nº do meio.");
            } else if (( b > a && b < c) || ( b < a && b > c)) {
                System.out.println("B é o nº do meio.");
            } else if (( c > a && c < b) || ( c < a && c > b)) {
                System.out.println("C é o nº do meio.");
            }
        } else {
            System.out.println("Condição inválida. Não pode atribuir zero.");
        }
        entrada.close();
    }
}
