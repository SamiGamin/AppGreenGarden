package com.appgreengarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button iniciosecion, registrarse, olvidocontrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        iniciosecion = findViewById(R.id.btn_inicio_sesion);
        registrarse = findViewById(R.id.btn_registro);
        olvidocontrasena = findViewById(R.id.btn_recuperar_cotra);

        iniciosecion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inicio_sesion = new Intent(Login.this , Inicio.class);
                startActivity(inicio_sesion);
                finish();

            }
        });
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registro = new Intent(Login.this , Registro.class);
                startActivity(registro);
                finish();

            }
        });
        olvidocontrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent olvidocontra = new Intent(Login.this , Recuperar_Contraseña.class);
                startActivity(olvidocontra);
                finish();

            }
        });

    }
}