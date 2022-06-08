package com.company;

public class Secretaria extends Funcionario {
    private String telefone;
    private String ramal;

    public String getTelefone() {
        return telefone;
    }

    public Secretaria setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getRamal() {
        return ramal;
    }

    public Secretaria setRamal(String ramal) {
        this.ramal = ramal;
        return this;
    }
}
