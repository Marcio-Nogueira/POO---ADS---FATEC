package com.company;

public class Main {

    public static void main(String[] args) {
        //Membros do acampamento
        Acampamento membro = new Acampamento();
        membro.nome = "José";
        membro.idade = 25;

        //chamando metodos
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();

    }
}
