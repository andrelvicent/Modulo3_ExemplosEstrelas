package br.com.zup.ResolucaoLevelUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando lista de paises
        List <Pais> continente = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        // Instanciando países
        Pais pais1 = new Pais("Brasil", 8516000,211000000 );
        Pais pais2 = new Pais("Argentina", 5000, 5000);
        Pais pais3 = new Pais("Chile", 8000, 5);
        Pais pais4 = new Pais("Peru", 70, 90);

        // Adicionando países na lista
        continente.add(pais1);
        continente.add(pais2);
        continente.add(pais3);
        continente.add(pais4);

        // Criando variáveis para manipular o menu
        boolean menu = true;
        int opcao= 0;

        // Menu
        while (menu){
            System.out.println("Por favor, digite 1 para listar os paises");
            System.out.println("Por favor, digite 2 para sair do menu");
            opcao = leitor.nextInt();

            // Percorrendo a lista e exibindo informações
            if (opcao == 1){
                for (Pais referencia : continente){
                    System.out.println("O nome do pais é: ");
                    System.out.println(referencia.nome);
                    System.out.println("A extensão territorial do país é: ");
                    System.out.println(referencia.extensaoTerritorial);
                    System.out.println("A população do país é: ");
                    System.out.println(referencia.populacao);
                }
            }

            // Saindo do menu
            else if (opcao == 2){
                System.out.println("Obrigado e volte sempre");
                menu = false;
            }

            // Mensagem de erro
            else{
                System.out.println("Por favor, digite um valor valido");
            }
        }

    }
}
