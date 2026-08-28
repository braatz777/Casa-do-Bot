package com.example.demo;

public class Resposta {

    private String nome;
    private String vai;
    private String levar;

    public Resposta(String nome, String vai, String levar) {
        this.nome = nome;
        this.vai = vai;
        this.levar = levar;
    }

    public String getNome() {
        return nome;
    }

    public String getVai() {
        return vai;
    }

    public String getLevar() {
        return levar;
    }
}