package Condicional;

import java.util.Scanner;

public class exerciciosAula2_3 {
    public static void main(String[] args) {
        // Fazer um programa para que o usuário digite um número e o programa verifique se o número
        // estão entre o intervalo de valores de 10 e 20. Exibir mensagem se está ou não entre o intervalo de valores.

        float num;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        num = entrada.nextFloat();

        if ( num > 10 && num < 20 ) {
            System.out.println("Este nº está DENTRO do intervalo entre 10 e 20.");
        } else {
            System.out.println("Este nº está FORA do intervalo entre 10 e 20.");
        }
        entrada.close();
    }
}
