package br.com.zup.AulaDeEncapsulamento.Exemplo3;

public class Main {

    public static void main(String[] args) {
        Televisao tv = new Televisao(0, 8);
        tv.consultarDados();

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.consultarDados();
        tv.diminuirVolume();
        tv.consultarDados();
        tv.passarCanal();
        tv.consultarDados();
    }
}
