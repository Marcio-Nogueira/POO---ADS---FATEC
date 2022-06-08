package com.company;

public class Gerente extends Funcionario {
    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public Gerente setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Gerente setSenha(String senha) {
        this.senha = senha;
        return this;
    }
}
