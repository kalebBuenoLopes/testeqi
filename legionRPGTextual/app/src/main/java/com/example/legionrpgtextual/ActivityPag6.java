package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag6 extends AppCompatActivity {
    Button btnTavernaProximo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag6);

        getSupportActionBar().hide();

        btnTavernaProximo = findViewById(R.id.btnTavernaProximo);

        btnTavernaProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag7();
            }
        });
    }
    private void goPag7(){
        Intent janela = new Intent(this, ActivityPag7.class);
        startActivity(janela);
        finish();
    }
}