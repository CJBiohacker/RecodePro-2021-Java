package Condicional;

import java.util.Scanner;

public class exerciciosAula2_6 {
    public static void main(String[] args) {
        // 6 - Fazer um programa para que o usuário digite um número e o programa verifique se o número é múltiplo
        // de 2 ou de 5 ou de 10. Exibir mensagem de erro caso o número digitado não seja múltiplo de nenhum destes.
        // O programa não poderá permitir que o número zero seja digitado, nem negativo e nem maior do que 100.
        int x;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um nº inteiro, não negativo, maior do que 0 e menor do que 100.");
        x = entrada.nextInt();

        System.out.println("X = " + x);

        if ( (x > 0) && (x < 100) ) {
            if ( (x % 10) == 0 ) {
                System.out.println("Este nº é múltiplo de 10.");
            } if ( (x % 5) == 0 ) {
                System.out.println("Este nº é múltiplo de 5.");
            } if ( (x % 2) == 0 ) {
                System.out.println("Este nº é múltiplo de 2.");
            }
        } else {
            System.out.println("Este nº não é múltiplo das condições 2,5 e 10.");
        }
    }
}
