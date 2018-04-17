package com.example.victorruelas.practica005;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Practica005 extends AppCompatActivity {

        private TextView txt;
        private Spinner mySpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica005);

        //Componentes dentro de la vista

        txt = (TextView) findViewById(R.id.txt);
        mySpinner = (Spinner) findViewById(R.id.mySpinner);

        //OPCIONES DEL SPINNER

        String opciones[]={"Negritas", "Cursivas", "Ambos"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        mySpinner.setAdapter(adapter);

        //EVENTO PARA EL SPINNER

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                // EVENTO CUANDO SE SELECCIONA UN ITEM DEL SPINNER

                String opcion=mySpinner.getSelectedItem().toString();
                    if (opcion.equals("Negritas"))txt.setTypeface(null, Typeface.BOLD);
                    if (opcion.equals("Cursivas"))txt.setTypeface(null, Typeface.ITALIC);
                    if (opcion.equals("Ambos"))txt.setTypeface(null, Typeface.BOLD_ITALIC);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
