package com.nizardan.dashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cucimtr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealermtr);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("Cuci Motor");
    }
}
