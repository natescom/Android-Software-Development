package com.nathan.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listCoisas;
    private String[] locais = {"Vitória da Conquista","Salvador","Feira de Santana",
                                "Belo Campo","Barra do Choça", "Valença","Chapada",
                                "Brasil","Argentina","Uruguai","Alemanha","Filipe Neto",
                                "Jaque Patombá", "Carol Conce", "Lumena", "Juliete",
                                "Pyong Lee", "Manu Gavassi", "Prior", "Bruna Marquezzine",
                                "Fadas Sensatas", "Tropa do Prior"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCoisas = findViewById(R.id.listCoisas);

        // -------------- Criar adaptador para lista -------------- //
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                locais

        ); // Ao instanciar eu devo passar o contexto e logo em seguida um layout (com o layout eu posso definir como vai ser a visualização
        // O terceiro parametro é o ID da view que vc quer usar, para saber basta clicar no layout segurando Ctrl e vc vai poder descobrir o ID

        // -------------- Coloca o adaptador -------------- //
        listCoisas.setAdapter(adaptador);
        // -------------- Evento de Clique -------------- //
        listCoisas.setOnItemClickListener((parent, view, position, id) -> {
            String valorSelecionado = listCoisas.getItemAtPosition(position).toString();
            Toast.makeText(getApplicationContext(),valorSelecionado,Toast.LENGTH_SHORT).show();
        });
    }
}