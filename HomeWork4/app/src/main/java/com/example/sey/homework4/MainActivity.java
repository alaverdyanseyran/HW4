package com.example.sey.homework4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> uris;
    private MyPager pagerAdapter;
    private ViewPager viewPager;
    private Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        viewPager = findViewById(R.id.v_pager);
        pagerAdapter = new MyPager(uris, this);
        viewPager.setAdapter(pagerAdapter);
       ;
        skip =findViewById(R.id.b_skip);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Users.class);
                startActivity(intent);
            }
        });


    }

    private void init() {

        uris = new ArrayList<>();
        uris.add("https://cdn.pixabay.com/photo/2015/07/14/18/14/school-845196__340.png");
        uris.add("https://cdn.pixabay.com/photo/2017/01/03/17/04/dragon-1949993__340.png");
        uris.add("https://cdn.pixabay.com/photo/2016/03/03/17/15/fruit-1234657__340.png");
    }

}
