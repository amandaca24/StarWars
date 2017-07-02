package com.example.amandacarvalho.starwars.control;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.amandacarvalho.starwars.R;
import com.example.amandacarvalho.starwars.model.Personagens;

import java.util.List;

/**
 * Created by Home-CA on 01/07/2017.
 */

public class SWControl extends ArrayAdapter<Personagens>{
    private final Context context;
    private final List<Personagens> elementos;

    public SWControl(Context context, List<Personagens> elementos) {
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linha, parent, false);

        TextView nome = (TextView) rowView.findViewById(R.id.nome_id);
        TextView ano_nascimento = (TextView) rowView.findViewById(R.id.ano_nascimento_id);
        TextView planeta = (TextView) rowView.findViewById(R.id.planeta_id);
        TextView cabelo = (TextView) rowView.findViewById(R.id.cabelo_id);
        TextView altura = (TextView) rowView.findViewById(R.id.altura_id);
        TextView filmes = (TextView) rowView.findViewById(R.id.filmes_id);

        nome.setText(elementos.get(position).getName());
        ano_nascimento.setText(elementos.get(position).getBirthYear());
        planeta.setText(elementos.get(position).getHomeWorldUrl());
        cabelo.setText(elementos.get(position).getHairColor());
        altura.setText(elementos.get(position).getHeight());
        filmes.setText(elementos.get(position).getFilmsUrls());

        return rowView;
    }




}
