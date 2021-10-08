package Condicional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exercicioMonitoria_18 {
    public static void main(String[] args) {
    // 18 -  Faça um programa que leia o ano de nascimento de uma pessoa,
    // calcule a idade dela e depois mostre se ela pode ou não votar.
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

        String ifTernario;
        ifTernario = ((calcIdade > 15 && calcIdade < 18) || (calcIdade > 70)) ?
                "Você pode votar, porém é facultativo." :
                (calcIdade >= 18 && calcIdade < 70) ? "Seu voto é obrigatório." :
                "Você ainda é muito jovem para votar";

        System.out.println(ifTernario);
        entrada.close();
    }
}
