package com.mtlagritecnologia.recyclerview_java;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * @author Matheus Martinelli
 * Created on *06-07-2025
 * martinelli.matheus2@gmail.com
 */
public class JogoAdapter extends RecyclerView.Adapter<JogoViewHolder> {
    @NonNull
    @Override
    public JogoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull JogoViewHolder jogoViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
