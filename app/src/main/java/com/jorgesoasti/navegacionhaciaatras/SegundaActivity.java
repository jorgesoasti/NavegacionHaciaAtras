package com.jorgesoasti.navegacionhaciaatras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Habilitamos el botón de Atras
    }
}
