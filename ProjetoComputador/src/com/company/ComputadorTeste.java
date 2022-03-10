package com.company;

public class ComputadorTeste {

    public static void main(String[] args) {
        //Criar um objeto da classe Computador e atribuir valores a seus atributos.
	    Computador computador1 = new Computador();
        computador1.marca = "HP";
        computador1.modelo = "Slim";
        computador1.cor = "preto";
        computador1.numeroSerie = 123456;
        computador1.preco = 2500.0;
        //testar imprimir e verificar  resultados
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();
        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Professional";
        computador2.cor = "Branco";
        computador2.numeroSerie = 654321;
        computador2.preco = 3500.0;
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();
        double valorAlterado = computador2.alterarValor(5000.0);
        if (valorAlterado == 1) {
            System.out.println("Valor Alterado");
        } else {
            System.out.println("Valor NÂO alterado");
        }
        computador2.imprimir();

    }
}
