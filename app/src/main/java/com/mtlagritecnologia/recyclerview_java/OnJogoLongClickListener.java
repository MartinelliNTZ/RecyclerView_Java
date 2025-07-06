package com.mtlagritecnologia.recyclerview_java;

/**
 * @author Matheus Martinelli
 * Created on *06-07-2025
 * martinelli.matheus2@gmail.com
 */
/**
 * Interface criada para capturar o evento de clique longo em um item do RecyclerView.
 * Quando o usuário segurar (pressionar por mais tempo) sobre um item, esse método será chamado.
 */
public interface OnJogoLongClickListener {

    /**
     * Método chamado quando um item da lista é pressionado por mais tempo (clique longo).
     * @param jogo Objeto do tipo Jogo que foi clicado.
     */
    void onJogoLongClick(Jogo jogo);
}