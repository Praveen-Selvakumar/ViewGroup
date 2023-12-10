package com.example.viewgroup.RecyclerView;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewgroup.R;

import java.util.ArrayList;

public class Recycler_Activity extends AppCompatActivity {



    RecyclerView recyclerView;


    ArrayList<AnimalModel> arrayList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setVisibility(View.VISIBLE);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new RecyclerAdapter(this, getData()));


    }


    private  ArrayList<AnimalModel> getData(){
        arrayList = new ArrayList<>();
        arrayList.add(new AnimalModel(1, "https://pbs.twimg.com/profile_images/1323487823413026816/mBSe2Rk0_400x400.jpg","Honey Badger"));
        arrayList.add(new AnimalModel(2, "https://t3.ftcdn.net/jpg/05/69/89/68/360_F_569896803_6790bR26fhf7Nu7uD5LfgugUQRxTs4ti.jpg","Lion"));
        arrayList.add(new AnimalModel(3, "https://static.vecteezy.com/system/resources/previews/026/840/979/non_2x/close-up-shot-of-a-wild-tiger-roaring-free-photo.jpg","Tiger"));
        arrayList.add(new AnimalModel(4, "https://img.freepik.com/premium-photo/wildlife-photography-angry-cheetah_684882-851.jpg","Cheetah"));
        arrayList.add(new AnimalModel(5, "https://www.abc.net.au/reslib/200907/r397464_1862320.jpg","Tasmanian Devil"));
        arrayList.add(new AnimalModel(6, "https://t4.ftcdn.net/jpg/06/04/53/75/360_F_604537502_Ukw6CaHHoJTNZtPIAwbOQctsqStXQAwr.jpg","Bear"));
        arrayList.add(new AnimalModel(7, "https://thumbs.dreamstime.com/b/angry-hyena-savannah-front-view-ai-generated-spotted-looking-roaring-to-camera-281027508.jpg","Hynaa"));
        return  arrayList;
    }






}
