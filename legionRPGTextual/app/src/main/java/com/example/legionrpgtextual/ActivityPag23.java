package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag23 extends AppCompatActivity {
    Button btnNextExitVilag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag23);

        getSupportActionBar().hide();

        btnNextExitVilag = findViewById(R.id.btnNextExitVilag);

        btnNextExitVilag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toExitVila();
            }
        });
    }
    private void toExitVila(){
        Intent janela = new Intent(this, ActivityPag24.class);
        startActivity(janela);
        finish();
    }
}