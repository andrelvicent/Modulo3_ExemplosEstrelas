package br.com.zup.AulaDeMetodos.Exemplo3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciando o carro e o scanner
        Carro exemplo = new Carro("Ford ka", 500, "Ford", "Vermelho", 50000);
        Scanner leitor = new Scanner(System.in);

        // Exibindo informações do carro
        exemplo.mostrarCarro();
        System.out.println("----------------");

        // Lendo valor do desconto
        System.out.println("Por favor, digite um valor de desconto: ");
        double desconto = leitor.nextDouble();
        leitor.nextLine();

        // Lendo valor da nova cor
        System.out.println("Por favor, digite a nova cor: ");
        String cor = leitor.nextLine();

        exemplo.darDesconto(desconto);
        exemplo.pintar(cor);

        System.out.println("----------------");
        exemplo.mostrarCarro();
    }
}
