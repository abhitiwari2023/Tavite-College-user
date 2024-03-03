package com.example.tavitecollege;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.tavitecollege.ui.HomeFragment;
import com.example.tavitecollege.ui.about.AboutFragment;
import com.example.tavitecollege.ui.faculty.FacultyFragment;
import com.example.tavitecollege.ui.gallery.GalleryFragment;
import com.example.tavitecollege.ui.notice.NoticeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bottomNavigationView;
    private Toolbar toolbar;
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private NavigationView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        init();

        // setting drawer toggle
        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.start, R.string.end);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        // default screen
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).
                commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.
                OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,
                            new HomeFragment()).commit();
                    return true;
                } else if (id == R.id.notice) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,
                            new NoticeFragment()).commit();
                    return true;
                } else if (id == R.id.faculty) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,
                            new FacultyFragment()).commit();
                    return true;
                } else if (id == R.id.gallery) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,
                            new GalleryFragment()).commit();
                    return true;
                } else {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,
                            new AboutFragment()).commit();
                    return true;
                }
            }
        });

        // setting navigation view
        view.setNavigationItemSelectedListener(this);

    }

    private void init() {
        bottomNavigationView = findViewById(R.id.bottom_nav);
        toolbar = findViewById(R.id.toolbar);
        drawer = findViewById(R.id.drawer);
        view = findViewById(R.id.navigation);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int ids = item.getItemId();
        if (ids == R.id.navigation_video) {
            gotoUrl("https://www.youtube.com/c/GateSmashers/playlists");
            return true;
        } else if (ids == R.id.navigation_website) {
            gotoUrl("https://tavitebedcollege.org/");
            return true;
        } else if (ids == R.id.navigation_share) {
            try {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "Tavite Group of Education, Katni");
                i.putExtra(Intent.EXTRA_TEXT, "https://github.com/abhitiwari2023/Tavite-College-user" + getApplicationContext().getPackageName());
                startActivity(Intent.createChooser(i, "Share with"));
            } catch (Exception e) {
                Toast.makeText(this, "Unable to share this app", Toast.LENGTH_SHORT).show();
            }
            return true;
        } else
            return true;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();
    }
}