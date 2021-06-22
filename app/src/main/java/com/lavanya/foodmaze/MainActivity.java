package com.lavanya.foodmaze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    CardView zomato, swiggy, foodcloud, foodpanda, domainos, freshmenu, behrouz, kfc, mcdonalds;
    CardView mozopizza, ovenstory, ubereats;
    String pwaUrls [] ={"https://www.zomato.com","https://www.swiggy.com/","https://www.foodpanda.com/",
    "https://www.foodcloud.in/","https://www.dominos.co.in/","https://www.freshmenu.com/",
    "https://www.behrouzbiryani.com/","https://www.firangibake.com/","https://www.mcdonaldsindia.com/",
    "https://mojopizza.in/","https://www.ovenstory.in/","https://www.ubereats.com/"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zomato = (CardView)findViewById(R.id.zomato);
        swiggy =(CardView)findViewById(R.id.swiggy);
        foodcloud = (CardView)findViewById(R.id.foodcloud);
        foodpanda = (CardView)findViewById(R.id.foodpanda);
        domainos=(CardView)findViewById(R.id.dominos);
        freshmenu=(CardView)findViewById(R.id.freshmenu);
        behrouz=(CardView)findViewById(R.id.behrouz);
        kfc=(CardView)findViewById(R.id.kfc);
        mcdonalds=(CardView)findViewById(R.id.mcdonalds);
        mozopizza=(CardView)findViewById(R.id.mojo);
        ovenstory=(CardView)findViewById(R.id.ovenstory);
        ubereats=(CardView)findViewById(R.id.ubereats);

        zomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[0]);
                startActivity(intent);
            }
        });

        swiggy.setOnClickListener(new View.OnClickListener() {
            @Override

                public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[1]);
                    startActivity(intent);
                }

        });
        foodcloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[3]);
                startActivity(intent);
            }
        });
        foodpanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[2]);
                startActivity(intent);
            }
        });
        behrouz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[6]);
                startActivity(intent);
            }
        });
        freshmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[5]);
                startActivity(intent);
            }
        });
        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[7]);
                startActivity(intent);
            }
        });
        mcdonalds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[8]);
                startActivity(intent);
            }
        });
        mozopizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[9]);
                startActivity(intent);
            }
        });
        ovenstory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[10]);
                startActivity(intent);
            }
        });
        ubereats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[11]);
                startActivity(intent);
            }
        });
        domainos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pwaurl",pwaUrls[4]);
                startActivity(intent);
            }
        });
    }

}
