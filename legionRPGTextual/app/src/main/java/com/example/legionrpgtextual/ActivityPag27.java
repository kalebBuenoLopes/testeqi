package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag27 extends AppCompatActivity {
    Button btnDesejo,btnIrEmbora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag27);

        getSupportActionBar().hide();

        btnDesejo = findViewById(R.id.btnDesejo);

        btnIrEmbora = findViewById(R.id.btnIrEmbora);

        btnIrEmbora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnDesejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toQuaseLagoAzul();
            }
        });
    }
    private void toQuaseLagoAzul(){
        Intent janela = new Intent(this, ActivityPag28.class);
        startActivity(janela);
        finish();
    }
    private void irEmbora(){
        Intent janela = new Intent(this, ActivityPag30.class);
        startActivity(janela);
        finish();
    }
}