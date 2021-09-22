package br.com.zup.AulaDeEncapsulamento.Exemplo4;

public class Pessoa {
    private String nome;
    private Data dataDeNascimento;
    private double altura;

    public Pessoa(){

    }
    public Pessoa(String nome, Data dataDeNascimento, double altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Data dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimirDados(){
        System.out.println("Nome da pessoa: " +nome);
        System.out.println("Data de nascimento da pessoa: " +dataDeNascimento.getDia() +"/"+dataDeNascimento.getMes() + "/"+dataDeNascimento.getAno() );
        System.out.println("Altura da pessoa: " +altura);
    }


}
