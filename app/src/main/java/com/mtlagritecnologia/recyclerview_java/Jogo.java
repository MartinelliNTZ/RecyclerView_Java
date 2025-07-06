package com.mtlagritecnologia.recyclerview_java;

/**
 * @author Matheus Martinelli
 * Created on *06-07-2025
 * martinelli.matheus2@gmail.com
 */
public class Jogo {
    private String nome;
    private String plataform;

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
