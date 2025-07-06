package com.mtlagritecnologia.recyclerview_java;

/**
 * @author Matheus Martinelli
 * Created on *06-07-2025
 * martinelli.matheus2@gmail.com
 */
public class Jogo {

    // Nome do jogo (ex: "God of War")
    private String nome;

    // Plataforma do jogo (ex: "PlayStation", "PC")
    private String plataform;

    // Preço do jogo em reais (ex: 199.90)
    private double price;

    /**
     * Construtor principal que recebe nome, plataforma e preço.
     * Esse deve ser o mais usado no seu código atual.
     */
    public Jogo(String nome, String plataform, double price) {
        this.nome = nome;
        this.plataform = plataform;
        this.price = price;
    }

    /**
     * Getter: retorna o preço do jogo.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter: atualiza o preço do jogo.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Construtor alternativo (sem preço).
     * ⚠️ Este provavelmente não está mais em uso e pode ser removido se não for necessário.
     */
    public Jogo(String nome, String plataform) {
        this.nome = nome;
        this.plataform = plataform;
    }

    /**
     * Getter: retorna o nome do jogo.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter: atualiza o nome do jogo.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Getter: retorna a plataforma do jogo.
     */
    public String getPlataform() {
        return plataform;
    }

    /**
     * Setter: atualiza a plataforma do jogo.
     */
    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }
}