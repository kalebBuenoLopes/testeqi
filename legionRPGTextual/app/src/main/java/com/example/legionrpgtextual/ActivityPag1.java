package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag1 extends AppCompatActivity {
    Button btnProximo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag1);

        getSupportActionBar().hide();

        btnProximo1 = findViewById(R.id.btnProximo1);

        btnProximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pagina2();
            }
        });


    }

    private void pagina2(){
        Intent janela = new Intent(this, ActivityPag2.class);
        startActivity(janela);
        finish();
    }
}