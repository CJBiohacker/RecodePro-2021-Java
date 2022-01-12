package Exercicios.POO_Cliente;

//Criar a classe Cliente herdando os dados de Pessoa e acrescentando data do cadastro.

class Cliente extends Pessoa {

    private String dataCadastro;

    protected String getDataCadastro() {
        return dataCadastro;
    }

    protected void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
