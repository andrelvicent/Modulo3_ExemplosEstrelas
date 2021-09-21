package br.com.zup.AulaDeEncapsulamento.Exemplo1;

import br.com.zup.AulaDeEncapsulamento.Exemplo1.Carro;

public class Main {
    public static void main(String[] args) {
        Carro objeto = new Carro("Ford ka");

        System.out.println(objeto.getNome());
        objeto.setNome("Honda civi");
        System.out.println(objeto.getNome());
    }
}
