package com.nathan.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view){
        Intent intencao = new Intent(this.getApplicationContext(), ResultadoActivity.class);
        Random random = new Random();
        intencao.putExtra("Resultado",random.nextInt(2));
        startActivity(intencao);
    }
}