package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag12 extends AppCompatActivity {
    Button btnProximoComerRapido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag12);

        getSupportActionBar().hide();

        btnProximoComerRapido = findViewById(R.id.btnProximoComerRapido);

        btnProximoComerRapido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag14();
            }
        });
    }
    private void goPag14(){
        Intent janela = new Intent(this, ActivityPag14.class);
        startActivity(janela);
        finish();
    }
}