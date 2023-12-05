package com.example.viewgroup.GridView;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.viewgroup.R;

import java.util.ArrayList;

public class GridViewAdapter extends  BaseAdapter{


    Context context;
    ArrayList<ItemModel> arrayList;

    public GridViewAdapter(Context context, ArrayList<ItemModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_lt, parent, false);
        }

        ImageView  img  = (ImageView) view.findViewById(R.id.img);
        TextView  txt  = (TextView) view.findViewById(R.id.name_txt);

        txt.setText(arrayList.get(position).getItem_Name());


        Glide.with(context)
                .load(arrayList.get(position).getItem_Image())
                .into(img);


        return view;
    }


}