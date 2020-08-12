package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag20 extends AppCompatActivity {
    Button btnTalk,btnIgnore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag20);

        getSupportActionBar().hide();

        btnIgnore = findViewById(R.id.btnAceitarFim);

        btnTalk = findViewById(R.id.btnPuxarPedra);

        btnIgnore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toIgnore();
            }
        });

        btnTalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toTalkLittle();
            }
        });
    }
    private void toIgnore(){
        Intent janela = new Intent(this, ActivityPag23.class);
        startActivity(janela);
        finish();
    }
    private void toTalkLittle(){
        Intent janela = new Intent(this, ActivityPag21.class);
        startActivity(janela);
        finish();
    }

}