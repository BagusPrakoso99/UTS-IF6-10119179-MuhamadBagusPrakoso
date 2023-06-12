package com.example.myapp10119179.fragment;
//
//       Nim : 10119179
//       Nama : Muhamad Bagus Prakoso
//       Kelas : IF-6

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapp10119179.fragment.profile.AboutFragment;
import com.example.myapp10119179.fragment.profile.ContactFragment;
import com.example.myapp10119179.fragment.profile.FindFragment;
import com.example.myapp10119179.fragment.profile.MyFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapp10119179.R;


public class ProfileFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Button btn = (Button) view.findViewById(R.id.btn_profile);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new MyFragment());
                fr.commit();
            }
        });

        Button conbtn = (Button) view.findViewById(R.id.btn_contact);
        conbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new ContactFragment());
                fr.commit();
            }
        });

        Button findbtn = (Button) view.findViewById(R.id.btn_find);
        findbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new FindFragment());
                fr.commit();
            }
        });

        Button abotbtn = (Button) view.findViewById(R.id.btn_about);
        abotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new AboutFragment());
                fr.commit();
            }
        });

        return view;
    }
}