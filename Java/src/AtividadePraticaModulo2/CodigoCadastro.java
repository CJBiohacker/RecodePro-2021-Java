package AtividadePraticaModulo2;

import java.io.PrintStream;
import java.util.Scanner;

class CodigoCadastro {
    public static void main(String[] args) {

        // Objetos e Funcionalidades utilizadas no código.
        Scanner entrada = new Scanner(System.in);
        PrintStream saida = System.out;
        Cliente usuario = new Cliente();
        Viagem viagem = new Viagem();
        String[] dadosUser = new String[5];
        String[] dadosViagem = new String[3];

        // CADASTRO DOS CLIENTES
        saida.print("Olá Cliente, seja bem vindo ao Monkey Trips. Realize seu cadastro digitando os dados abaixo:\n");
        for (int i = 0; i < dadosUser.length; i++) {
            switch (i) {
                case 0:
                    saida.print("Nome: \n");
                    usuario.setNome(entrada.nextLine());
                    dadosUser[i] = usuario.getNome();
                    break;
                case 1:
                    saida.print("Sobrenome: " + "\n");
                    usuario.setSobrenome(entrada.nextLine());
                    dadosUser[i] = usuario.getSobrenome();
                    break;
                case 2:
                    saida.print("CPF: \n");
                    usuario.setCPF(entrada.nextLine());
                    dadosUser[i] = usuario.getCPF();
                    break;
                case 3:
                    saida.print("Telefone: \n");
                    usuario.setTel(entrada.nextLine());
                    dadosUser[i] = usuario.getTel();
                    break;
                case 4:
                    saida.print("Endereço: \n");
                    usuario.setEnd(entrada.nextLine());
                    dadosUser[i] = usuario.getEnd();
                    break;
                default:
                    break;
            }
        }
        saida.println("Cadastro de Cliente realizado, " + dadosUser[0] + ' ' + dadosUser[1] + " !");

        // CÓDIGO DE CADASTRO DA VIAGEM DO CLIENTE
        saida.print("Agora, faça o cadastro da sua viagem informando os dados abaixo:\n");

        String[] destinos = {"Rio de Janeiro", "Espírito Santo", "São Paulo", "Minas Gerais"};
        String[] horarios = {"7h00", "12h00", "19h00", "00h00"};

        int j = 0;
        var codDest = 0;
        var codHor = 0;

        while (j < dadosViagem.length) {
            switch (j) {
                case 0:
                    saida.println("Selecione o código numérico correspondente ao seu Estado de destino");
                    saida.println(" 0 => Rio de Janeiro , 1 => Espírito Santo , 2 => São Paulo ou 3 => Minas Gerais");
                    saida.print("Código: \n");

                    while ( codDest >= 0 || codDest <= 3 ) {
                        codDest = entrada.nextInt();

                        if (codDest == 0) {
                            viagem.setDestino(destinos[0]);
                            saida.println("Destino selecionado: " + destinos[0]);
                            break;
                        } else if (codDest == 1) {
                            viagem.setDestino(destinos[1]);
                            saida.println("Destino selecionado: " + destinos[1]);
                            break;
                        } else if (codDest == 2) {
                            viagem.setDestino(destinos[2]);
                            saida.println("Destino selecionado: " + destinos[2]);
                            break;
                        } else if (codDest == 3) {
                            viagem.setDestino(destinos[3]);
                            saida.println("Destino selecionado: " + destinos[3]);
                            break;
                        } else {
                            saida.println("Código Inválido, por favor selecionar somente uma das opções abaixo: ");
                            saida.println("0 => Rio de Janeiro , 1 => Espírito Santo , 2 => São Paulo ou 3 => Minas Gerais");
                        }
                    }

                    dadosViagem[j] = viagem.getDestino();
                    break;
                case 1:
                    saida.print("Data: " + "\n");
                    viagem.setData(entrada.next());
                    dadosViagem[j] = viagem.getData();
                    break;
                case 2:
                    saida.println("Selecione código numérico correspondente ao horário desejado:");
                    saida.println(" 0 => 7h00,  1 => 12h00,  2 => 19h00 ou  3 => 00h00 ");
                    saida.print("Código: \n");

                    while ( codHor >= 0 || codHor <= 3 ) {
                        codHor = entrada.nextInt();

                        if (codHor == 0) {
                            viagem.setHorario(horarios[0]);
                            saida.println("Horário selecionado: " + horarios[0]);
                            break;
                        } else if (codHor == 1) {
                            viagem.setHorario(horarios[1]);
                            saida.println("Horário selecionado: " + horarios[1]);
                            break;
                        } else if (codHor == 2) {
                            viagem.setHorario(horarios[2]);
                            saida.println("Horário selecionado: " + horarios[2]);
                            break;
                        } else if (codHor == 3) {
                            viagem.setHorario(horarios[3]);
                            saida.println("Horário selecionado: " + horarios[3]);
                            break;
                        } else {
                            saida.println("Código Inválido, por favor selecionar somente uma das opções abaixo: ");
                            saida.println(" 0 => 7h00,  1 => 12h00,  2 => 19h00 ou  3 => 00h00 ");
                        }
                    }

                    dadosViagem[j] = viagem.getHorario();
                    break;
                default:
                    break;
            }
            j++;
        }

        saida.print("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n"
                + "--------------- Resumo dos Dados do Cliente e da Viagem -------------------- \n"
                + "Nome: " + dadosUser[0] + "\n"
                + "Sobrenome: " + dadosUser[1] + "\n"
                + "Local de Destino: " + dadosViagem[0] + "\n"
                + "Data: " + dadosViagem[1] + "\n"
                + "Horario: " + dadosViagem[2] + "\n"
                + "=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n");

        saida.println("Cadastro de Viagem Realizado. Lembre-se de conferir a data e horario antecipado para se planejar melhor.");
        saida.print("A Monkey Trips agradece a preferência e deseja uma excelente viagem !!!");

    }
}

