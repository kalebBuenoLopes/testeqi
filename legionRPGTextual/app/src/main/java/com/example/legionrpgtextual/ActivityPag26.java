package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag26 extends AppCompatActivity {
    Button btnNextOlharUnico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag26);

        getSupportActionBar().hide();

        btnNextOlharUnico = findViewById(R.id.btnNextOlharUnico);

        btnNextOlharUnico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toQuaseLago();
            }
        });
    }
    private void toQuaseLago(){
        Intent janela = new Intent(this, ActivityPag27.class);
        startActivity(janela);
        finish();
    }

}