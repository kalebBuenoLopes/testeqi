package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag4 extends AppCompatActivity {
    Button btnContinuarProcurando;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag4);

        getSupportActionBar().hide();

        btnContinuarProcurando = findViewById(R.id.btnContinuarProcurando);

        btnContinuarProcurando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag5();
            }
        });
    }
    private void goPag5(){
        Intent janela = new Intent(this, ActivityPag5.class);
        startActivity(janela);
        finish();
    }
}