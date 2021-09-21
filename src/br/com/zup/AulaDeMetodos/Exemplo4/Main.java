package br.com.zup.AulaDeMetodos.Exemplo4;

public class Main {
    public static void main(String[] args) {
        Elevador objeto = new Elevador(0, 8, 10, 0);

        System.out.println(objeto.qtdPessoasPresentes);
        objeto.entra(5);
        System.out.println(objeto.qtdPessoasPresentes);
        objeto.entra(5);
        System.out.println(objeto.qtdPessoasPresentes);
        objeto.sai(10);
        System.out.println(objeto.qtdPessoasPresentes);
        objeto.sai(1);


    }
}
