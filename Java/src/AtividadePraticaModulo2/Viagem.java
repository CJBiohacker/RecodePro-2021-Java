package AtividadePraticaModulo2;

class Viagem {

    private String destino, data, horario;

    // MÉTODOS DE SET E GET PARA OS DADOS O DESTINO DA VIAGEM.
    // Métodos para DESTINO
    protected void setDestino(String destino) {
        this.destino = destino;
    }
    protected String getDestino() {
        return destino;
    }

    // Métodos para DATA
    protected void setData(String data) {
        this.data = data;
    }
    protected String getData() {
        return data;
    }

    // Métodos para HORARIO
    protected void setHorario(String horario) {
        this.horario = horario;
    }
    protected String getHorario() {
        return horario;
    }


}

