package com.example.hd.guia5_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by hd on 14/10/2017.
 */

public class EjercicioActivity extends AppCompatActivity  {

    private Button btnDer, btnCentro, btnIzq;
    private ImageView imgDer, imgCentro, imgIzq;
    Animation animBajarAparecer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        btnIzq =  (Button) findViewById(R.id.btnIzq);
        btnCentro =  (Button) findViewById(R.id.btnCentro);
        btnDer =  (Button) findViewById(R.id.btnDer);
        imgIzq = (ImageView) findViewById(R.id.imgIzq);
        imgCentro = (ImageView) findViewById(R.id.imgCentro);
        imgDer = (ImageView) findViewById(R.id.imgDer);

        animBajarAparecer = AnimationUtils.loadAnimation(this,R.anim.bajar_aparecer);

        btnIzq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgIzq.startAnimation(animBajarAparecer);
            }
        });

        btnCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCentro.startAnimation(animBajarAparecer);
            }
        });

        btnDer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgDer.startAnimation(animBajarAparecer);
            }
        });





    }
}



