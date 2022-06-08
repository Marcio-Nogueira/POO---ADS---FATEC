package com.company;

public class Computador {
    //Atributos
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    //Métodos
    public void imprimir() {
        System.out.println("Marca: " +marca);
        System.out.println("Cor: " +cor);
        System.out.println("Modelo: " +modelo);
        System.out.println("Numero de série: " +numeroSerie);
        System.out.println("Preço " +preco +"\n");
    }
    public void calcularValor() {
        if (marca == "HP") {
            preco = preco*1.3;
        } else if (marca == "IBM") {
            preco = preco*1.5;
        }

    }
    public int alterarValor(double valor) {
        if (valor>0) {
            preco = valor;
            return 1;
        } else {
            return 0;
        }
    }
}
