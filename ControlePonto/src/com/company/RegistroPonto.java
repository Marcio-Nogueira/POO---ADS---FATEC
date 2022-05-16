package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public RegistroPonto setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
        return this;
    }

    public Funcionario getFunc() {
        return func;
    }

    public RegistroPonto setFunc(Funcionario func) {
        this.func = func;
        return this;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public RegistroPonto setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
        return this;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public RegistroPonto setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
        return this;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public RegistroPonto setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
        return this;
    }

    public void apresentarRegistroPonto(String nomeFunc, LocalDate dataRegistro, LocalDateTime horaEntrada, LocalDateTime horaSaida) {
        System.out.println("========================");
        System.out.println("Funcionário: " + nomeFunc);
        System.out.println("Data de registro: " + dataRegistro);
        System.out.println("Horario de entrada: " + horaEntrada);
        System.out.println("Horario de saida: " + horaSaida);
    }

}
