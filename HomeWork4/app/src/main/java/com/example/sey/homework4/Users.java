package com.example.sey.homework4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class Users extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserAdapter adapter;
    public ArrayList<User> users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        users = new ArrayList<>();
        users.add(new User("Poxos","https://cdn.pixabay.com/photo/2015/07/14/18/14/school-845196__340.png" , "Ira hmar status"));
        users.add(new User("Petros","https://png.icons8.com/cotton/2x/plug-5.png" , "status kak status"));
        users.add(new User("martiros","https://png.icons8.com/cotton/2x/novel.png" , "es laav lav em"));
        adapter = new UserAdapter(this, users);
        recyclerView = (RecyclerView) findViewById(R.id.rec_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}
