package com.example.viewgroup.RecyclerView;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.viewgroup.R;

import java.util.ArrayList;

public class Recycler_Activity extends AppCompatActivity {

    ArrayList<AnimalModel> arrayList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private ArrayList<AnimalModel> getData(){
        arrayList = new ArrayList<>();
     return arrayList;
    }


}
