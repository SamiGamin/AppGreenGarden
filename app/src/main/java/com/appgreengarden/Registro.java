package com.appgreengarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {
    Button iniciosesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        iniciosesion = findViewById(R.id.btn_registro);
        iniciosesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciosecion =new Intent(Registro.this, Login.class);
                startActivity(iniciosecion);
                finish();
            }
        });
    }
}