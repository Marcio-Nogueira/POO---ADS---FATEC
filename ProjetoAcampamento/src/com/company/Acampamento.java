package com.company;

public class Acampamento {
    //Atributos
    public String nome;
    public char equipe;
    public int idade;

    //Métodos
    public void imprimir() {
        System.out.println("Nome: " + nome + "\n");
        System.out.println("Idade: " + idade + "\n");
        System.out.println("Equipe: " + equipe + "\n");
    }
    public void separarGrupo() {
        if (idade>=6 && idade<=10) {
            equipe = 'A';
        } else if (idade>=11 && idade<=20) {
            equipe = 'B';
        } else if (idade>=21) {
            equipe = 'C';
        }
    }
}
