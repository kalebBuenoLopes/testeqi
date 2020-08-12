package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag11 extends AppCompatActivity {
    Button btnPergunta1,btnPergunta2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag11);

        getSupportActionBar().hide();

        btnPergunta2 = findViewById(R.id.btnPergunta2);

        btnPergunta1 = findViewById(R.id.btnPergunta1);

        btnPergunta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag12();
            }
        });

        btnPergunta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag13();
            }
        });
    }
    private void goPag12(){
        Intent janela = new Intent(this, ActivityPag12.class);
        startActivity(janela);
        finish();
    }
    private void goPag13(){
        Intent janela = new Intent(this, ActivityPag13.class);
        startActivity(janela);
        finish();
    }
}