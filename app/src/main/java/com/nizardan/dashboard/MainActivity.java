package com.nizardan.dashboard;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    ImageButton btnBengkelMtr, btnDealerMtr ,btnDealerMbl, btnBengkelMbl;
    String[] daftar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBengkelMtr = findViewById(R.id.btnBengkelMtr);
        btnBengkelMbl = findViewById(R.id.btnBengkelMbl);
        btnDealerMtr = findViewById(R.id.btnDealerMtr);
        btnDealerMbl = findViewById(R.id.btnDealerMbl);

        btnBengkelMtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BengkelMtr.class);
                startActivity(intent);
            }
        });

        btnBengkelMbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BengkelMbl.class);
                startActivity(intent);
            }
        });

        btnDealerMtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Cucimtr.class);
                startActivity(intent);
            }
        });

        btnDealerMbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Cucimbl.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.about:
                showDialogAbout();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    void showDialogAbout(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("Tentang Aplikasi");
        alertDialogBuilder
                .setMessage("Aplikasi ini dibuat untuk memenuhi tugas DTS Mobile Programing")
                .setCancelable(false)
                .setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }


}
