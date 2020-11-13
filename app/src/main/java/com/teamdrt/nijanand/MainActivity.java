package com.teamdrt.nijanand;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button youtube_bt=findViewById(R.id.button);
        Button lyrics_bt=findViewById(R.id.button2);
        lyrics_bt.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,LyricsActivity.class));
        });
    }
}