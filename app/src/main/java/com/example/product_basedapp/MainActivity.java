package com.example.product_basedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout t;
    ViewPager v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.tablayout);
        v = findViewById(R.id.viewpager);
        t.addTab(t.newTab().setText("Electronics Products"));
        t.addTab(t.newTab().setText("Women's Products"));
        t.addTab(t.newTab().setText("Men's Products"));
        v.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(t));
        MyViewPagerAdapter mv = new MyViewPagerAdapter(getSupportFragmentManager(), 0);
        v.setAdapter(mv);
        t.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                v.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}