package br.com.zup.AulaDeMetodos.Exemplo1;

public class Main {
    public static void main(String[] args) {
        // Instanciando objetos
        Cachorro bob = new Cachorro("Puddle", "Pequeno", 5, 50);
        Cachorro salsicha = new Cachorro("salsicha", "grande", 700, 800);
        Baleia dory = new Baleia(700, 50, "aquatico", "especie");
        Baleia dory2 = new Baleia(900, 70, "terreira", "especie");

        // Chamando métodos
        bob.monstrarDados();
        salsicha.monstrarDados();
        dory.mostrarDados();
        dory2.mostrarDados();
    }
}
