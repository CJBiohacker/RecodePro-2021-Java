package Repetição_Arrays;

import java.util.Arrays;
import java.util.Scanner;

class exercicioAula3_3 {
    public static void main(String[] args) {
        // 3 - Fazer um programa para que o usuário informe um número e a tabuada daquele valor seja calculada
        // e exibida na tela. As multiplicações começam no valor 1 até o valor 9. O número informado pelo usuário
        // não pode ser zero e nem negativo. Exemplo: 2 x 1 = 2

        int num;
        int[] tabuada = new int[10];
        int j = 1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o número da tabuada escolhido ?");
        num = entrada.nextInt();
        System.out.println("Número " + num + " selecionado. Calculando...");

        while (num < 1) {
            System.out.println("Este número não é permitido. Selecione um número maior do que 0:");
            num = entrada.nextInt();
            System.out.println("Número " + num + " selecionado. Calculando...");
        }

        for (int i = 1; i <= 9; i++) {
            tabuada[i] = num * j;
            System.out.println(num + " x " + i + " = " + j);
            j++;
        }

        System.out.println("Tabuada de " + num + ": " + Arrays.toString(tabuada));
    }
}
