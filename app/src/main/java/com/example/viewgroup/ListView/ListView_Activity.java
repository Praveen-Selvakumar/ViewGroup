package com.example.viewgroup.ListView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewgroup.R;
import com.example.viewgroup.RecyclerView.AnimalModel;

import java.util.ArrayList;

public class ListView_Activity extends AppCompatActivity {

    ListView list_view;
    ArrayList<User_Model> arrayList;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_view  = (ListView) findViewById(R.id.list_view);
        list_view.setVisibility(View.VISIBLE);
        list_view.setAdapter(new ListView_Adapter(ListView_Activity.this, getData()));




    }

    private ArrayList<User_Model> getData(){
        arrayList = new ArrayList<>();
        arrayList.add(new User_Model(1, "https://i.pinimg.com/564x/72/f0/1c/72f01c0362bee02848ddb1186cb939e5.jpg", "vin deisel"));
        arrayList.add(new User_Model(2, "https://images.livemint.com/img/2022/07/22/original/FILES-US-ENTERTAINMENT-FILM-OSCARS-SMITH-ACADEMY-1_1648731181914_1658471779653.jpg", "will smith"));
        arrayList.add(new User_Model(3, "https://images.hindustantimes.com/img/2022/04/01/1600x900/2f731094-a9c1-11ec-9297-ed70bb26c8ff_1648825261500.jpg", "Jake"));
        arrayList.add(new User_Model(4, "https://static.javatpoint.com/top10-technologies/images/top-10-hollywood-actors1.png", "Dwane Johnson"));
        arrayList.add(new User_Model(5, "https://static.javatpoint.com/top10-technologies/images/top-10-hollywood-actors3.png", "Tom Cruise"));
        return arrayList;
    }
}