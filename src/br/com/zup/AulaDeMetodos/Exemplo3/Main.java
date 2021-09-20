package br.com.zup.AulaDeMetodos.Exemplo3;

public class Main {
    public static void main(String[] args) {
        Carro exemplo = new Carro("Ford ka", 500, "Ford", "Vermelho", 50000);

        // Testando os métodos criados
        exemplo.mostrarCarro();

        // Dar desconto
        exemplo.darDesconto(5000);

        // Testando os métodos criados
        System.out.println("------------------");
        exemplo.mostrarCarro();

        // Testando os métodos criados
        System.out.println("------------------");
        exemplo.pintar("Verde limão");

        // Testando os métodos criados
        System.out.println("------------------");
        exemplo.mostrarCarro();

        exemplo.darDesconto(2000);

        // Testando os métodos criados
        System.out.println("------------------");
        exemplo.mostrarCarro();
    }
}
