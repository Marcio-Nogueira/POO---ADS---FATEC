package com.company;

import java.util.Scanner;

public class GerenciarProduto {

    public static void main(String[] args) {

        /*
        1. Cadastrar Fornecedor
        2. Cadastrar Produto
        3. Cadastrar Contato
        4. Abrir Cesta
        5. Sair

        sub-menu do abrir cesta
        1. Adcionar Produto no Carrinho
        2. Fechar Carrinho
         */

        Scanner scanner = new Scanner(System.in);

        boolean fecharMenu = false;
        int opcao = 0;
        do {
            System.out.println("Exercicio Final");
            System.out.println("1. Cadastrar Fornecedor");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Cadastrar Contato");
            System.out.println("4. Abrir Cesta");
            System.out.println("5. Sair");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarFornecedor(scanner);
                    break;
                case 2:
                    cadastrarProduto(scanner);
                    break;
                case 3:
                    System.out.println("contato");
                    break;
                case 4:
                    System.out.println("abrir cesta");
                    System.out.println("1. Adcionar Produto no Carrinho");
                    System.out.println("2. Fechar Carrinho");
                    int alternativa = 0;
                    alternativa = Integer.parseInt(scanner.nextLine());
                    opcoesCarrinho(alternativa);
                    break;
                case 5:
                    System.out.println("saindo");
                    fecharMenu = true;
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        } while(fecharMenu == false);
    }

    private static void opcoesCarrinho(int alternativa) {
        switch (alternativa) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Digite uma opção válida");
                break;
        }
    }

    private static void cadastrarProduto(Scanner scanner) {
        System.out.println("Entre com os dados a seguir:");
        System.out.println("\nCódigo do produto:");
        int codigoProd = Integer.parseInt(scanner.nextLine());
        System.out.println("\nDescrição:");
        String descricao = scanner.nextLine();
        System.out.println("\nPreço:");
        Double preco = Double.parseDouble(scanner.nextLine());
        System.out.println("\nQuantidade:");
        int quantidade = Integer.parseInt(scanner.nextLine());
        System.out.println("\nFornecedor");
        Fornecedor fornecedor = new Fornecedor();
        //criar lista de fonecedor
    }

    private static void cadastrarFornecedor(Scanner scanner) {
        System.out.println("Entre com os dados a seguir:");
        System.out.println("\nCódigo do Fornecedor: ");
        int codigoForn = Integer.parseInt(scanner.nextLine());
        System.out.println("\nRazão Social: ");
        String razaoSocial = scanner.nextLine();
        System.out.println("\nEndereço: ");
        String endereco = scanner.nextLine();
        System.out.println("\nCidade: ");
        String cidade = scanner.nextLine();
        System.out.println("\nEstado:");
        String estado = scanner.nextLine();
        Contato contato = new Contato();
        System.out.println("Contato:");
        String cont = scanner.nextLine();
        contato.setContato(cont);
        System.out.println("Telefone:");
        String telefone = scanner.nextLine();
        contato.setTelefone(telefone);
        System.out.println("email:");
        String email = scanner.nextLine();
        contato.setEmail(email);
        Fornecedor fornecedor = new Fornecedor(codigoForn, razaoSocial,endereco,
                cidade, estado, contato);
    }
}
