package com.example.adrianmontes.aplicacionallconocimientos;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class actividadLogueado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_logueado);
    }



Toolbar myToolbar=(Toolbar)findViewById(R.id.toolbar1);

    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        //ahora le pasamos el toolbar
        setSupportActionBar(myToolbar);
        super.setSupportActionBar(toolbar);
    }





}
