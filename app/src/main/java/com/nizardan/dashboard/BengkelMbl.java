package com.nizardan.dashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BengkelMbl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengkel_mbl);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("Bengkel Mobil");
    }
}
