package br.com.zup.AulaDeEncapsulamento.Exemplo4;

public class Main {
    public static void main(String[] args) {
        Pessoa objeto = new Pessoa();
        objeto.setNome("André Luiz Vicente");
        objeto.setAltura(8.55);
        Data dataDeNascimento = new Data(24, 4, 2000);
        objeto.setDataDeNascimento(dataDeNascimento);

        objeto.imprimirDados();
    }
}
