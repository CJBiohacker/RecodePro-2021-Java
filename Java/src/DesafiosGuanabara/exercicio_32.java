package DesafiosGuanabara;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Math.toIntExact;

class exercicio_32 {
    public static void main(String[] args) {
        // Crie um jogo onde o computador vai sortear um número entre 1 e 5 o jogador vai tentar
        // descobrir qual foi o valor sorteado.

        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;

        int escolhaPC, escolhaUser, tentativas;

        saida.println("Bem vindo ao jogo de adivinhação de números");
        saida.println("Eu, o computador, irei sortear um nº de 1 à 5 e você terá que advinhar.");
        escolhaPC = toIntExact(Math.round(Math.random() * 5));
        saida.println("Estou sorteando.... PRONTO !!! " + escolhaPC + " Advinhe o nº, mero mortal... MWAHAHAHHA ");
        tentativas = 1;
        saida.print("Tentativa " + tentativas + " = ");
        escolhaUser = entrada.nextInt();

        if ( escolhaUser == escolhaPC ) {
            saida.print("Parabéns !!!");
        } else {
            while ( escolhaUser != escolhaPC ) {
                tentativas++;
                saida.println("Número errado, tente outra vez");
                saida.print("Tentativa " + tentativas + " = ");
                escolhaUser = entrada.nextInt();
            }
        }
        String vitoria = (tentativas == 1) ?
                "Você acertou na 1ª tentativa" :
                "Você acertou com " + tentativas + " tentativas.";
        saida.println(vitoria);
    }
}
