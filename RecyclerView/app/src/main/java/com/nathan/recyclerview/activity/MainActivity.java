package com.nathan.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.nathan.recyclerview.R;
import com.nathan.recyclerview.adapter.Adapter;
import com.nathan.recyclerview.model.Filme;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // CONFIGURAR ADAPTER
        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Lumena e a maquiagem","Horror","2021"));
        filmes.add(new Filme("Karol Conká eliminada","Sonho","2021"));
        filmes.add(new Filme("Milituda nogenta","Aventura","2019"));
        filmes.add(new Filme("Big Brother Brasil","Comedia","2002"));
        filmes.add(new Filme("Os filmes do Adam Sandler","Piada","2000"));
        filmes.add(new Filme("Todo mundo em panico","Humor e piadas","1999"));
        filmes.add(new Filme("Ai to cansado","Preguiça","5000"));
        filmes.add(new Filme("Shingeki no Kyogin","Melhor anime","TODOS"));
        filmes.add(new Filme("Minha pica","Porno","XXL"));
        filmes.add(new Filme("Lumena e a maquiagem","Horror","2021"));
        filmes.add(new Filme("Karol Conká eliminada","Sonho","2021"));
        filmes.add(new Filme("Milituda nogenta","Aventura","2019"));
        filmes.add(new Filme("Big Brother Brasil","Comedia","2002"));
        filmes.add(new Filme("Os filmes do Adam Sandler","Piada","2000"));
        filmes.add(new Filme("Todo mundo em panico","Humor e piadas","1999"));
        Adapter adapter = new Adapter(filmes);

        // CONFIGURAR RECYCLERVIEW
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
}