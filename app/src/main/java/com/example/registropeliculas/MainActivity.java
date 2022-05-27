package com.example.registropeliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarSesion(View view){
        setContentView(R.layout.principal);
    }
    public void verAggRegistro(View view){
        setContentView(R.layout.aggregistro);
    }
    public void verAggPelicula(View view){
        setContentView(R.layout.aggpelicula);
    }

    public void volverPrincipal(View view){
        setContentView(R.layout.principal);
    }

    public void salir(View view){
        finish();
    }



}