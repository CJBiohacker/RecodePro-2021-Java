package POO.Construtor.AtividadePraticaHeranca;

class Pessoa {

    protected String nome;
    protected int idade;

    protected Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    protected String votar() {
        return (idade >= 18) ? "Você pode votar" : "Você é muito jovem pra votar";
    }
}
