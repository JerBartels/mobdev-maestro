package com.example.android.maestro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        //get textview of artistlist
        TextView textviewArtistList = (TextView) findViewById(R.id.textviewArtistList);

        //attach click listener to @PlayingActivity
        textviewArtistList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(ArtistsActivity.this, PlayingActivity.class);
                String artist = "your artist";
                playingIntent.putExtra("artist", artist);
                startActivity(playingIntent);
            }
        });
    }
}
