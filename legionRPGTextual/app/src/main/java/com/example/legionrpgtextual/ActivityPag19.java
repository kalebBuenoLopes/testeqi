package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag19 extends AppCompatActivity {
    Button btnProximoFuga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag19);

        getSupportActionBar().hide();

        btnProximoFuga = findViewById(R.id.btnProximoFuga);

        btnProximoFuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag20();
            }
        });
    }
    private void goPag20(){
        Intent janela = new Intent(this, ActivityPag20.class);
        startActivity(janela);
        finish();
    }

}