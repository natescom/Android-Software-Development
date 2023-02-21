package com.nathan.bancodedadossqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try{
            // CRIAR BANCO DE DADOS //
            SQLiteDatabase bancoDeDados = openOrCreateDatabase("app",MODE_PRIVATE,null);

            //  CRIAR TABELA //
            bancoDeDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas( nome VARCHAR, idade INT(3) )");
//            bancoDeDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas (id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3))");  // Tabela com chave primaria

            // INSERIR DADOS //
//            bancoDeDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES ('Nathan',20)");
//            bancoDeDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES ('Maria',30)");
//            bancoDeDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES ('Joana',18)");

            // RECUPERAR DADOS //
            String consulta = "SELECT nome, idade FROM pessoas";
            String consulta2 = "SELECT * FROM pessoas";

            String condicaoWhere = "WHERE nome = 'Maria'";
            String condicaoWhere2 = "WHERE nome = 'Maria' AND idade = '30'";
            String condicaoWhere3 = "WHERE idade >= '20' OR idade = 18";
            String condicaoWhere4 = "WHERE idade IN(15,25)"; // ENTRE OS DOIS VALORES
            String condicaoWhere5 = "WHERE nome LIKE '%ar%'";

            String condicaoOrder = "ORDER BY idade ASC"; // Ordenar pela idade do menor para o maior
            String condicaoOrder2 = "ORDER BY idade DESC";

            String condicaoLimit = "LIMIT 3"; // Limita o resultado da busca

            Cursor cursor = bancoDeDados.rawQuery(consulta+condicaoWhere+condicaoOrder+condicaoLimit,null);          // .rawQuery() recupera todas as linhas e colunas da tabela
            // EDITANDO DADOS //
//            bancoDeDados.execSQL("UPDATE pessoas SET idade = 19 WHERE nome = 'Mariana' ");

            // APAGAR TABELA //
            bancoDeDados.execSQL("DROP TABLE pessoas");

            // APAGANDO DADOS //
            bancoDeDados.execSQL(" DELETE FROM pessoas WHERE id = 2");

            // INDICES DA TABELA //
            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();
            while (cursor != null){
                Log.i("PESSOAS - nome:",cursor.getString(indiceNome));
                Log.i("PESSOAS - idade:",cursor.getString(indiceIdade));
                cursor.moveToNext();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}