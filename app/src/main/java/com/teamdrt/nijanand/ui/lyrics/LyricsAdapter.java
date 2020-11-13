package com.teamdrt.nijanand.ui.lyrics;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.teamdrt.nijanand.FullLyricsActivity;
import com.teamdrt.nijanand.R;
import com.teamdrt.nijanand.database.bhajan;

import java.util.ArrayList;

public class LyricsAdapter extends RecyclerView.Adapter<LyricsViewHolder> {

    Context context;
    private ArrayList<bhajan> bhajanlist;
    public LyricsAdapter(ArrayList<bhajan> bhajanlist) {
        this.bhajanlist=bhajanlist;
    }

    @NonNull
    @Override
    public LyricsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        return new LyricsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.lyrics_single_layout,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull LyricsViewHolder holder, int position) {
        holder.bhajanname.setText(bhajanlist.get(position).getName());
        holder.itemView.setOnClickListener(v -> {
            context.startActivity(new Intent(context, FullLyricsActivity.class).putExtra("lyrics",bhajanlist.get(position).getLyrics()));
        });
    }

    @Override
    public int getItemCount() {
        return bhajanlist.size();
    }
}
