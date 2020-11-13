package com.teamdrt.nijanand;

import android.app.Application;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FullLyricsActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_lyrics);
        TextView full_lyrics=findViewById(R.id.full_lyrics);
        full_lyrics.setText(getIntent().getStringExtra("lyrics"));
    }
}
