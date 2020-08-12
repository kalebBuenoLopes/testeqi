package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag21 extends AppCompatActivity {
    Button btnNextlittle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag21);

        getSupportActionBar().hide();

        btnNextlittle = findViewById(R.id.btnNextlittle);

        btnNextlittle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toExit();
            }
        });
    }
    private void toExit(){
        Intent janela = new Intent(this, ActivityPag23.class);
        startActivity(janela);
        finish();
    }
}