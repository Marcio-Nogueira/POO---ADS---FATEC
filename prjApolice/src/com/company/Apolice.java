package com.company;

public class Apolice {
    //atributos.
    private String nomeSegurado;
    private int idade;
    private double valorPremio;

    //getter and setters.

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    //Construtores
    public Apolice(String nomeSegurado, int idade, double valorPremio) {
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    //métodos.
    public String imprimir() {
        return "Dados do segurado\n" +
                "Nome: " + nomeSegurado + " \n" +
                "Idade: " + idade + " \n" +
                "Valor do prêmio: " + valorPremio + " \n";

    }

}



