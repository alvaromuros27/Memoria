package com.example.memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button en = findViewById(R.id.entrar);

        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                EditText editText = findViewById(R.id.editTextTextPersonName);
                String nombre = editText.getText().toString();
                intent.putExtra("variable", nombre);
                startActivity(intent);
            }
        });
    }
}