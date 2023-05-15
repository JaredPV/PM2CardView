package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private CardView card11, card12, card13, card21, card22, card23, card31, card32, card33;
    private HorizontalScrollView horizontalScrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        card11 = findViewById(R.id.card11);
        card12 = findViewById(R.id.card12);
        card13 = findViewById(R.id.card13);
        card21 = findViewById(R.id.card21);
        card22 = findViewById(R.id.card22);
        card23 = findViewById(R.id.card23);
        card31 = findViewById(R.id.card31);
        card32 = findViewById(R.id.card32);
        card33 = findViewById(R.id.card33);

        horizontalScrollView = findViewById(R.id.horizontalScrollView);

        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackBar("NES");
            }
        });
        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackBar("Wii");
            }
        });
        card13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackBar("Switch");
            }
        });


        card21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackBar("Xbox");
            }
        });
        card22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackBar("Xbox 360");
            }
        });
        card23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackBar("Xbox Series X");
            }
        });

        card31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackBar("PS1");
            }
        });
        card31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackBar("PS2");
            }
        });
        card31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackBar("PS5");
            }
        });
    }

    public void snackBar(String console){
        Snackbar.make(horizontalScrollView, "Emulando "+console, Snackbar.LENGTH_SHORT).show();
    }
}