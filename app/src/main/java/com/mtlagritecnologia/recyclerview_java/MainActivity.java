package com.mtlagritecnologia.recyclerview_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

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
        adapter = new JogoAdapter(MainActivity.this, itens, new OnJogoClickListener() {
            @Override
            public void onJogoClick(Jogo jogo) {
                Toast.makeText(getApplicationContext(),
                        "Clicou em: " + jogo.getNome(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }

    public void criarLista() {
        // Inicializa a lista
        itens = new ArrayList<Jogo>();

        // Adiciona vários jogos à lista
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

        // Você pode adicionar mais conforme desejar!
    }

}