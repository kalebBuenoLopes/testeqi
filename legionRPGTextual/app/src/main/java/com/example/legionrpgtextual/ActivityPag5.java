package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag5 extends AppCompatActivity {
    Button btnEntrarTaverna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag5);

        getSupportActionBar().hide();

        btnEntrarTaverna = findViewById(R.id.btnEntrarTaverna);

        btnEntrarTaverna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag6();
            }
        });
    }
    private void goPag6(){
        Intent janela = new Intent(this, ActivityPag6.class);
        startActivity(janela);
        finish();
    }
}