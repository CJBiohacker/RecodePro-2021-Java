package POO.Construtor;

class Monstro {

        protected String classe, variacao, fraqueza, espolio1, espolio2;
        protected int qtdEspolio1, qtdEspolio2;

        protected Monstro(String classe, String variacao, String fraqueza, String espolio1, int qtdEspolio1,
        String espolio2, int qtdEspolio2) {
            this.classe = classe;
            this.variacao = variacao;
            this.fraqueza = fraqueza;
            this.espolio1 = espolio1;
            this.qtdEspolio1 = qtdEspolio1;
            this.espolio2 = espolio2;
            this.qtdEspolio2 = qtdEspolio2;

            System.out.println("Classe: " + classe + " Variação/Nome: " + variacao + " Fraqueza: "
                    + fraqueza + " Espólios: " + espolio1 + " x " + qtdEspolio1 + " - " + espolio2 + " x " + qtdEspolio2);
        }

        protected void imprimirMonstro(){
            System.out.println("Classe: " + classe + " Variação/Nome: " + variacao + " Fraqueza: "
                    + fraqueza + " Espólios: " + espolio1 + " x " + qtdEspolio1 + " - " + espolio2 + " x " + qtdEspolio2);
        }
}
