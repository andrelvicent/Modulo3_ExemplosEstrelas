package br.com.zup.ExemploAnimal;

public class Main {
    public static void main(String[] args) {
        Baleia freewilly = new Baleia(80, 500, "fundo mar", "orca");
        Cachorro betoven = new Cachorro("puddle", "pequeno porte", 2,50 );
        Gato frajola = new Gato("persa", "branco", 8, 50);
        Papagaio loro = new Papagaio("verde", 10, true, 70);

        System.out.println(freewilly.peso);
    }
}
