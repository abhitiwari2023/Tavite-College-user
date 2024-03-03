package com.example.tavitecollege;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tavitecollege.ui.AboutFragment;
import com.example.tavitecollege.ui.FacultyFragment;
import com.example.tavitecollege.ui.GalleryFragment;
import com.example.tavitecollege.ui.HomeFragment;
import com.example.tavitecollege.ui.NoticeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        init();

        // default screen
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                
                int id  = item.getItemId();
                
                if (id == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).commit();
                    return true;
                }
                else if (id == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, new NoticeFragment()).commit();
                    return true;
                }
                else if (id == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, new FacultyFragment()).commit();
                    return true;
                }
               else  if (id == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, new GalleryFragment()).commit();
                    return true;
                }
              else {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, new AboutFragment()).commit();
                    return true;
                }
            }
        });


    }

    private void init() {
        bottomNavigationView = findViewById(R.id.bottom_nav);
    }
}