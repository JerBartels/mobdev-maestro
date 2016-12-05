package com.example.android.maestro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //get textview of albumlist
        TextView textviewAlbumList = (TextView) findViewById(R.id.textviewAlbumList);

        //attach click listener to @PlayingActivity
        textviewAlbumList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(AlbumsActivity.this, PlayingActivity.class);
                String artist = "your album";
                playingIntent.putExtra("artist", artist);
                startActivity(playingIntent);
            }
        });
    }
}
