package br.com.zup.AulaDeEncapsulamento.Exemplo2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente objeto = new ContaCorrente("Janiquadro", "7777-7");
        objeto.extrato();
        objeto.setNome("André Luiz Vicente");
        objeto.setNumeroDaConta("8888-8");

        objeto.extrato();

        objeto.depositar(800);

        objeto.extrato();
    }
}
