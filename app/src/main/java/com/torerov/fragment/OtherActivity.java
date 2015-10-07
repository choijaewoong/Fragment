package com.torerov.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class OtherActivity extends AppCompatActivity {

    Fragment f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
//        OneFragment f = (OneFragment)getSupportFragmentManager().findFragmentById(R.id.fragment);
        f1 = OneFragment.newInstance("hello!!!");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.container, f1);
        ft.commit();

    }


}
