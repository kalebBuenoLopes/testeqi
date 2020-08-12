package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag2 extends AppCompatActivity {
    Button btnProximo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag2);

        getSupportActionBar().hide();

        btnProximo2 = findViewById(R.id.btnProximo2);

        btnProximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pagina3();
            }
        });

    }

    private void pagina3(){
        Intent janela = new Intent(this, ActivityPag3.class);
        startActivity(janela);
        finish();
    }
}