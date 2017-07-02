package com.example.amandacarvalho.starwars.starwars;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.amandacarvalho.starwars.R;
import com.example.amandacarvalho.starwars.control.SWControl;
import com.example.amandacarvalho.starwars.model.Personagens;
import com.example.amandacarvalho.starwars.model.SWModelList;
import com.example.amandacarvalho.starwars.view.StarWars;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Personagem_Individual extends AppCompatActivity {

    Button btn_voltar;
    ProgressDialog dialog;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem__individual);

        final ListView lista_pessoa = (ListView) findViewById(R.id.lista_pessoas_id);

        StarWars lista_personagem =  StarWars.retrofit.create(StarWars.class);

        dialog = new ProgressDialog(Personagem_Individual.this);
        dialog.setMessage("Carregando...");
        dialog.setCancelable(false);
        dialog.show();

        final Call<SWModelList<Personagens>> call = StarWars.getPeople();
        call.enqueue(new Callback<SWModelList<Personagens>>() {
                         @Override
                         public void onResponse(Call<SWModelList<Personagens>> call, Response<SWModelList<Personagens>> response) {

            if (dialog.isShowing())
                dialog.dismiss();

        final SWModelList<Personagens> lista_personagens = response.body();
             if(lista_personagens != null){
                SWControl adapter = new SWControl(getBaseContext(), lista_personagens);
                lista_pessoa.setAdapter(adapter);

               }

    @Override
    public void onFailure(Call<SWModelList<Personagens>> call, Throwable t) {
             if (dialog.isShowing())
                 dialog.dismiss();
             Toast.makeText(getBaseContext(), "Problema de acesso", Toast.LENGTH_LONG).show();}
                 }

                     }
        );

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
