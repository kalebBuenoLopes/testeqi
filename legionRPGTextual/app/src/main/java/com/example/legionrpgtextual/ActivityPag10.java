package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag10 extends AppCompatActivity {
    Button btnProximoComida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag10);

        getSupportActionBar().hide();

        btnProximoComida = findViewById(R.id.btnProximoComida);

        btnProximoComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag11();
            }
        });
    }
    private void goPag11(){
        Intent janela = new Intent(this, ActivityPag11.class);
        startActivity(janela);
        finish();
    }
}