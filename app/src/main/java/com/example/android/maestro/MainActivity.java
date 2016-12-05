package com.example.android.maestro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get albums TextView
        TextView albumsView = (TextView) findViewById(R.id.textviewAlbums);

        //attach click listener to @AlbumsActivity
        albumsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AlbumsActivity.class));
            }
        });

        //get playlist TextView
        TextView playlistView = (TextView) findViewById(R.id.textviewPlaylists);

        //attach click listener to @PlaylistActivity
        playlistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,PlaylistsActivity.class));
            }
        });

        //get numbers TextView
        TextView numbersView = (TextView) findViewById(R.id.textviewNumbers);

        //attach click listener to @NumbersActivity
        numbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NumbersActivity.class));
            }
        });

        //get artists TextView
        TextView artistsView = (TextView) findViewById(R.id.textviewArtists);

        //attach click listener to @ArtistsActivity
        artistsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ArtistsActivity.class));
            }
        });

        //get ellie ImageView
        ImageView ellieView = (ImageView) findViewById(R.id.imageviewEllie);

        //attach click listener to @MusicActivity
        ellieView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                String artist = "Ellie Goulding";
                playingIntent.putExtra("artist", artist);
                startActivity(playingIntent);
            }
        });

        //get jayz ImageView
        ImageView jayZView = (ImageView) findViewById(R.id.imageviewJayZ);

        //attach click listener to @MusicActivity
        jayZView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                String artist = "Jay Z";
                playingIntent.putExtra("artist", artist);
                startActivity(playingIntent);
            }
        });

        //get coldplay ImageView
        ImageView coldplayView = (ImageView) findViewById(R.id.imageviewColdplay);

        //attach click listener to @MusicActivity
        coldplayView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                String artist = "Coldplay";
                playingIntent.putExtra("artist", artist);
                startActivity(playingIntent);
            }
        });

        //get ellie ImageView
        ImageView rihannaView = (ImageView) findViewById(R.id.imageviewRihanna);

        //attach click listener to @MusicActivity
        rihannaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                String artist = "Rihanna";
                playingIntent.putExtra("artist", artist);
                startActivity(playingIntent);
            }
        });
    }
}

