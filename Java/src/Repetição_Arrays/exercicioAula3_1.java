package Repetição_Arrays;

import java.util.Arrays;

class exercicioAula3_1 {
    public static void main(String[] args) {
        // 1 - Fazer um programa para preencher um vetor de 10 posições. O vetor só poderá receber números pares.

        int[] numeros = new int[10];        // Método de declaração semelhante ao de construtor.
        char[] vetorTeste= {};              // Método alternativo de vinculação de variável.

        for ( int i = 0, j = 2 ; i < numeros.length; i++ , j+=2 ) {
                numeros[i] = j;
                System.out.println("Elemento na posição " + i + " recebe o valor de " + i);
        }

        System.out.println("Números pares preenchidos no vetor: " + Arrays.toString(numeros));
    }
}
