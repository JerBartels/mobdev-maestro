package com.example.android.maestro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        TextView nowPlaying = (TextView) findViewById(R.id.textviewArtistPlaying);
        nowPlaying.setText(getIntent().getStringExtra("EXTRA_MESSAGE"));

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null) {
            String getArtist = (String) bundle.get("artist");
            nowPlaying.setText(getArtist);
        }

    }
}
