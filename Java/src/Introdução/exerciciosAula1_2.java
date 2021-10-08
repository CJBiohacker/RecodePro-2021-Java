package Introdução;

import java.util.Scanner;

class exerciciosAula1_2 {
    public static void main(String[] args) {
    // 2 - Exibir o saldo com reajuste de 1%. Valores informados pelo usuário
    float saldo , reajuste;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o valor do saldo: R$");
    saldo = entrada.nextFloat();
    System.out.println("Aplicando o reajuste de 1%...");
    reajuste = saldo * 0.01f;
    System.out.println("O valor reajustado é de: R$ "+ String.format("%.2f", reajuste) );
    entrada.close();
    }
}
