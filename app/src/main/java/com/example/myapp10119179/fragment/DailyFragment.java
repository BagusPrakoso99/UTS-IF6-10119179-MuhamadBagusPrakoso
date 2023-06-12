package com.example.myapp10119179.fragment;
//
//       Nim : 10119179
//       Nama : Muhamad Bagus Prakoso
//       Kelas : IF-6

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp10119179.Adapter;
import com.example.myapp10119179.AdapterHelp;
import com.example.myapp10119179.R;

import com.example.myapp10119179.fragment.dailyfriend.FriendFragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
;


public class DailyFragment extends Fragment {

    @Nullable
    RecyclerView recyclerView;
    ArrayList images, name;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily, container, false);


        Button btn = (Button) view.findViewById(R.id.btn_show);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_daily_1, new FriendFragment());
                fr.commit();
            }
        });



        recyclerView = view.findViewById(R.id.recycler_view_1);
        images = new ArrayList();
        name = new ArrayList();
        for (int i = 0; i<Adapter.names.length; i++)
        {
            images.add(Adapter.images);
            name.add(Adapter.names);
        }
        AdapterHelp adapterHelp = new AdapterHelp(getContext(), images, name);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterHelp);

        return view;
    }
}