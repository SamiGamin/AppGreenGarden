package com.appgreengarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Comunidad_eventos extends AppCompatActivity {

    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cominidad_eventos);
        login = findViewById(R.id.menu);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(Comunidad_eventos.this, Inicio.class);
                startActivity(login);
                finish();
            }
        });
    }
}