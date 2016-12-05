package com.example.android.maestro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        //get textview of artistlist
        TextView textviewPlaylistList = (TextView) findViewById(R.id.textviewPlayListsList);

        //attach click listener to @PlayingActivity
        textviewPlaylistList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(PlaylistsActivity.this, PlayingActivity.class);
                String artist = "your playlist";
                playingIntent.putExtra("artist", artist);
                startActivity(playingIntent);
            }
        });
    }
}
