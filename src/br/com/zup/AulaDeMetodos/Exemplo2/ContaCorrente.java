package br.com.zup.AulaDeMetodos.Exemplo2;

public class ContaCorrente {
    // Criação dos atributos (Características) da classe

    String nomeDoTitular;
    String cpf;
    String agencia;
    String numeroDeConta;
    double emprestimo = 900;
    double saldo = 0;

    // Método construtor
    public ContaCorrente(String nomeDoTitular, String cpf, String agencia, String numeroDeConta){
        this.nomeDoTitular = nomeDoTitular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroDeConta = numeroDeConta;
    }

    // Mostrando dados da conta corrente
    public void mostrarDados(){
        System.out.println("Nome do Titular: " +nomeDoTitular);
        System.out.println("CPF do Titular: " +cpf);
        System.out.println("Agencia: " +agencia);
        System.out.println("Numero de Conta: " +numeroDeConta);
        System.out.println("Valor liberado para emprestimo: " +emprestimo);
        System.out.println("Saldo: R$ "+saldo);
    }

    // Método responsável por subtrair o valor do saldo
    public void depositar(double valorDoDeposito){
        saldo = saldo + valorDoDeposito;
    }

    // Método responsável por aumentar o valor do saldo
    public void sacar(double valorDoSaque){
        saldo = saldo - valorDoSaque;
    }

    // Método responsável por liberar o emprestimo e depositar o valor em conta
    public void liberaEmprestimo(double valor){
        emprestimo = emprestimo - valor;
        depositar(valor);
    }

    // Método responsável por validar se o usuário pode ou não receber um empréstimo
    public void solicitaEmprestimo(double valor){
        if (valor > emprestimo){
            System.out.println("Este limite não está aprovado");
        } else{
            System.out.println("Este limite está aprovado");
            liberaEmprestimo(valor);
        }
    }

    // Método com retorno do quanto o usuário precisa pagar de imposto (Alerta de quebra do princípio de responsabilidade única*)
    public double calculaImposto(){
        double resultado = 0.1 * saldo;
        return resultado;
    }

    // Debitando imposto com calculo de imposto feito em método calculaImposto()
    public void debitaImposto(){
        saldo = saldo - calculaImposto();
    }
}
