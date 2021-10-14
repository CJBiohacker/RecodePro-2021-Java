package DesafiosGuanabara;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Math.toIntExact;

class exercicio_32 {
    public static void main(String[] args) {
        // Crie um jogo onde o computador vai sortear um número entre 1 e 5 o jogador vai tentar
        // descobrir qual foi o valor sorteado.

        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;

        int escolhaPC, escolhaUser;

        saida.println("Bem vindo ao jogo de adivinhação de números");
        saida.println("Eu, o computador, irei sortear um nº de 1 à 5 e você terá de advinhar.");
        escolhaPC = toIntExact(Math.round(Math.random() * 5));
        saida.println("Estou sorteando.... PRONTO !!!" + escolhaPC + " Advinhe o nº, mero mortal... MWAHAHAHHA ");
        saida.print("Nº = ");
        escolhaUser = entrada.nextInt();

        if ( escolhaUser == escolhaPC ) {
            saida.println("Parabéns, você acertou o número");
        } else {
            while ( escolhaUser != escolhaPC ) {
                saida.println("Número errado, tente outra vez");
                saida.print("Nº = ");
                escolhaUser = entrada.nextInt();
            }
            saida.println("Parabéns, você acertou o número");
        }

    }
}
