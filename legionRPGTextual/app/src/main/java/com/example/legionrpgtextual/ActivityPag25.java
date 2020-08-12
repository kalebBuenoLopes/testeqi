package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPag25 extends AppCompatActivity {
    Button btnNextOlhar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag25);

        getSupportActionBar().hide();

        btnNextOlhar = findViewById(R.id.btnNextOlhar);

        btnNextOlhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toOlharNext();
            }
        });
    }
    private void toOlharNext(){
        Intent janela = new Intent(this, ActivityPag26.class);
        startActivity(janela);
        finish();
    }
}