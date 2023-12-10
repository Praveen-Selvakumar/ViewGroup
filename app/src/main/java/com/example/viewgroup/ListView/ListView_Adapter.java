package com.example.viewgroup.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.viewgroup.R;

import java.util.ArrayList;

public class ListView_Adapter extends BaseAdapter {


    Context context;
    ArrayList<User_Model> arrayList;

    public ListView_Adapter(Context context, ArrayList<User_Model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            view = inflater.inflate(R.layout.recycler_lt, parent, false);
        }

        TextView txt = view.findViewById(R.id.name);
        ImageView img = view.findViewById(R.id.img);

        txt.setText(arrayList.get(position).getName());
        Glide.with(context.getApplicationContext()).load(arrayList.get(position).getImage()).into(img);


        return view;
    }
}
