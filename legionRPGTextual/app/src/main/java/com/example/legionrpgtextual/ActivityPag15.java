package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag15 extends AppCompatActivity {
    Button btnProximoReaction2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag15);

        getSupportActionBar().hide();

        btnProximoReaction2 = findViewById(R.id.btnProximoReaction2);

        btnProximoReaction2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag16();
            }
        });
    }
    private void goPag16(){
        Intent janela = new Intent(this, ActivityPag16.class);
        startActivity(janela);
        finish();
    }
}