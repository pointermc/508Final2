package com.example.matthew.a508pokemondatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class QueryPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_page);

        Spinner querySpinner = (Spinner) findViewById(R.id.querySpinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Query));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        querySpinner.setAdapter(myAdapter);

        Spinner type1Spinner = (Spinner) findViewById(R.id.type1spinner);

        ArrayAdapter<String> type1Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.PokemonTypes));
        type1Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        type1Spinner.setAdapter(type1Adapter);

        Spinner type2Spinner = (Spinner) findViewById(R.id.type2spinner);

        ArrayAdapter<String> type2Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.PokemonTypes2));
        type2Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        type2Spinner.setAdapter(type2Adapter);


        Spinner statSpinner = (Spinner) findViewById(R.id.statSpinner);

        ArrayAdapter<String> statAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.BaseStats));
        statAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        statSpinner.setAdapter(statAdapter);
    }

}
