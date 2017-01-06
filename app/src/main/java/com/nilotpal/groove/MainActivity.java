package com.nilotpal.groove;

import android.content.Intent;
import android.view.View;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view containing the Now playing category
        TextView now_playing = (TextView) findViewById(R.id.content1);

        // Set a click listener on that View
        now_playing.setOnClickListener(new View.OnClickListener() {
            //Overriding the onClick method defined in the View.class
            @Override
            public void onClick(View view) {
                //Create an explicit intent to open another window
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        //Find the view containing the Albums category
        TextView albums = (TextView) findViewById(R.id.content2);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            //Overriding the onClick method defined in the View.class
            @Override
            public void onClick(View view) {
                //Create an explicit intent to open another window
                Intent nowPlayingIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(nowPlayingIntent);
            }
        });

        //Find the view containing the Artists category
        TextView artists = (TextView) findViewById(R.id.content3);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            //Overriding the onClick method defined in the View.class
            @Override
            public void onClick(View view) {
                //Create an explicit intent to open another window
                Intent nowPlayingIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(nowPlayingIntent);
            }
        });

        //Find the view containing the Podcasts category
        TextView podcasts = (TextView) findViewById(R.id.content4);

        // Set a click listener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            //Overriding the onClick method defined in the View.class
            @Override
            public void onClick(View view) {
                //Create an explicit intent to open another window
                Intent nowPlayingIntent = new Intent(MainActivity.this, Podcasts.class);
                startActivity(nowPlayingIntent);
            }
        });

        //Find the view containing the Now playing category
        TextView store = (TextView) findViewById(R.id.content5);

        // Set a click listener on that View
        store.setOnClickListener(new View.OnClickListener() {
            //Overriding the onClick method defined in the View.class
            @Override
            public void onClick(View view) {
                //Create an explicit intent to open another window
                Intent nowPlayingIntent = new Intent(MainActivity.this, Store.class);
                startActivity(nowPlayingIntent);
            }
        });

    }
}


