package com.company;

import java.util.Scanner;

public class GerenciarProduto {

    public Produto prod = new Produto();

    public static void main(String[] args) {
        //Menu com as opções
        Scanner input = new Scanner(System.in);
        GerenciarProduto produto = new GerenciarProduto();
        int opc = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Dar entrada de produto");
            System.out.println("3.. Dar saida de produto");
            System.out.println("4.. Mostrar Nivel");
            System.out.println("5.. Consultar");
            System.out.println("9.. Sair");
            System.out.println("Sua opção: ");
            opc = Integer.parseInt(input.nextLine());
            switch (opc) {
                case 1:
                    produto.execCadastrar();
                    break;
                case 2:
                    produto.execDarEntrada();
                    break;
                case 3:
                    produto.execDarSaida();
                    break;
                case 4:
                    produto.execMostrarNivel();
                    break;
                case 5:
                    produto.execConsultar();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc!=9);
    }

    public void execCadastrar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastrando o produto");
        System.out.println("Digite o id do produto: ");
        prod.idProduto = Integer.parseInt(input.nextLine());
        System.out.println("Descrição: ");
        prod.descricao = input.nextLine();
        System.out.println("Quantidade em estoque: ");
        prod.quantidade = Long.parseLong(input.nextLine());
        System.out.println("Nivel: ");
        prod.nivel = Long.parseLong(input.nextLine());

    }
    public void execDarEntrada() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade à dar entrada: ");
        long valorEntrada = Long.parseLong(input.nextLine());
        prod.entrada(valorEntrada);
        System.out.println("Entrada efetuada com sucesso");
    }
    public void execDarSaida() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade à retirar:");
        long valorSaida = Long.parseLong(input.nextLine());
        prod.saida(valorSaida);
        System.out.println("Retirada de produto efetuada com sucesso");
    }
    public void execMostrarNivel() {
        prod.checarNivel();
    }
    public void execConsultar() {
        prod.imprimir();
    }

}
