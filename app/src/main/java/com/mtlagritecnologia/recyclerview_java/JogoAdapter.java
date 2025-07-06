package com.mtlagritecnologia.recyclerview_java;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * @author Matheus Martinelli
 * Created on *06-07-2025
 * martinelli.matheus2@gmail.com
 */
public class JogoAdapter extends RecyclerView.Adapter<JogoViewHolder> {
    private Context context;
    private ArrayList<Jogo> itens;

    public JogoAdapter(Context context, ArrayList<Jogo> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public JogoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int typeView) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.jogo_linha, parent, false);
        JogoViewHolder jogoViewHolder = new JogoViewHolder(view);
        return jogoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull JogoViewHolder jogoViewHolder, int position) {
        Jogo jogo = itens.get(position);
        jogoViewHolder.txtNome.setText(jogo.getNome());
        jogoViewHolder.txtPlataform.setText(jogo.getPlataform());
        jogoViewHolder.txtNome.setOnClickListener(v ->{
            Toast.makeText(context, "Clicou em "+"jogo.getNome()", Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
