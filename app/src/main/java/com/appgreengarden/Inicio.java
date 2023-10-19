package com.appgreengarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {
    TextView mune, plantas, comunida, reportar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        mune = findViewById(R.id.menu);
        plantas = findViewById(R.id.plantas);
        comunida = findViewById(R.id.btn_comunidad);
        reportar = findViewById(R.id.btn_reportar);

        mune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(Inicio.this, Login.class);
                startActivity(login);
                finish();

            }
        });
        plantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent plantas = new Intent(Inicio.this, Consenjos.class);
                startActivity(plantas);
                finish();

            }
        });
        comunida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comunida = new Intent(Inicio.this, Comunidad_eventos.class);
                startActivity(comunida);
                finish();

            }
        });
        reportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reportar = new Intent(Inicio.this, Estadisticas.class);
                startActivity(reportar);
                finish();

            }
        });

    }
}