package com.mtlagritecnologia.recyclerview_java;

/**
 * @author Matheus Martinelli
 * Created on *06-07-2025
 * martinelli.matheus2@gmail.com
 */
public class Jogo {
    private String nome;
    private String plataform;
    private double price;

    public Jogo(String nome, String plataform, double price) {
        this.nome = nome;
        this.plataform = plataform;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Jogo(String nome, String plataform) {
        this.nome = nome;
        this.plataform = plataform;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }
}
