package com.company;

public class Funcionario {
    private int idFunc;
    private String nome;
    private String email;
    private String documento;

    public int getIdFunc() {
        return idFunc;
    }

    public Funcionario setIdFunc(int idFunc) {
        this.idFunc = idFunc;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Funcionario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDocumento() {
        return documento;
    }

    public Funcionario setDocumento(String documento) {
        this.documento = documento;
        return this;
    }
}
