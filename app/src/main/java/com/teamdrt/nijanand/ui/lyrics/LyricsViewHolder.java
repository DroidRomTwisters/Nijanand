package com.teamdrt.nijanand.ui.lyrics;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.teamdrt.nijanand.R;

public class LyricsViewHolder extends RecyclerView.ViewHolder {

    public TextView bhajanname;
    public LyricsViewHolder(@NonNull View itemView) {
        super(itemView);
        bhajanname=itemView.findViewById(R.id.lyrics_title);
    }


}
