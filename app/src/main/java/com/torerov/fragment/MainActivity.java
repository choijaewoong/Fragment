package com.torerov.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String F1_TAG = "f1_tag";
    private static final String F2_TAG = "f2_tag";
    Fragment f1,f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = OneFragment.newInstance("hello!!!");
        f2 = new TwoFragment();

        Fragment f = new OneFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.container, f1, F1_TAG);
        ft.commit();

        Button btn = (Button) findViewById(R.id.btn_f1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = getSupportFragmentManager().findFragmentByTag(F1_TAG);
                if (f == null) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, f1, F1_TAG);
                    ft.commit();
                }
            }
        });

        btn = (Button) findViewById(R.id.btn_f2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = getSupportFragmentManager().findFragmentByTag(F2_TAG);
                if (f == null) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, f2, F2_TAG);
                    ft.commit();
                }
            }
        });
    }
}
