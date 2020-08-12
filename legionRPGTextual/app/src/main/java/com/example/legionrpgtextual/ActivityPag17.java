package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag17 extends AppCompatActivity {
    Button btnPuxarPedra, btnAceitarFim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag17);

        getSupportActionBar().hide();

        btnPuxarPedra = findViewById(R.id.btnPuxarPedra);

        btnAceitarFim = findViewById(R.id.btnAceitarFim);

        btnPuxarPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag19();
            }
        });
        btnAceitarFim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag18();
            }
        });

        btnPuxarPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag19();
            }
        });

        btnAceitarFim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag18();
            }
        });
    }
    private void goPag18(){
        Intent janela = new Intent(this, ActivityPag18.class);
        startActivity(janela);
        finish();
    }
    private void goPag19(){
        Intent janela = new Intent(this, ActivityPag19.class);
        startActivity(janela);
        finish();
    }
}