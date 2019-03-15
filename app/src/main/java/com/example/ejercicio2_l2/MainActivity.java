package com.example.ejercicio2_l2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        tres = findViewById(R.id.tres);
        cuatro = findViewById(R.id.cuatro);
        cinco = findViewById(R.id.cinco);
        seis = findViewById(R.id.seis);
        siete = findViewById(R.id.siete);
        ocho = findViewById(R.id.ocho);
        nueve = findViewById(R.id.nueve);

        final ArrayList<Integer> imagenes = new ArrayList<Integer>();

        imagenes.add(R.drawable.uno);
        imagenes.add(R.drawable.dos);
        imagenes.add(R.drawable.tres);
        imagenes.add(R.drawable.cuatro);
        imagenes.add(R.drawable.cinco);
        imagenes.add(R.drawable.seis);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uno.setImageResource(imagenes.get(new Random().nextInt(6)));
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dos.setImageResource(imagenes.get(new Random().nextInt(6)));
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tres.setImageResource(imagenes.get(new Random().nextInt(6)));
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuatro.setImageResource(imagenes.get(new Random().nextInt(6)));
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cinco.setImageResource(imagenes.get(new Random().nextInt(6)));
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seis.setImageResource(imagenes.get(new Random().nextInt(6)));
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siete.setImageResource(imagenes.get(new Random().nextInt(6)));
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ocho.setImageResource(imagenes.get(new Random().nextInt(6)));
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nueve.setImageResource(imagenes.get(new Random().nextInt(6)));
            }
        });
    }
}
