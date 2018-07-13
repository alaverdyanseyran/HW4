package com.example.sey.homework4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyPager extends PagerAdapter {
    private LayoutInflater inflater;
    private Context context;
    private ImageView image;
    private ArrayList<String> uries;
    private TextView ttt;

    public MyPager(ArrayList<String> uries, Context context) {
        this.uries = uries;
        this.context = context;
    }



    @Override
    public int getCount() {
        return uries.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view == (LinearLayout) o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        image = view.findViewById(R.id.sl_image);
        ttt =  view.findViewById(R.id.ttt);
        ttt.setText("image: "+(position+1));
        Picasso.with(view.getContext()).load(uries.get(position)).fit().into(image);
        container.addView(view);
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.invalidate();
    }
}
