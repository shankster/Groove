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








    }
}


