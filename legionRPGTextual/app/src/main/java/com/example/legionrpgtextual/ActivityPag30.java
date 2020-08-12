package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag30 extends AppCompatActivity {
    Button btnFinalMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag30);

        getSupportActionBar().hide();

        btnFinalMenu = findViewById(R.id.btnFinalMenu);

        btnFinalMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                denovomenu();
            }
        });
    }
    private void denovomenu(){
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
        finish();
    }
}