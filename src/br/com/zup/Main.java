package br.com.zup;


public class Main {

    public static void main(String[] args) {
        Contato obj_contato = new Contato();
        Contato naoSei = new Contato();

        obj_contato.nome = "André Luiz";
        obj_contato.email = "andre@andrevicente";
        obj_contato.idade = 55;
        obj_contato.telefone = "034 99999999999";

        naoSei.nome = "Gislaine";
        naoSei.email = "gislaine@gislaine";
        naoSei.idade = 950;
        naoSei.telefone = "045215256446545";

        System.out.println(obj_contato.nome);
        System.out.println(obj_contato.email);
        System.out.println(obj_contato.idade);
        System.out.println(obj_contato.telefone);

        System.out.println(naoSei.nome);
        System.out.println(naoSei.email);
        System.out.println(naoSei.telefone);
        System.out.println(naoSei.idade);
    }
}
