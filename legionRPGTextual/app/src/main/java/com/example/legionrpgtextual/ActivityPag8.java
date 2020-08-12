package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag8 extends AppCompatActivity {
    Button btnComida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag8);

        getSupportActionBar().hide();

        btnComida = findViewById(R.id.btnComida);

        btnComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPag9();
            }
        });
    }
    private void goPag9(){
        Intent janela = new Intent(this, ActivityPag9.class);
        startActivity(janela);
        finish();
    }
}