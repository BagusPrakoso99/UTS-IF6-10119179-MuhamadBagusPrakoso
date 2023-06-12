package com.example.myapp10119179.fragment;
//
//       Nim : 10119179
//       Nama : Muhamad Bagus Prakoso
//       Kelas : IF-6

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp10119179.R;
import com.example.myapp10119179.fragment.media.VideoAdapter;
import com.example.myapp10119179.fragment.media.VideoUrl;

import java.util.Vector;


public class VideoFragment extends Fragment {

    RecyclerView recyclerView;
    Vector<VideoUrl> youtubeVideo = new Vector<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_4);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        youtubeVideo.add(new VideoUrl("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/CB3d5L_yrCM\" frameborder=\"0\" allowfullscreen></iframe>"));
        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideo);
        recyclerView.setAdapter(videoAdapter);

        return view;
    }
}