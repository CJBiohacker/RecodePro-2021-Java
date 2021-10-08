package Introdução;

import java.util.Scanner;

public class exerciciosAula1_3 {
    public static void main(String[] args) {
    // 3 - Programa que informa temperatura em ºC e converte para ºF. Valor informado pelo usuário.
    float celsius, fahrenheit;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe a temperatura em ºC:");
    celsius = entrada.nextFloat();
    System.out.println("Convertendo para Fahrenheit....");
    fahrenheit = (( 9 * celsius + 160) / 5);
    System.out.println("O valor " + celsius + " ºC = " + fahrenheit + " ºF");
    entrada.close();

    }
}
