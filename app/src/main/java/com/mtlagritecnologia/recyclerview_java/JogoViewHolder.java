package com.mtlagritecnologia.recyclerview_java;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author Matheus Martinelli
 * Created on *06-07-2025
 * martinelli.matheus2@gmail.com
 */
public class JogoViewHolder extends RecyclerView.ViewHolder {

    // Referências para os elementos visuais (TextViews e ImageView) do item da lista
    TextView txtNome;        // Mostra o nome do jogo
    TextView txtPlataform;   // Mostra a plataforma (PC, Xbox, etc.)
    TextView txtPrice;       // Mostra o preço formatado (ex: R$ 129,90)
    ImageView imgLogo;       // Exibe a imagem da plataforma (ícone)

    /**
     * Este construtor é chamado automaticamente pelo RecyclerView
     * quando ele precisa criar um novo item visual (ViewHolder).
     *
     * Aqui são feitas as ligações entre os elementos do XML (jogo_linha.xml)
     * e os objetos do ViewHolder, usando findViewById.
     */
    public JogoViewHolder(@NonNull View itemView) {
        super(itemView);

        // Liga cada variável ao componente visual correspondente do layout
        txtNome = itemView.findViewById(R.id.txtCardNome);
        txtPlataform = itemView.findViewById(R.id.txtCardPlataform);
        txtPrice = itemView.findViewById(R.id.txtPrice);
        imgLogo = itemView.findViewById(R.id.imgCard);
    }
}
