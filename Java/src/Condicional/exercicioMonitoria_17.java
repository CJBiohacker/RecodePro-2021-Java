package Condicional;

import java.util.Scanner;

public class exercicioMonitoria_17 {
    public static void main(String[] args) {
     // 17 - Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80km/h, exiba uma mensagem
     // dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da
     // velocidade permitida.
        float vel, multa;

        Scanner entrada = new Scanner(System.in);

        System.out.println("A velocidade máxima permitida é de 80 km/h.");
        System.out.println("Qual a velocidade do carro (em km/h) ?");
        vel = entrada.nextFloat();
        multa = (vel - 80 ) * 5 ;

        String ifTernario;
        ifTernario = (vel > 80) ?
                "Velocidade acima do permitido. Sua multa é de: R$" + String.format("%.2f", multa) :
                "Velocidade dentro do permitido. Parabéns.";

        System.out.println(ifTernario);
        entrada.close();
    }
}
