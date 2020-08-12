package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag29 extends AppCompatActivity {
    Button btnFinalzinho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag29);

        getSupportActionBar().hide();

        btnFinalzinho = findViewById(R.id.btnFinalzinho);

        btnFinalzinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gocontinued();
            }
        });
    }
    private void gocontinued(){
        Intent janela = new Intent(this, ActivityPag30.class);
        startActivity(janela);
        finish();
    }
}