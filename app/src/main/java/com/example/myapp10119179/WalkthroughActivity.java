package com.example.myapp10119179;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import me.relex.circleindicator.CircleIndicator;


//
//       Nim : 10119179
//       Nama : Muhamad Bagus Prakoso
//       Kelas : IF-6

public class WalkthroughActivity extends AppCompatActivity {

    ViewPager viewPager;
    SlideViewAdapter sV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        viewPager = findViewById(R.id.viewPage);
        sV = new SlideViewAdapter(this);
        viewPager.setAdapter(sV);

        CircleIndicator ci = (CircleIndicator) findViewById(R.id.titik);
        ci.setViewPager(viewPager);


    }
    public void mulai(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}