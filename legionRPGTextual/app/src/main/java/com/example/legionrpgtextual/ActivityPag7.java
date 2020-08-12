package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag7 extends AppCompatActivity {
    Button btnPedido, btnInformacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag7);

        getSupportActionBar().hide();

        btnInformacao = findViewById(R.id.btnInformacao);

        btnPedido = findViewById(R.id.btnPedido);

        btnPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag9();
            }
        });

        btnInformacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag8();
            }
        });
    }
    private void goPag8(){
        Intent janela = new Intent(this, ActivityPag8.class);
        startActivity(janela);
        finish();
    }
    private void goPag9(){
        Intent janela = new Intent(this, ActivityPag9.class);
        startActivity(janela);
        finish();
    }
}