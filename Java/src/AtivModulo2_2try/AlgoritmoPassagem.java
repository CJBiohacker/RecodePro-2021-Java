package AtivModulo2_2try;

import java.io.PrintStream;
import java.util.Scanner;

public class AlgoritmoPassagem {
    public static void main(String[] args) {

        // Objetos e Funcionalidades utilizadas no código.
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;
        Passagem cadastro1 = new Passagem();
        Passagem cadastro2 = new Passagem();

        // Cadastro utilizando Estruturas Condicionais e de Repetição
        saida.println("Digite o nome do cliente:");
        cadastro1.setCliente(entrada.nextLine());

        saida.println("Escolha o nº do seus Estado de destino, conforme a tabela abaixo:\n"
                     + "1 => Rio de Janeiro , 2 => Minas Gerais, 3 => Espírito Santo, 4 => São Paulo");

        var aux = 0;

        while ((aux != 1) && (aux != 2) && (aux != 3) && (aux != 4)) {
            aux = entrada.nextInt();
            switch (aux) {
                case 1 -> cadastro1.setDestino("Rio de Janeiro");
                case 2 -> cadastro1.setDestino("Minas Gerais");
                case 3 -> cadastro1.setDestino("Espírito Santo");
                case 4 -> cadastro1.setDestino("São Paulo");
                default -> saida.println("Código Inválido, por favor selecionar somente uma das opções abaixo:\n"
                        + "1 => Rio de Janeiro , 2 => Minas Gerais, 3 => Espírito Santo, 4 => São Paulo");
            }
        }

        if (aux == 1) {
            cadastro1.setValor(119.99d);
            cadastro1.setTaxa(119.99d * 0.39);
        } else if (aux == 2) {
            cadastro1.setValor(149.99d);
            cadastro1.setTaxa(149.99d * 0.38);
        } else if (aux == 3) {
            cadastro1.setValor(170.90d);
            cadastro1.setTaxa(170.90d * 0.34);
        } else if (aux == 4) {
            cadastro1.setValor(99.01d);
            cadastro1.setTaxa(99.01d * 0.41);
        }

        cadastro1.relatorio();

        // Cadastro utilizando a leitura do Scanner e passando parâmetros direto para o objeto.

        cadastro2.setCliente("Adam Jensen");
        cadastro2.setDestino("Detroit");
        cadastro2.setValor(549.39d);
        cadastro2.setTaxa(549.39d*0.21);

        cadastro2.relatorio();

    }
}
