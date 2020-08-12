package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag14 extends AppCompatActivity {
    Button btnProximoPergunta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag14);

        getSupportActionBar().hide();

        btnProximoPergunta = findViewById(R.id.btnProximoPergunta);

        btnProximoPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag15();
            }
        });
    }
    private void goPag15(){
        Intent janela = new Intent(this, ActivityPag15.class);
        startActivity(janela);
        finish();
    }
}