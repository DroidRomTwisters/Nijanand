package com.teamdrt.nijanand;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.teamdrt.nijanand.ui.lyrics.LyricsFragment;

public class LyricsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyrics_activity);

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LyricsFragment.newInstance())
                    .commitNow();

    }
}