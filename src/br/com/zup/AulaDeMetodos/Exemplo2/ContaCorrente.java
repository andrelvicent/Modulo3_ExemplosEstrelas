package br.com.zup.AulaDeMetodos.Exemplo2;

public class ContaCorrente {
    String nomeDoTitular;
    String cpf;
    String agencia;
    String numeroDeConta;
    double emprestimo = 900;
    double saldo = 0;

    public ContaCorrente(String nomeDoTitular, String cpf, String agencia, String numeroDeConta){
        this.nomeDoTitular = nomeDoTitular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroDeConta = numeroDeConta;
    }

    public void mostrarDados(){
        System.out.println("Nome do Titular: " +nomeDoTitular);
        System.out.println("CPF do Titular: " +cpf);
        System.out.println("Agencia: " +agencia);
        System.out.println("Numero de Conta: " +numeroDeConta);
        System.out.println("Valor liberado para emprestimo: " +emprestimo);
        System.out.println("Saldo: R$ "+saldo);
    }

    public void depositar(double valorDoDeposito){
        saldo = saldo + valorDoDeposito;
    }

    public void sacar(double valorDoSaque){
        saldo = saldo - valorDoSaque;
    }

    public void liberaEmprestimo(double valor){
        emprestimo = emprestimo - valor;
    }

    public void solicitaEmprestimo(double valor){
        if (valor > emprestimo){
            System.out.println("Este limite não está aprovado");
        } else{
            System.out.println("Este limite está aprovado");
            depositar(valor);
            liberaEmprestimo(valor);
        }
    }
}
