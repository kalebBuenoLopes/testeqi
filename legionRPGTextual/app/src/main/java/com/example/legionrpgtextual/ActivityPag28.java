package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag28 extends AppCompatActivity {
    Button btnDeixarPLaSim,btnFinalzinho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag28);

        getSupportActionBar().hide();

        btnFinalzinho = findViewById(R.id.btnFinalzinho);

        btnDeixarPLaSim = findViewById(R.id.btnDeixarPLaSim);

        btnDeixarPLaSim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toEnd();
            }
        });
        btnFinalzinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMocas();
            }
        });
    }
    private void toEnd(){
        Intent janela = new Intent(this, ActivityPag29.class);
        startActivity(janela);
        finish();
    }
    private void toMocas(){
        Intent janela = new Intent(this, ActivityPag29.class);
        startActivity(janela);
        finish();
    }
}