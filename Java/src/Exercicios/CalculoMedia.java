package Exercicios;

import java.util.Scanner;

class CalculoMedia {

    public static void main(String[] args) {

        int numAluno;
        float nota1, nota2, media;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de alunos para cálculo de média: ");
        numAluno = entrada.nextInt();           // Digite números com vírgula "," no console de entrada
        System.out.print("\nCalculando média do(a/os/as) próximo(s) " + numAluno + " aluno(a/os/as)" );

        for (int i = 1; i <= numAluno; i++) {
            System.out.println("\nAluno(a) nº" + i);
            System.out.print("Digite sua 1ª nota: ");
            nota1 = entrada.nextFloat();
            System.out.print("\nDigite sua 2ª nota: ");
            nota2 = entrada.nextFloat();
            media = (nota1 + nota2) / 2f;
            System.out.println("\nValor da sua média:" + media);

            var condMedia = (media >= 7.0) ? "Parabéns, você passou na disciplina !"
                    : "Você está de recuperação, boa sorte.";
            System.out.println(condMedia);
        }

        entrada.close();
    }
}
