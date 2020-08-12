package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag3 extends AppCompatActivity {
    Button btnEntrarVilarejo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag3);

        getSupportActionBar().hide();

        btnEntrarVilarejo = findViewById(R.id.btnEntrarVilarejo);

        btnEntrarVilarejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pagina4();
            }
        });
    }
    private void pagina4(){
        Intent janela = new Intent(this, ActivityPag4.class);
        startActivity(janela);
        finish();
    }
}