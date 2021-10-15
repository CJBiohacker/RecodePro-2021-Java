package POO;

public class Carro {

    String modelo, chassi, motor, classificacao;
    int numPortas;

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected String getChassi() {
        return chassi;
    }

    protected void setChassi(String chassi) {
        this.chassi = chassi;
    }

    protected String getMotor() {
        return motor;
    }

    protected void setMotor(String motor) {
        this.motor = motor;
    }

    protected String getClassificacao() {
        return classificacao;
    }

    protected void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    protected int getNumPortas() {
        return numPortas;
    }

    protected void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    protected void acelerar(double tempo) {
        System.out.println("Carro de modelo " + getModelo() + " com " + getNumPortas() + " portas está acelerando.");
        System.out.println(getModelo() + " vai de 0-100km/h em: " + tempo + "s .");
        if (numPortas == 2) {
            System.out.println("Este carro não pode passar de 60km/h");
        } else if (numPortas == 4) {
            System.out.println("Este caro não pode passar de 110km/h");
        } else {
            System.out.println("Este caro não pode passar de 140km/h");
        }
    }

    protected void frear(double velocidade) {
            System.out.println("Freando. Reduzindo a velocidade até " + velocidade + "km/h.");
    }

    protected void sensorVelocidade(double velocidade) {
        if (velocidade < 100) {
            System.out.println("Você está no limite de velocidade seguro. Continue assim nesta estrada.");
        } else {
            System.out.println("Você está acima da velocidade de segurança, executando o freio automático.");
            velocidade = 0;
            frear(velocidade);
        }
    }

}
