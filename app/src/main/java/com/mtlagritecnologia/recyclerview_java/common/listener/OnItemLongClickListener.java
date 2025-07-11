package com.mtlagritecnologia.recyclerview_java.common.listener;

/**
 * Interface genérica para capturar eventos de clique longo em itens de uma lista (RecyclerView).
 * Pode ser usada com qualquer tipo de objeto.
 *
 * @param <T> O tipo do item clicado (ex: Jogo, Produto, Pessoa, etc.)
 *
 * @author Matheus Martinelli
 * Created on *06-07-2025
 * martinelli.matheus2@gmail.com
 */
public interface OnItemLongClickListener<T> {

    /**
     * Método chamado quando o item é pressionado por mais tempo.
     *
     * @param item O item da lista que foi clicado.
     */
    void onItemLongClick(T item);
}