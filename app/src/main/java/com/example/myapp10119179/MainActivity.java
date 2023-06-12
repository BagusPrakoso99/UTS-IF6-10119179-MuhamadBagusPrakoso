package com.example.myapp10119179;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.myapp10119179.fragment.DailyFragment;
import com.example.myapp10119179.fragment.GalleryFragment;
import com.example.myapp10119179.fragment.HomeFragment;
import com.example.myapp10119179.fragment.MediaFragment;
import com.example.myapp10119179.fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


//
//       Nim : 10119179
//       Nama : Muhamad Bagus Prakoso
//       Kelas : IF-6

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new HomeFragment());
        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.home:
                        fragment = new HomeFragment();
                        break;

                    case R.id.daily:
                        fragment = new DailyFragment();
                        break;

                    case R.id.galleri:
                        fragment = new GalleryFragment();
                        break;

                    case R.id.media:
                        fragment = new MediaFragment();
                        break;

                    case R.id.profil:
                        fragment = new ProfileFragment();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });

        //Menampilkan halaman Fragment

}

    private boolean getFragmentPage(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}