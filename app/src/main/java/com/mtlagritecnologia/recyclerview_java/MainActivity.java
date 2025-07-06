package com.mtlagritecnologia.recyclerview_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // RecyclerView que vai exibir a lista de jogos
    private RecyclerView recycler;

    // Adapter responsável por ligar a lista ao RecyclerView
    private JogoAdapter adapter;

    // Lista com os objetos do tipo Jogo (os dados)
    private ArrayList<Jogo> itens;

    /**
     * Método chamado automaticamente quando a Activity é criada.
     * Aqui configuramos o layout da tela, criamos a lista e ativamos o RecyclerView.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Define qual layout XML será usado (activity_main.xml)
        setContentView(R.layout.activity_main);

        // Conecta o RecyclerView com o ID definido no layout
        recycler = findViewById(R.id.recycler);

        // Cria a lista de jogos (com nome, plataforma e preço)
        criarLista();

        // Cria o Adapter, passando:
        // - contexto da tela
        // - lista de jogos
        // - o que fazer quando o item for clicado (exibe um Toast)
        adapter = new JogoAdapter(MainActivity.this, itens, new OnJogoClickListener() {
            @Override
            public void onJogoClick(Jogo jogo) {
                Toast.makeText(getApplicationContext(),
                        "Clicou em: " + jogo.getNome(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Define o layout vertical para a lista (um item por linha, de cima para baixo)
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                MainActivity.this, LinearLayoutManager.VERTICAL, false
        );

        // Aplica o layout e o adapter ao RecyclerView
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }

    /**
     * Método que cria e preenche a lista de jogos.
     * Aqui é onde você define os dados que serão exibidos.
     */
    public void criarLista() {
        // Inicializa a lista
        itens = new ArrayList<>();

        // Adiciona objetos do tipo Jogo à lista (nome, plataforma, preço)
        itens.add(new Jogo("God of War", "PlayStation", 199.90));
        itens.add(new Jogo("Halo Infinite", "Xbox", 179.99));
        itens.add(new Jogo("The Legend of Zelda: Breath of the Wild", "Nintendo Switch", 299.90));
        itens.add(new Jogo("Counter-Strike: Global Offensive", "PC", 0.00));
        itens.add(new Jogo("Minecraft", "Multiplataforma", 129.90));
        itens.add(new Jogo("Red Dead Redemption 2", "PlayStation", 249.90));
        itens.add(new Jogo("Forza Horizon 5", "Xbox", 229.99));
        itens.add(new Jogo("Super Mario Odyssey", "Nintendo Switch", 289.90));
        itens.add(new Jogo("The Witcher 3: Wild Hunt", "PC", 89.90));
        itens.add(new Jogo("Elden Ring", "PlayStation", 279.90));
        itens.add(new Jogo("Gears 5", "Xbox", 159.99));
        itens.add(new Jogo("Animal Crossing: New Horizons", "Nintendo Switch", 279.90));
        itens.add(new Jogo("Valorant", "PC", 3000.00));
        itens.add(new Jogo("Final Fantasy VII Remake", "PlayStation", 229.90));
        itens.add(new Jogo("Sea of Thieves", "Xbox", 149.99));
        itens.add(new Jogo("Splatoon 3", "Nintendo Switch", 299.90));
        itens.add(new Jogo("League of Legends", "PC", 0.00));
        itens.add(new Jogo("Horizon Forbidden West", "PlayStation", 279.90));
        itens.add(new Jogo("Microsoft Flight Simulator", "Xbox", 249.99));
        itens.add(new Jogo("Metroid Dread", "Nintendo Switch", 299.90));
        itens.add(new Jogo("Fortnite", "Multiplataforma", 0.00));
        itens.add(new Jogo("Call of Duty: Warzone", "Multiplataforma", 0.00));
        itens.add(new Jogo("Resident Evil Village", "PlayStation", 199.90));
        itens.add(new Jogo("FIFA 23", "Multiplataforma", 249.90));
        itens.add(new Jogo("Cyberpunk 2077", "PC", 149.90));

        // ✨ Você pode adicionar mais jogos aqui no futuro!
    }
}