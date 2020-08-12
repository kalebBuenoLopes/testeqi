package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag16 extends AppCompatActivity {
    Button btnProximoReaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag16);

        getSupportActionBar().hide();

        btnProximoReaction = findViewById(R.id.btnProximoReaction2);

        btnProximoReaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag17();
            }
        });
    }
    private void goPag17(){
        Intent janela = new Intent(this, ActivityPag17.class);
        startActivity(janela);
        finish();
    }
}