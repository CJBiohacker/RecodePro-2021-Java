package Prova;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        int qtdNotas = 5;
        int nota;
        int soma = 0;
        double media;

        Scanner entrada = new Scanner(System.in);

        for (int i = 1 ; i <= qtdNotas ; i++ ) {
            System.out.println(soma);
            nota = entrada.nextInt();
            soma = soma + nota;
        }

        media = soma / 5 ;

        String condicional = (media > 6) ? "Sua média foi " + media + " Está APROVADO."
                : "Sua média foi " + media + " Está REPROVADO.";

        System.out.println(condicional);
        System.out.println("Soma dos Valores = " + soma);
        System.out.println("Média dos Valores = " + media);

    }
}
