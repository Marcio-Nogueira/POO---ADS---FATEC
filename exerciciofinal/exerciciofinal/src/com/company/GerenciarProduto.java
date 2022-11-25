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
                    cadastrarContato(scanner);
                    break;
                case 4:
                    System.out.println("abrir cesta");
                    System.out.println("1. Adcionar Produto no Carrinho");
                    System.out.println("2. Fechar Carrinho");
                    int alternativa = 0;
                    alternativa = Integer.parseInt(scanner.nextLine());
                    opcoesCarrinho(alternativa, scanner);
                    break;
                case 5:
                    System.out.println("saindo");
                    fecharMenu = true;
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        } while(!fecharMenu);
    }

    private static Contato cadastrarContato(Scanner scanner) {
        System.out.println("-------Cadastro de Contato-------");
        System.out.println("Entre com os dados a seguir:");
        System.out.println("\nContato:");
        String contato = scanner.nextLine();
        System.out.println("\nEmail:");
        String email = scanner.nextLine();
        System.out.println("\nTelefone:");
        String telefone = scanner.nextLine();
        Contato contato1 = new Contato(contato, email, telefone);
        return contato1;
    }

    private static void opcoesCarrinho(int alternativa, Scanner scanner) {
        switch (alternativa) {
            case 1:
                System.out.println("-----Produtos disponiveis------");
                for (int i = 0; i < Cesta.getItens().size(); i++) {
                    System.out.println(i + ". " + Cesta.getItens().get(i).toString());
                }
                System.out.println("Digite o index do produto desejado");
                int index = Integer.parseInt(scanner.nextLine());
                Cesta.adcionarItem(Cesta.getItens().get(index));
                break;
            case 2:
                System.out.println("Total ");
                double total = Cesta.calcularTotal();
                System.out.println("Total: " + total);
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
        Produto produto = new Produto(codigoProd, descricao, preco, quantidade);
        Cesta.adcionarItem(produto);
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
        Contato contato = cadastrarContato(scanner);
        Fornecedor fornecedor = new Fornecedor(codigoForn, razaoSocial,endereco,
                cidade, estado, contato);
    }
}
