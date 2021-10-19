package POO.Interfaces;

interface Monstro {

    void classificacao();
    void nome();

}

class Necrofago implements Monstro {

    @Override
    public void classificacao() {
        System.out.println("Necrófago");
    }

    @Override
    public void nome() {
        System.out.println("Afogador");
    }
}

class Bestiario {

    Necrofago drowner = new Necrofago();

}


