package br.com.zup.AulaDeEncapsulamento.Exemplo1;

public class Carro {
    private String nome;
    private double peso;
    private String fabricante;
    private String cor;
    private double valor;

    public Carro(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public double getPeso(){
        return peso;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setNome(String nome){
        if (nome.equals("Honda civic")){
            this.nome = nome;
        }
        else{
            System.out.println("Digite um carro descente");
        }
    }

}
