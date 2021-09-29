package com.oscarcanteros.evaluationu01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);

    }

    public void mensaje(View view){
        String nom = nombre.getText().toString();

        Toast.makeText(this, nom + " ,Pedido confirmado!", Toast.LENGTH_SHORT).show();
    }
}