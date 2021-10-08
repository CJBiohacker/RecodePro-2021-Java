package Introdução;

import java.util.Scanner;

public class exerciciosAula1_4 {
    public static void main(String[] args) {
    // 4 - Programa pra calcular consumo de um veículo. Dados informados pelo usuário.
    float hora, velMedia, distancia, consumo;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o tempo gasto na viagem(em h): ");
    hora = entrada.nextFloat();
    System.out.println("Digite a velocidade média da viagem(em km/h): ");
    velMedia = entrada.nextFloat();
    System.out.println("Calculando a distância percorrida...");
    distancia = hora * velMedia;
    System.out.println("Distância = " + String.format("%.2f", distancia) + "km");
    consumo = distancia / 12;
    System.out.println("Consumo = " + String.format("%.2f", consumo) + "l/h");
    entrada.close();
    }
}
