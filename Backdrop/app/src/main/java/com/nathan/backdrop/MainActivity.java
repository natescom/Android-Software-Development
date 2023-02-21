package com.nathan.backdrop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.roacult.backdrop.BackdropLayout;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private BackdropLayout backdrop;
    private View back_layout, front_layout;

    private RadioButton rdi_apple, rdi_oragen, rdi_watermelon;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backdrop = findViewById(R.id.backdropLayoutContainer);
        back_layout = backdrop.getChildAt(0);
        front_layout = backdrop.getChildAt(1);

        rdi_apple = findViewById(R.id.rdi_apple);
        rdi_oragen = findViewById(R.id.rdi_orange);
        rdi_watermelon = findViewById(R.id.rdi_watermelon);

        text = findViewById(R.id.semvalorzim);

        rdi_apple.setOnCheckedChangeListener(this);
        rdi_oragen.setOnCheckedChangeListener(this);
        rdi_watermelon.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            text.setText(buttonView.getText());
        }
    }
}