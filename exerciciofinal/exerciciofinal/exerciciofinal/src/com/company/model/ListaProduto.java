package com.company.model;

import java.util.ArrayList;

public class ListaProduto {

    public static ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    public static void adcionarProduto(Produto produto) {
        listaProduto.add(produto);
    }

    public static ArrayList<Produto> getListaProduto() {
        return listaProduto;
    };

}
