package br.com.zup.AulaDeMetodos.Exemplo4;

public class Elevador {
    int andarAtual = 0;
    int totalDeAndares;
    int capacidade;
    int qtdPessoasPresentes;

    public Elevador(int andarAtual, int totalDeAndares, int capacidade, int qtdPessoasPresentes){
        this.andarAtual = andarAtual;
        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
        this.qtdPessoasPresentes = qtdPessoasPresentes;
    }

    public void entra(int qtdPessoas){
        int totalDeViajantes = qtdPessoas + qtdPessoasPresentes;

        if (totalDeViajantes > capacidade){
            System.out.println("O elevador não comporta tal quantidade. ");
            System.out.println("Quantidade de pessoas que excedeu: " +(totalDeViajantes-capacidade));
        }else{
            qtdPessoasPresentes = totalDeViajantes;
        }
    }

    public void sai(int qtdPessoas){
        int totalDeViajantes = qtdPessoasPresentes - qtdPessoas;

        if (totalDeViajantes < 0){
            System.out.println("Você não pode tirar uma quantidade maior de pessoas do que a quantidade de pessoas presentes ");
        }else{
            qtdPessoasPresentes = totalDeViajantes;
        }
    }

    public void sobe(){
         // Subir
    }

    public void desce(){
        // Descer
    }

}
