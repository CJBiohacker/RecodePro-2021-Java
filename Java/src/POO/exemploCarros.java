package POO;

import java.io.PrintStream;

class exemploCarros {
    public static void main(String[] args) {

        PrintStream imprime = System.out;
        Carro tesla = new Carro();

        tesla.modelo = "Tesla Model S";
        tesla.chassi = "7mxmD2ArT1tz27408";
        tesla.motor = "Motor Elétrico P100D";
        tesla.classificacao = "Executivo";
        tesla.numPortas =  5;


        imprime.println("Você acaba de comprar um Tesla, meus parabéns. Estamos enviado as especificações do seu carro.");
        imprime.println("Modelo: " + tesla.getModelo());
        imprime.println("Chassi: " + tesla.getChassi());
        imprime.println("Motor: " + tesla.getMotor());
        imprime.println("Classificação: " + tesla.getClassificacao());
        imprime.println("Nº de Portas: " + tesla.getNumPortas());
        imprime.println("Agora, vamos lá. Faça um test drive.");

        tesla.acelerar(2.28);
        tesla.frear(10);
        tesla.sensorVelocidade(150);

//        Carro ford = new Carro();

    }
}
