package Introdução;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class calculaIdade {
    public static void main(String[] args) {
        int anoNasc, calcIdade;

        Scanner entrada = new Scanner(System.in);
        LocalDate anoAtual = LocalDate.now();
        DateTimeFormatter anoFormat = DateTimeFormatter.ofPattern("yyyy");
        String anoFormatado = anoFormat.format(anoAtual);

        System.out.println("Qual seu ano de nascimento ?");
        anoNasc = entrada.nextInt();
        System.out.println("Verificando o ano atual....");
        System.out.println("O ano atual é: " + anoFormatado );
        System.out.println("Calculando sua idade....");
        calcIdade = (Integer.parseInt(anoFormatado) - anoNasc);
        System.out.println("Você tem: "+ calcIdade);
    }
}
