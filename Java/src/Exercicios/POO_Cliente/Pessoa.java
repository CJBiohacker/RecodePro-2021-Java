package Exercicios.POO_Cliente;

//Criar uma classe Pessoa com os atributos (com seus respectivos métodos):
//Cod
//Nome
//Telefone
//Endereco

class Pessoa {

    private String cod, nome, telefone, endereco;

    protected String getCod() {
        return cod;
    }

    protected void setCod(String cod) {
        this.cod = cod;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getTelefone() {
        return telefone;
    }

    protected void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    protected String getEndereco() {
        return endereco;
    }

    protected void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
