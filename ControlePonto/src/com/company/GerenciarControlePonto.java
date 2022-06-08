package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class GerenciarControlePonto {

    public static void main(String[] args) {
	Gerente gerente = new Gerente();
    gerente.setLogin("jose.almeida");
    gerente.setSenha("123456");
    gerente.setNome("José de Almeida");
    gerente.setEmail("jose.almeida@gmail.com");
    gerente.setDocumento("56.254.968-28");
    gerente.setIdFunc(14685);

    Secretaria secretaria = new Secretaria();
    secretaria.setIdFunc(14686);
    secretaria.setDocumento("99.898.589.76");
    secretaria.setNome("Camila Oliveira");
    secretaria.setEmail("camila.oliveira2@gmail.com");
    secretaria.setTelefone("19 3868-6868");
    secretaria.setRamal("6851");

    Operador operador = new Operador();
    operador.setDocumento("45.658.958-99");
    operador.setIdFunc(14989);
    operador.setNome("Claudio da Silva");
    operador.setEmail("claudio.silva@gmail.com");
    operador.setValorHora(12.50);

    long tempoInicial = System.currentTimeMillis();
    RegistroPonto registroPontoGerente = new RegistroPonto();
    registroPontoGerente.setFunc(gerente);
    registroPontoGerente.setDataRegistro(LocalDate.now());
    registroPontoGerente.setIdRegPonto(gerente.getIdFunc());
    registroPontoGerente.setHoraEntrada(LocalDateTime.now());
    registroPontoGerente.apresentarRegistroPonto(gerente.getNome(), registroPontoGerente.getDataRegistro(), registroPontoGerente.getHoraEntrada(), registroPontoGerente.getHoraSaida());
    try {Thread.sleep(1000);} catch (InterruptedException ex) {}

    RegistroPonto registroPontoSecretaria = new RegistroPonto();
    registroPontoSecretaria.setFunc(secretaria);
    registroPontoSecretaria.setIdRegPonto(secretaria.getIdFunc());
    registroPontoSecretaria.setDataRegistro(LocalDate.now());
    registroPontoSecretaria.setHoraEntrada(LocalDateTime.now());
    registroPontoSecretaria.apresentarRegistroPonto(secretaria.getNome(), registroPontoSecretaria.getDataRegistro(), registroPontoSecretaria.getHoraEntrada(), registroPontoSecretaria.getHoraSaida());
    try {Thread.sleep(1000);} catch (InterruptedException ex) {}

    RegistroPonto registroPontoOperador = new RegistroPonto();
    registroPontoOperador.setFunc(operador);
    registroPontoOperador.setIdRegPonto(operador.getIdFunc());
    registroPontoOperador.setDataRegistro(LocalDate.now());
    registroPontoOperador.setHoraEntrada(LocalDateTime.now());
    registroPontoOperador.apresentarRegistroPonto(operador.getNome(), registroPontoOperador.getDataRegistro(), registroPontoOperador.getHoraEntrada(), registroPontoOperador.getHoraSaida());
    try {Thread.sleep(1000);} catch (InterruptedException ex) {}

    registroPontoGerente.setHoraSaida(LocalDateTime.now());
    registroPontoGerente.apresentarRegistroPonto(gerente.getNome(), registroPontoGerente.getDataRegistro(), registroPontoGerente.getHoraEntrada(), registroPontoGerente.getHoraSaida() );
    try {Thread.sleep(1000);} catch (InterruptedException ex) {}

    registroPontoSecretaria.setHoraSaida(LocalDateTime.now());
    registroPontoSecretaria.apresentarRegistroPonto(secretaria.getNome(), registroPontoSecretaria.getDataRegistro(), registroPontoSecretaria.getHoraEntrada(), registroPontoSecretaria.getHoraSaida());
    try {Thread.sleep(1000);} catch (InterruptedException ex) {}

    registroPontoOperador.setHoraSaida(LocalDateTime.now());
    registroPontoOperador.apresentarRegistroPonto(operador.getNome(), registroPontoOperador.getDataRegistro(), registroPontoOperador.getHoraEntrada(), registroPontoOperador.getHoraSaida());
    try {Thread.sleep(1000);} catch (InterruptedException ex) {}


    System.out.println(ANSI_GREEN + "Construido com sucesso (tempo total: " + (System.currentTimeMillis() - tempoInicial)/1000 + " segundos) " + ANSI_RESET);
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
}
