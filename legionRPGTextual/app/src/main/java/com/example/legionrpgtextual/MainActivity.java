package com.example.legionrpgtextual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnIniciarHistoria;
    public static MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        btnIniciarHistoria = findViewById(R.id.btnIniciarHistoria);

        btnIniciarHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pagina1();
            }
        });

        mp = MediaPlayer.create(this, R.raw.fundo);
        mp.start();


    }

    private void pagina1(){
        Intent janela = new Intent(this, ActivityPag1.class);
        startActivity(janela);
    }
}