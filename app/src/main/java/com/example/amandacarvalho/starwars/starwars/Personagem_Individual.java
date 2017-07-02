package com.example.amandacarvalho.starwars.starwars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.amandacarvalho.starwars.R;

public class Personagem_Individual extends AppCompatActivity {

    Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem__individual);

        Button btn_voltar = (Button) findViewById(R.id.btn_voltar_id);

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Personagem_Individual.this, Lista_Personagens.class);
                startActivity(intent);
            }
        });
    }
}
