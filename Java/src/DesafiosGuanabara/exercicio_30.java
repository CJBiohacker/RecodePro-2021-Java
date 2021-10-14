package DesafiosGuanabara;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.*;

class exercicio_30 {
    public static void main(String[] args) {
        // Crie um programa que leia o tamanho de três segmentos de reta. Analise seus comprimentos e
        // diga se é possível formar um triângulo com essas retas. Matematicamente, para três segmentos
        // formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.
        // acrescentando o recurso de mostrar que tipo de triângulo será formado:
        // EQUILÁTERO: todos os lados iguais , ISÓSCELES: dois lados iguais ou ESCALENO: todos os lados diferentes.
        double a, b, c;

        Scanner entrada = new Scanner(in);

        out.println("Digite o 1º segmento de reta:");
        a = entrada.nextDouble();
        out.println("Digite o 2º segmento de reta:");
        b = entrada.nextDouble();
        out.println("Digite o 3º segmento de reta:");
        c = entrada.nextDouble();

        if ( ( a < (b+c) ) || ( b < (a+c) ) || ( c < (a+b)) ) {
            out.println("É um triângulo válido.");
            if ( a == b && a == c && b == c ){
                out.println("Possui todos lados iguais, sendo do tipo EQUILÁTERO.");
            } else if ( (a == b ) || ( b == c) || ( a == c ) ) {
                out.println("Possui 2 lados iguais, sendo do tipo ISÓSCELES.");
            } else {
                out.println("Não possui lados iguais, sendo do tipo ESCALENO.");
            }
        } else {
            out.println("Não é possível formar um triângulo com essas medidas.");
        }

    }
}
