package com.example.amandacarvalho.starwars;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.amandacarvalho.starwars.model.Personagens;
import com.example.amandacarvalho.starwars.model.SWModelList;
import com.example.amandacarvalho.starwars.starwars.Lista_Personagens;
import com.example.amandacarvalho.starwars.view.SWapi;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {



    ImageView personagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView personagens = (ImageView) findViewById(R.id.personagens_id);
        personagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Lista_Personagens.class);
        startActivity(intent);

            }
        });

    }

    @Override
    public void onCreate() {
        super.onCreate();
        //Init star wars api
        SWapi.init();
    }

}

