package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag13 extends AppCompatActivity {
    Button btnDefeat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag13);

        getSupportActionBar().hide();

        btnDefeat = findViewById(R.id.btnDefeat);

        btnDefeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youDefeat();
            }
        });
    }
    private void youDefeat(){
        Intent janela = new Intent(this, ActivityPag11.class);
        startActivity(janela);
        finish();
    }
}