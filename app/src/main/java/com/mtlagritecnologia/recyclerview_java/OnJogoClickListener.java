package com.mtlagritecnologia.recyclerview_java;

/**
 * @author Matheus Martinelli
 * Created on *06-07-2025
 * martinelli.matheus2@gmail.com
 */
/**
 * Interface criada para capturar o clique simples em um item da lista do RecyclerView.
 * Quando o usuário toca rapidamente em um item (sem segurar), este método será chamado.
 */
public interface OnJogoClickListener {

    /**
     * Método chamado quando um item do RecyclerView é clicado normalmente.
     * @param jogo Objeto do tipo Jogo que foi clicado.
     */
    void onJogoClick(Jogo jogo);
}