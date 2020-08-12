package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag9 extends AppCompatActivity {
    Button btnProximoPagar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag9);

        getSupportActionBar().hide();

        btnProximoPagar = findViewById(R.id.btnProximoPagar);

        btnProximoPagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag10();
            }
        });
    }
    private void goPag10(){
        Intent janela = new Intent(this, ActivityPag10.class);
        startActivity(janela);
        finish();
    }
}