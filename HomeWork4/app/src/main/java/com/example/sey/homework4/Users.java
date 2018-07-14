package com.example.sey.homework4;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Users extends AppCompatActivity implements ListenOnItemClick{
    private RecyclerView recyclerView;
    private UserAdapter adapter;
    public ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        initList();

        adapter = new UserAdapter(this, users);
        recyclerView = (RecyclerView) findViewById(R.id.rec_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();



    }

    private void initList() {
        users = new ArrayList<>();
       Random rand = new Random();

        users.add(new User("Poxos", "https://cdn.pixabay.com/photo/2015/07/14/18/14/school-845196__340.png", "Ira hmar status"));
        users.add(new User("Petros", "https://png.icons8.com/cotton/2x/plug-5.png", "status kak status"));
        users.add(new User("martiros", "https://png.icons8.com/cotton/2x/novel.png", "es laav lav em"));
        for (int i = 0; i < users.size(); ++i) {
            users.get(i).messages = new ArrayList<>();
            for (int j = 0; j < 4; ++j) {
                int pos = rand.nextInt(users.size());
                Message m = new Message("message " + i + " " + j, ((i + j) % 3 == 0) ? true : false, new Date(2010 + i + j, 5 + i, 15 + j), users.get(pos));

                users.get(i).messages.add(m);
            }
        }
    }

    @Override
    public void onItemClick() {
        Bundle bundle = new Bundle();
        String [] ss=new String[] {"https://png.icons8.com/cotton/2x/novel.png", "ggggg"};
       bundle.putStringArray("MMM", ss );
        DetailFragment fragInfo = new DetailFragment();
        fragInfo.setArguments(bundle);

    }
}