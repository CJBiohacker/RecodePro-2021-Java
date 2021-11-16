package AtivModulo2_2try;

class Passagem {

    // VARIÁVEIS DECLARADAS EM MODO PRIVATE, PARA EVITAR ALTERAÇÕES EXTERNAS.
    private String cliente, destino;
    private double valor, taxa;

    // MÉTODOS DE CONFIGURAÇÃO DO CADASTRO DE CLIENTE.
    // Método para armazenamento do nome do cliente.
    protected void setCliente(String cliente) {
        this.cliente = cliente;
    }

    // Método para armazenamento do destino da viagem do cliente.
    protected void setDestino(String destino) {
        this.destino = destino;
    }

    // Método para armazenamento do valor da passagem do cliente.
    protected void setValor(double valor) {
        this.valor = valor;
    }

    // Método para armazenamento do valor da taxa da passagem do cliente.
    protected void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    // Método de Relatório dos dados cadastrados na passagem.
    protected void relatorio() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n"
                         + "-------- Relatório de Emissão de Passagem --------- \n"
                         + "        Cliente => " + cliente + "\n"
                         + "        Destino => " + destino + "\n"
                         + "        Valor => R$" + valor + "\n"
                         + "        Taxa => R$" + taxa + "\n"
                         + "        Total => R$" + (valor + taxa)+ "\n"
                         + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
