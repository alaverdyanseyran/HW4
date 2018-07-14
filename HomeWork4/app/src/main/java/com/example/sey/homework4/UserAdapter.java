package com.example.sey.homework4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.VHolder> {
    private Context context;
    private ArrayList<User> userArrayList;
    ListenOnItemClick itemClick;


    public UserAdapter(Context context, ArrayList<User> userArrayList) {

        this.context = context;
        this.userArrayList = userArrayList;
    }

    public class VHolder extends RecyclerView.ViewHolder {

        ImageView av;
        TextView name;
        TextView status;

        public VHolder(@NonNull View itemView) {
            super(itemView);
            av=itemView.findViewById(R.id.avat);
            name=itemView.findViewById(R.id.name);
            status =itemView.findViewById(R.id.status);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "ddddddddddd", Toast.LENGTH_LONG).show();

                }
            });
        }
    }

    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_item, parent, false);

        return new VHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VHolder vHolder, int position) {
        User user =userArrayList.get(position) ;
        vHolder.name.setText(user.usName);
        vHolder.status.setText(user.status);
        Picasso.with(context).load(user.avUri).fit().into(vHolder.av);
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }
}
interface ListenOnItemClick{
    void onItemClick();
}