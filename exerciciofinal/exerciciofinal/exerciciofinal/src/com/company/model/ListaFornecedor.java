package com.company.model;

import com.company.model.Contato;
import com.company.model.Fornecedor;

import java.util.ArrayList;

public class ListaFornecedor {

    public static ArrayList<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();

    public static void adcionarForncedor(Fornecedor fornecedor) {
        listaFornecedor.add(fornecedor);
    }

    public static ArrayList<Fornecedor> getListaFornecedor() {
        return listaFornecedor;
    };

    public static void fornecedoresPreviamenteCadastrados() {
        listaFornecedor.add(new Fornecedor(132654, "ACME LTDA", "Rua 15",
                new Contato("escritorio", "19 99999-9999", "contato@acme.com")));
        listaFornecedor.add(new Fornecedor(132654, "Organizações Tabajara", "Rua 12",
                new Contato("escritorio", "19 99999-8888", "contato@tabajara.com")));
    }
}
