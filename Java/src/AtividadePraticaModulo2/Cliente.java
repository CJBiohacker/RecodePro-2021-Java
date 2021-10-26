package AtividadePraticaModulo2;

class Cliente {

    // VARIÁVEIS DECLARADAS EM MODO PRIVATE, PARA EVITAR ALTERAÇÕES EXTERNAS.
    private String nome, sobrenome, cpf, tel, end;

    // MÉTODOS DE SET E GET PARA OS DADOS DO CLIENTE.
    // Métodos para NOME
    protected void setNome(String nome) {
        this.nome = nome;
    }
    protected String getNome() {
        return nome;
    }

    // Métodos para SOBRENOME
    protected void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    protected String getSobrenome() {
        return sobrenome;
    }

    // Métodos para CPF
    protected void setCPF(String cpf) {
        this.cpf = cpf;
    }
    protected String getCPF() {
        return cpf;
    }

    // Métodos para TEL
    protected void setTel(String tel) {
        this.tel = tel;
    }
    protected String getTel() {
        return tel;
    }

    // Métodos para END
    protected void setEnd(String end) {
        this.end = end;
    }
    protected String getEnd() {
        return end;
    }
}