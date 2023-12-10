package com.example.viewgroup.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.viewgroup.R;

import java.util.ArrayList;

public class RecyclerAdapter  extends  RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    Context context;
    ArrayList<AnimalModel> arrayList;

    public RecyclerAdapter(Context context, ArrayList<AnimalModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_lt, parent, false);
        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

        AnimalModel app = arrayList.get(position);

        holder.txt.setText(app.getName());

        Glide.with(context.getApplicationContext()).load(arrayList.get(position).getImage()).into(holder.img);



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            txt = itemView.findViewById(R.id.name);
        }
    }
}