package com.example.amandacarvalho.starwars.starwars;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.amandacarvalho.starwars.R;
import com.example.amandacarvalho.starwars.control.PersonagensControl;
import com.example.amandacarvalho.starwars.control.SWControl;
import com.example.amandacarvalho.starwars.model.Personagens;
import com.example.amandacarvalho.starwars.model.SWModelList;
import com.example.amandacarvalho.starwars.view.SWapi;
import com.example.amandacarvalho.starwars.view.StarWars;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;



public class Lista_Personagens extends AppCompatActivity {

    ProgressDialog dialog;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personagens);

        final ListView lista = (ListView) findViewById(R.id.lista_personagens_id);

        StarWars lista_personagens =  StarWars.retrofit.create(StarWars.class);

        dialog = new ProgressDialog(Lista_Personagens.this);
        dialog.setMessage("Carregando...");
        dialog.setCancelable(false);
        dialog.show();

        final Call<SWModelList<Personagens>> call = StarWars.getPersonagens();
        call.enqueue(new Callback<SWModelList<Personagens>>() {
            @Override
            public void onResponse(Call<SWModelList<Personagens>> call, Response<SWModelList<Personagens>> response) {
                if (dialog.isShowing())
                    dialog.dismiss();

        final SWModelList<Personagens> lista_personagens = response.body();
                if(lista_personagens != null){
                    PersonagensControl adapter = new PersonagensControl(getBaseContext(), lista_personagens);
                    lista.setAdapter(adapter);
                    lista.setOnClickListener(new AdapterView.OnItemClickListener());
                    Intent intent = new Intent(Lista_Personagens.this, Personagem_Individual.class);
                    intent.putExtra("ID", lista_personagens.get(i).getId());
                    startActivity(intent);


            }

    @Override
    public void onFailure(Call<SWModelList<Personagens>> call, Throwable t) {
                if (dialog.isShowing())
                    dialog.dismiss();
                Toast.makeText(getBaseContext(), "Problema de acesso", Toast.LENGTH_LONG).show();

            }
        }

        }
        );


        });



}
