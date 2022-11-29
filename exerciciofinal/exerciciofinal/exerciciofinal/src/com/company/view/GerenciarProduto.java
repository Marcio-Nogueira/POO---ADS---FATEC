package com.company.view;

import com.company.exception.FormatoEstadoException;
import com.company.exception.IndiceInvalidoException;
import com.company.exception.NumeroNegativoException;
import com.company.model.*;

import java.util.Scanner;

public class GerenciarProduto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaFornecedor.fornecedoresPreviamenteCadastrados();
        boolean fecharMenu = false;
        int opcao;
        do {
            System.out.println("Exercicio Final");
            System.out.println("1. Cadastrar Fornecedor");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Cadastrar Contato");
            System.out.println("4. Abrir Cesta");
            System.out.println("5. Sair");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> cadastrarFornecedor(scanner);
                case 2 -> cadastrarProduto(scanner);
                case 3 -> cadastrarContato(scanner);
                case 4 -> {
                    System.out.println("abrir cesta");
                    System.out.println("1. Adcionar Produto no Carrinho");
                    System.out.println("2. Fechar Carrinho");
                    int alternativa;
                    alternativa = Integer.parseInt(scanner.nextLine());
                    opcoesCarrinho(alternativa, scanner);
                }
                case 5 -> {
                    System.out.println("saindo");
                    fecharMenu = true;
                }
                default -> System.out.println("Digite uma opção válida");
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
        return new Contato(contato, email, telefone);
    }

    private static void opcoesCarrinho(int alternativa, Scanner scanner) {
        boolean menuCarrinho = false;
        do {
            switch (alternativa) {
                case 1 -> {
                    System.out.println("-----Produtos disponiveis------");
                    for (int i = 0; i < ListaProduto.getListaProduto().size(); i++) {
                        System.out.println(i + ". " + ListaProduto.getListaProduto().get(i).toString());
                    }
                    if (ListaProduto.getListaProduto().size() < 1) {
                        System.out.println("Não há produtos cadastrados na base de dados");
                        menuCarrinho = true;
                    } else {
                        int index = 0;
                        boolean isValid = false;
                        while(isValid == false) {
                            try {
                                System.out.println("Digite o index do produto desejado");
                                index = Integer.parseInt(scanner.nextLine());
                                if (index >= ListaProduto.getListaProduto().size()) {
                                    throw new IndiceInvalidoException();
                                } else {
                                    System.out.println("produto adcionado ao carrinho");
                                    isValid = true;
                                    menuCarrinho = true;

                                }
                            } catch (IndiceInvalidoException e) {
                                System.out.println("Entrada inválida - Digite um index de produto válido");
                            }
                        }
                        Cesta.adcionarItem(ListaProduto.getListaProduto().get(index));
                    }
                }
                case 2 -> {
                    System.out.println("Total ");
                    double total = Cesta.calcularTotal();
                    for (int i = 0; i < Cesta.getItens().size(); i++) {
                        System.out.println("Descrição: " + Cesta.getItens().get(i).getDescricao().toString());
                        System.out.println("Preço Unitario: " + Cesta.getItens().get(i).getPreco());
                        System.out.println("Total do item: " + Cesta.getItens().get(i).getTotal(
                                Cesta.getItens().get(i).getPreco(), Cesta.getItens().get(i).getQuantidade()));
                    }
                    System.out.println("Total geral: " + total);
                    return;
                }
                default -> System.out.println("Digite uma opção válida");
            }
        }while (!menuCarrinho);
    }

    private static void cadastrarProduto(Scanner scanner) {
        System.out.println("Entre com os dados a seguir:");
        int codigoProd = 0;
        boolean isValid = false;
        while(isValid == false) {
            System.out.println("\nCódigo do produto:");
            try {
                codigoProd = Integer.parseInt(scanner.nextLine());
                if (codigoProd < 0) {
                    throw new NumeroNegativoException();
                } else {
                    isValid = true;
                }
            } catch (NumeroNegativoException | NumberFormatException e) {
                System.out.println("Entrada inválida - código do produto deve ser um número inteiro positivo");
            }
        }
        System.out.println("\nDescrição:");
        String descricao = scanner.nextLine();
        System.out.println("\nPreço:");
        double preco = 0;
        isValid = false;
        while (isValid == false) {
            try {
                preco = Double.parseDouble(scanner.nextLine());
                if (preco < 0) {
                    throw new NumeroNegativoException();
                } else  {
                    isValid = true;
                }
            } catch (NumeroNegativoException | NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
        }
        System.out.println("\nQuantidade:");
        int quantidade = 0;
        isValid = false;
        while(isValid == false) {
            try {
                quantidade = Integer.parseInt(scanner.nextLine());
                if (quantidade < 0) {
                    throw new NumeroNegativoException();
                } else {
                    isValid = true;
                }
            } catch (NumeroNegativoException | NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
        }
        Produto produto = new Produto(codigoProd, descricao, preco, quantidade);
        System.out.println("Escolha o fornecedor e digite seu index");
        for (int i = 0; i < ListaFornecedor.getListaFornecedor().size(); i++) {
            System.out.println(i + ". " + ListaFornecedor.getListaFornecedor().get(i).toString());
        }
        int index = 0;
        isValid = false;
        while(isValid == false) {
            try {
                index = Integer.parseInt(scanner.nextLine());
                if (index >= ListaFornecedor.getListaFornecedor().size()) {
                    throw new IndiceInvalidoException();
                } else {
                    isValid = true;
                }
            } catch (IndiceInvalidoException e) {
                System.out.println("index inválido - digite um index válido de fornecedor");
            }
        }
        Fornecedor fornecedor = ListaFornecedor.getListaFornecedor().get(index);
        produto.setFornecedor(fornecedor);
        ListaProduto.adcionarProduto(produto);
        System.out.println("Produto adcionado com sucesso!");
    }

    private static void cadastrarFornecedor(Scanner scanner) {
        System.out.println("Entre com os dados a seguir:");
        System.out.println("\nCódigo do Fornecedor: ");
        int codigoForn = 0;
        boolean isValid = false;
        while(isValid == false) {
            try {
                codigoForn = Integer.parseInt(scanner.nextLine());
                if (codigoForn < 0) {
                    throw new NumeroNegativoException();
                } else {
                    isValid = true;
                }
            } catch (NumeroNegativoException | NumberFormatException e) {
                System.out.println("Entrada inválida - código do forncedor deve ser um número inteiro positivo");
            }
        }
        System.out.println("\nRazão Social: ");
        String razaoSocial = scanner.nextLine();
        System.out.println("\nEndereço: ");
        String endereco = scanner.nextLine();
        System.out.println("\nCidade: ");
        String cidade = scanner.nextLine();
        System.out.println("\nEstado:");
        String estado = scanner.nextLine();
        isValid = false;
        while(isValid == false) {
            try {
                if (estado.length() > 2 || !estado.toUpperCase().equals(estado)) {
                    throw new FormatoEstadoException("Estado ou formato inválido");
                } else {
                    isValid = true;
                }
            } catch (FormatoEstadoException e) {
                System.out.println("Entrada inválida - Estado deve conter 2 caracteres maiúsculos");
                estado = scanner.nextLine();
            }
        }
        Contato contato = cadastrarContato(scanner);
        ListaFornecedor.adcionarForncedor(new Fornecedor(codigoForn, razaoSocial,endereco,
                cidade, estado, contato));
        System.out.println("Fornecedor Cadastrado com sucesso");
    }
}
