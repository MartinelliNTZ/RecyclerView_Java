package com.mtlagritecnologia.recyclerview_java;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * @author Matheus Martinelli
 * Created on *06-07-2025
 * martinelli.matheus2@gmail.com
 */
public class JogoViewHolder extends RecyclerView.ViewHolder {
    TextView txtNome, txtPlataform;


    public JogoViewHolder(@NonNull View itemView) {
        super(itemView);
        txtNome = itemView.findViewById(R.id.txtCardNome);
        txtPlataform = itemView.findViewById(R.id.txtCardPlataform);


    }
}
