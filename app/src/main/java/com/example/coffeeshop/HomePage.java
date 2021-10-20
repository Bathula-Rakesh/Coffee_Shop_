package com.example.coffeeshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePage extends AppCompatActivity {

    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        bottomNav = findViewById(R.id.bottomNav);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new HomeFragment()).commit();
        bottomNav.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectFragment = null;
                    switch (item.getItemId()) {
                        case R.id.home:
                            selectFragment = new HomeFragment();
                            break;
//                        case R.id.location:
//                            selectFragment = new LocationFragment();
//                            break;
                        case R.id.coffees:
                            selectFragment = new CoffeesFragment();
                            break;
                        case R.id.profile:
                            selectFragment = new ProfileFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,selectFragment).commit();
                    return  true;
                }

            };
//        openFragment(new HomeFragment());
//
//        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()){
//
//                    case R.id.home:
//                        openFragment(new HomeFragment());
//                        return true;
//
//                    case R.id.location:
//                        openFragment(new LocationFragment());
//                        return true;
//
//                    case R.id.coffees:
//                        openFragment(new CoffeesFragment());
//                        return true;
//
//                    case R.id.profile:
//                        openFragment(new ProfileFragment());
//                        return true;
//                }
//
//                return false;
//            }
//        });
//
//    }
//            public void openFragment(Fragment fragment){
//            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.replace(R.id.frameLayout, fragment);
//            fragmentTransaction.addToBackStack(null);
//            fragmentTransaction.commit();
//


}