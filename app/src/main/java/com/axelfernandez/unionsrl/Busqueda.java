package com.axelfernandez.unionsrl;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.galaxyofandroid.awesometablayout.AwesomeTabBar;

public class Busqueda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
        final String recorrido = getIntent().getExtras().getString("recorrido");
        final String partida = getIntent().getExtras().getString("partida");
        final String destino = getIntent().getExtras().getString("destino");
        getSupportActionBar().setTitle(partida + " - "+destino+ " Recorrido: "+recorrido );
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        AwesomeTabBar tabBar=(AwesomeTabBar)findViewById(R.id.tabBar);
        ViewPager pager=(ViewPager)findViewById(R.id.pager);
        pager.setAdapter(new com.axelfernandez.unionsrl.PagerAdapter(getSupportFragmentManager()));
        tabBar.setupWithViewPager(pager);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}
