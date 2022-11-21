package com.company;

import java.util.ArrayList;

public class Cesta {

    public static ArrayList<Produto> itens = new ArrayList<Produto>();

    public void adcionarItem(Produto produto) {
        itens.add(produto);
    }

    public static ArrayList<Produto> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0;

        if(itens.isEmpty()) {
            return total;
        }

        for (int i = 0; i < itens.size(); i++) {
            total = total + (itens.get(i).getPreco() * itens.get(i).getQuantidade());
        }

        return total;
    }
}
