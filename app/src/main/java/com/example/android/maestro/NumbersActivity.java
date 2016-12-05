package com.example.android.maestro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.maestro.R.id.textviewArtistList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //get textview of numberslist
        TextView textviewNumberList = (TextView) findViewById(R.id.textviewNumbersList);

        //attach click listener to @PlayingActivity
        textviewNumberList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(NumbersActivity.this, PlayingActivity.class);
                String artist = "your numbers";
                playingIntent.putExtra("artist", artist);
                startActivity(playingIntent);
            }
        });
    }
}
