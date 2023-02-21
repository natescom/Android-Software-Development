package com.nathan.popupwindow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_pop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_pop = findViewById(R.id.btn_pop);
        btn_pop.setOnClickListener( v -> {
            Intent intensao = new Intent(getApplicationContext(), PopActivity.class);
            startActivity(intensao);
        });
    }
}