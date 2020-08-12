package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag18 extends AppCompatActivity {
    Button btngameover;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag18);

        getSupportActionBar().hide();

        btngameover = findViewById(R.id.btngameover);

        btngameover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltar();
            }
        });
    }
    private void voltar(){
        Intent janela = new Intent(this, ActivityPag17.class);
        startActivity(janela);
        finish();
    }
}