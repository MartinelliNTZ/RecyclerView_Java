package com.mtlagritecnologia.recyclerview_java;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

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

        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String t = formatador.format(jogo.getPrice());
        jogoViewHolder.txtPrice.setText(t);
        jogoViewHolder.txtNome.setOnClickListener(v ->{
            Toast.makeText(context, "Clicou em "+"jogo.getNome()", Toast.LENGTH_SHORT).show();
        });

        switch (jogo.getPlataform().toLowerCase()) {
            case "xbox":
                jogoViewHolder.imgLogo.setImageResource(R.drawable.xbox);
                break;
            case "pc":
                jogoViewHolder.imgLogo.setImageResource(R.drawable.pc);
                break;
            case "nintendo switch":
            case "nintendo":
                jogoViewHolder.imgLogo.setImageResource(R.drawable.nintendo);
                break;
            case "playstation":
                jogoViewHolder.imgLogo.setImageResource(R.drawable.playstation);
                break;
            default:
                jogoViewHolder.imgLogo.setImageResource(R.drawable.ic_default); // opcional
                break;
        }

    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
