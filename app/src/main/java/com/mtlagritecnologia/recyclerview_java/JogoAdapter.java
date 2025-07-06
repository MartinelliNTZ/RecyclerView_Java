package com.mtlagritecnologia.recyclerview_java;

import android.app.AlertDialog;
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

    private Context context;               // Contexto da aplicação (geralmente vem da Activity)
    private ArrayList<Jogo> itens;         // Lista de jogos que serão exibidos no RecyclerView
    private OnJogoClickListener listener;  // Interface para capturar clique simples

    /**
     * Construtor do adapter.
     * Recebe o contexto, a lista de jogos e o listener de clique simples.
     */
    public JogoAdapter(Context context, ArrayList<Jogo> itens, OnJogoClickListener listener) {
        this.context = context;
        this.itens = itens;
        this.listener = listener;
    }

    /**
     * Chamado automaticamente quando o RecyclerView precisa "inflar" um novo item visual (layout).
     * Aqui ele cria o layout baseado no XML 'jogo_linha.xml' e retorna o ViewHolder.
     */
    @NonNull
    @Override
    public JogoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int typeView) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.jogo_linha, parent, false); // Converte o XML em um objeto View
        JogoViewHolder jogoViewHolder = new JogoViewHolder(view); // Cria o ViewHolder com essa View
        return jogoViewHolder;
    }

    /**
     * Esse método é chamado sempre que um item precisa ser exibido ou atualizado na tela.
     * Aqui você define o que vai aparecer em cada campo (nome, plataforma, preço, imagem).
     */
    @Override
    public void onBindViewHolder(@NonNull JogoViewHolder jogoViewHolder, int position) {
        Jogo jogo = itens.get(position); // Recupera o objeto Jogo da posição atual da lista

        // Define os textos das TextViews com os dados do jogo
        jogoViewHolder.txtNome.setText(jogo.getNome());
        jogoViewHolder.txtPlataform.setText(jogo.getPlataform());

        // Formata o preço com vírgula decimal e ponto para milhar (ex: R$ 1.299,90)
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String t = formatador.format(jogo.getPrice());
        jogoViewHolder.txtPrice.setText(t);

        // Escolhe a imagem de acordo com a plataforma
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
                jogoViewHolder.imgLogo.setImageResource(R.drawable.ic_default); // Imagem padrão caso não reconheça
                break;
        }

        // Clique simples: dispara o listener enviado pela Activity
        jogoViewHolder.itemView.setOnClickListener(v -> {
            listener.onJogoClick(itens.get(position));
        });

        // Clique longo: exibe um alerta para simular a compra do jogo
        jogoViewHolder.itemView.setOnLongClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(jogoViewHolder.itemView.getContext());
            builder.setTitle("Comprar jogo");
            builder.setMessage("Deseja comprar \"" + jogo.getNome() + "\" por " +
                    formatador.format(jogo.getPrice()) + "?");

            builder.setPositiveButton("Comprar", (dialog, which) -> {
                Toast.makeText(jogoViewHolder.itemView.getContext(),
                        "Compra realizada com sucesso!",
                        Toast.LENGTH_SHORT).show();
            });

            builder.setNegativeButton("Cancelar", null);
            builder.show();

            return true; // Indica que o clique longo foi tratado
        });
    }

    /**
     * Retorna a quantidade total de itens que o RecyclerView deve exibir.
     */
    @Override
    public int getItemCount() {
        return itens.size(); // Tamanho da lista de jogos
    }
}
