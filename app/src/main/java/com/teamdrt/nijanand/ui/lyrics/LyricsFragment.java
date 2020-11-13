package com.teamdrt.nijanand.ui.lyrics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teamdrt.nijanand.R;
import com.teamdrt.nijanand.database.bhajan;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LyricsFragment extends Fragment {

    private LyricsViewModel mViewModel;
    private ArrayList<bhajan> bhajanlist;
    public static LyricsFragment newInstance() {
        return new LyricsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lyrics_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bhajanlist=new ArrayList<>();
        mViewModel = new ViewModelProvider(this, new LyricsViewodelFctory(Objects.requireNonNull(getActivity()).getApplication())).get(LyricsViewModel.class);
        mViewModel.initiatedata();
        RecyclerView recyclerview=view.findViewById(R.id.lyrics_rv);
        LyricsAdapter adapter=new LyricsAdapter(bhajanlist);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.setAdapter(adapter);
        mViewModel.getAllbhajans().observe(getViewLifecycleOwner(), bhajans -> {
            bhajanlist.clear();
            bhajanlist.addAll(bhajans);
            adapter.notifyDataSetChanged();
        });
    }
}