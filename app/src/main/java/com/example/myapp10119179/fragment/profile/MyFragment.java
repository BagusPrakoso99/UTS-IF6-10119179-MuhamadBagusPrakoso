package com.example.myapp10119179.fragment.profile;
//dikerjakan oleh agung segara rizki pada tanggal 18 mei 2021
import android.os.Bundle;



import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp10119179.R;


public class MyFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false);
    }
}