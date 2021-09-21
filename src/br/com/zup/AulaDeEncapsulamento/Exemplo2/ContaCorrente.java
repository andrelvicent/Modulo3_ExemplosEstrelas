package br.com.zup.AulaDeEncapsulamento.Exemplo2;

public class ContaCorrente {
    private String nome;
    private String numeroDaConta;
    private double saldo = 0;

    public ContaCorrente(String nome, String numeroDaConta){
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
    }

    public String getNome(){
        return nome;
    }

    public String getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumeroDaConta(String numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public void sacar(double saque){
        saldo = saldo - saque;
    }

    public void depositar(double deposito){
        saldo = saldo + deposito;
    }

    public void extrato(){
        System.out.println("Nome do correntista: " +nome);
        System.out.println("Numero da conta: " +numeroDaConta);
        System.out.println("Saldo da conta: R$" +saldo);
    }
}
