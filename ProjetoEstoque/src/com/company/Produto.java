package com.company;

public class Produto {
    //atributos
    public int idProduto;
    public String descricao;
    public long quantidade;
    public long nivel;
    public double valor;

    public boolean entrada(long valor) {
        quantidade += valor;
        if (valor<=0) {
            return false;
        } else {
            return true;
        }
    };
    public boolean saida(long valor) {
        if (quantidade<valor) {
            return false;
        } else {
            quantidade -= valor;
            return true;
        }

    };
    public void imprimir() {
        System.out.println("ID do produto: " + idProduto);
        System.out.println("Descrição do produto: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Nivel: " + nivel);
        System.out.println("Valor: " + valor);
    };
    public void checarNivel() {
        if (quantidade<nivel) {
            System.out.println("Nivel abaixo do disponivel avisar setor de compras");
        } else {
            System.out.println("Nivel de estoque ok");
        }

    };
}
