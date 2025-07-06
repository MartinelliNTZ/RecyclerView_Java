package com.mtlagritecnologia.recyclerview_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private JogoAdapter adapter;
    private ArrayList<Jogo> itens;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recycler);
        criarLista();
        adapter = new JogoAdapter(MainActivity.this,itens);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }

    public void criarLista() {
        // Inicializa a lista
        itens = new ArrayList<Jogo>();

        // Adiciona vários jogos à lista
        itens.add(new Jogo("God of War", "PlayStation"));
        itens.add(new Jogo("Halo Infinite", "Xbox"));
        itens.add(new Jogo("The Legend of Zelda: Breath of the Wild", "Nintendo Switch"));
        itens.add(new Jogo("Counter-Strike: Global Offensive", "PC"));
        itens.add(new Jogo("Minecraft", "Multiplataforma"));
        itens.add(new Jogo("Red Dead Redemption 2", "PlayStation"));
        itens.add(new Jogo("Forza Horizon 5", "Xbox"));
        itens.add(new Jogo("Super Mario Odyssey", "Nintendo Switch"));
        itens.add(new Jogo("The Witcher 3: Wild Hunt", "PC"));
        itens.add(new Jogo("Elden Ring", "PlayStation"));
        itens.add(new Jogo("Gears 5", "Xbox"));
        itens.add(new Jogo("Animal Crossing: New Horizons", "Nintendo Switch"));
        itens.add(new Jogo("Valorant", "PC"));
        itens.add(new Jogo("Final Fantasy VII Remake", "PlayStation"));
        itens.add(new Jogo("Sea of Thieves", "Xbox"));
        itens.add(new Jogo("Splatoon 3", "Nintendo Switch"));
        itens.add(new Jogo("League of Legends", "PC"));
        itens.add(new Jogo("Horizon Forbidden West", "PlayStation"));
        itens.add(new Jogo("Microsoft Flight Simulator", "Xbox"));
        itens.add(new Jogo("Metroid Dread", "Nintendo Switch"));
        itens.add(new Jogo("Fortnite", "Multiplataforma"));
        itens.add(new Jogo("Call of Duty: Warzone", "Multiplataforma"));
        itens.add(new Jogo("Resident Evil Village", "PlayStation"));
        itens.add(new Jogo("FIFA 23", "Multiplataforma"));
        itens.add(new Jogo("Cyberpunk 2077", "PC"));

        // Você pode adicionar mais conforme desejar!
    }

}