package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import home.FragmentHome;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().hide();
        setHomeFragment();
    }

    void setHomeFragment(){

        getSupportFragmentManager().beginTransaction().replace(R.id.container,new FragmentHome()).commit();

    }
}