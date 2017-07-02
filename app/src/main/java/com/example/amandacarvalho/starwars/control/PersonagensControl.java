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
 * Created by Home-CA on 02/07/2017.
 */

public class PersonagensControl extends ArrayAdapter<Personagens>{

    private final Context context;
    private final List<Personagens> pessoas;


    public PersonagensControl (Context context, List<Personagens> pessoas){
        super(context, R.layout.content_main, pessoas);
        this.context = context;
        this.pessoas = pessoas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.content_main, parent, false);

        TextView nome = (TextView) rowView.findViewById(R.id.lista_nome_id);

        nome.setText(pessoas.get(position).getName());

        return rowView;
    }

}

