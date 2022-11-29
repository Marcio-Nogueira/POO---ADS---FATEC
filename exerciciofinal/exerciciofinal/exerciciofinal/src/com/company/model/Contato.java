package com.company.model;

public class Contato {

    private String contato;

    private String telefone;

    private String email;

    public Contato(String contato, String telefone, String email) {
        this.contato = contato;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato() {
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}