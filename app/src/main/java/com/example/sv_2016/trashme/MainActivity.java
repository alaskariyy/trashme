package com.example.sv_2016.trashme;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        NewsFragment.OnFragmentInteractionListener,
        HomeFragment.OnFragmentInteractionListener,
        BuangSampahFragment.OnFragmentInteractionListener,
        DonasiFragment.OnFragmentInteractionListener,
        EduFragment.OnFragmentInteractionListener,
        SettingFragment.OnFragmentInteractionListener,
        TentangFragmen.OnFragmentInteractionListener,
        TukarFragmen.OnFragmentInteractionListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        HomeFragment homeFragment = HomeFragment.newInstance("satu","dua");
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(
                R.id.relativelayout_for_fragment,
                homeFragment,
                homeFragment.getTag()
        ).commit();

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            HomeFragment homeFragment = HomeFragment.newInstance("satu","dua");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    homeFragment,
                    homeFragment.getTag()
            ).commit();
        } else if (id == R.id.nav_news) {
            NewsFragment newsFragment = NewsFragment.newInstance("satu","dua");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    newsFragment,
                    newsFragment.getTag()
            ).commit();
        } else if (id == R.id.nav_manage) {
            SettingFragment settingFragment = SettingFragment.newInstance("satu","dua");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    settingFragment,
                    settingFragment.getTag()
            ).commit();
        } else if (id == R.id.nav_buangsampah) {
            BuangSampahFragment buangSampahFragment = BuangSampahFragment.newInstance("satu","dua");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    buangSampahFragment,
                    buangSampahFragment.getTag()
            ).commit();
        } else if (id == R.id.nav_donasi) {
            DonasiFragment donasiFragment = DonasiFragment.newInstance("satu","dua");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    donasiFragment,
                    donasiFragment.getTag()
            ).commit();
        } else if (id == R.id.nav_tentangsampah) {
            EduFragment tentangFragmen = EduFragment.newInstance("satu","dua");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    tentangFragmen,
                    tentangFragmen.getTag()
            ).commit();
        } else if (id == R.id.nav_dai){
            DaiFragment daiFragment = DaiFragment.newInstance("satu","dua");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    daiFragment,
                    daiFragment.getTag()
            ).commit();
        } else if (id == R.id.nav_view){

        } else if (id == R.id.nav_tukarkoin){
            TukarFragmen tukarFragmen = TukarFragmen.newInstance("satu","dua");
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(
                    R.id.relativelayout_for_fragment,
                    tukarFragmen,
                    tukarFragmen.getTag()
            ).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void clickBuang(View v){
//        v.startAnimation(AnimationUtils.loadAnimation(this, R.animator.image_click));
        BuangSampahFragment buangSampahFragment = BuangSampahFragment.newInstance("satu","dua");
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(
                R.id.relativelayout_for_fragment,
                buangSampahFragment,
                buangSampahFragment.getTag()
        ).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
