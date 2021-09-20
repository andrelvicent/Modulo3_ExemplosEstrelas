package br.com.zup.AulaDeMetodos.Exemplo2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("André Luiz", "055555555", "687265", "8855544");
        cc1.mostrarDados();
        cc1.depositar(100);
        System.out.println("-------------------");
        cc1.mostrarDados();
        cc1.depositar(100);
        cc1.mostrarDados();
        cc1.sacar(50);
        cc1.mostrarDados();
        cc1.solicitaEmprestimo(80);
        cc1.mostrarDados();

    }

}
