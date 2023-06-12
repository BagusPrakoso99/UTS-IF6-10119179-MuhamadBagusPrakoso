package com.example.myapp10119179.fragment;
//
//       Nim : 10119179
//       Nama : Muhamad Bagus Prakoso
//       Kelas : IF-6

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp10119179.Adapter;
import com.example.myapp10119179.R;
import com.example.myapp10119179.fragment.media.MediaAdapter;

import java.util.ArrayList;


public class MusicFragment extends Fragment {

    @Nullable
    RecyclerView recyclerView;
    ArrayList images, name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        recyclerView = view.findViewById(R.id.recycler_view_3);
        images = new ArrayList();
        name = new ArrayList();
        for (int i = 0; i< Adapter.music_names.length; i++)
        {
            images.add(Adapter.covermusic);
            name.add(Adapter.music_names);
        }
        MediaAdapter mediaAdapter = new MediaAdapter(getContext(), images, name);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mediaAdapter);
        return view;
    }
}