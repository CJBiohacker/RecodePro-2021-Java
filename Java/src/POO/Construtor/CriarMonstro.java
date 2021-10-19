package POO.Construtor;

class CriarMonstro {
    public static void main(String[] args) {
        // Construindo um novo Monstro (objeto) através da Classe Monstro.
        Monstro theCaretaker = new Monstro("Relicto","O Caseiro",
                "Sinal Quen e Óleo de Relicto","Pá do Caseiro",1,
                "----", 0);

        // Imprime os itens preenchidos na construção do Objeto e o que foi declarado no SystemOut da Classe.
        System.out.println();

        theCaretaker.imprimirMonstro();

        Monstro drowner = new Monstro( "Necrofago","Drowner","Sinal Igni e Óleo de Necrófago",
                "Cérebro de Afogador", 1, "Língua de Afogador", 1);

        drowner.imprimirMonstro();
    }
}
