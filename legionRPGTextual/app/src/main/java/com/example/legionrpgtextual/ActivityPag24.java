package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag24 extends AppCompatActivity {
    Button btnNextSide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag24);

        getSupportActionBar().hide();

        btnNextSide = findViewById(R.id.btnNextSide);

        btnNextSide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toForSide();
            }
        });

        btnNextSide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toForSide();
            }
        });
    }
    private void toForSide(){
        Intent janela = new Intent(this, ActivityPag25.class);
        startActivity(janela);
        finish();
    }
}

