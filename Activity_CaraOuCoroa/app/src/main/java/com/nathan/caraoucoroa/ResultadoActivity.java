package com.nathan.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        moeda = findViewById(R.id.img_moeda);
        Bundle bundle = getIntent().getExtras();
        if (bundle.getInt("Resultado")==1){
            moeda.setImageResource(R.drawable.moeda_cara);
        }else{
            moeda.setImageResource(R.drawable.moeda_coroa);
        }
    }

    public void encerrar(View view){
        finish();
    }
}