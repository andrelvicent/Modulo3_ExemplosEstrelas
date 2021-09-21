package br.com.zup.ExemploContato;

public class Contato {
    // Criando atributos
    private String nome;
    private String telefone;
    private String email;
    private int idade;

    public Contato(String nome, String telefone, String email, int idade){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
