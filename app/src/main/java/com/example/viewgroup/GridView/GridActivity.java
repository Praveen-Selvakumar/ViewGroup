package com.example.viewgroup.GridView;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.viewgroup.R;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {



    //Grid View
    /*
    * - It is ViewGroup used to Display items in two - Dimensional Grid
    * - Base Adapter is used to achieve this View
    *
    * */


    GridView gv;

    ArrayList<ItemModel> arrayList;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv  = (GridView) findViewById(R.id
                .gv);

        gv.setAdapter(new GridViewAdapter(GridActivity.this, getData()));



    }

    private  ArrayList<ItemModel> getData(){
        arrayList = new ArrayList<>();
        arrayList.add(new ItemModel(1, "apple" , "https://www.thetutuguru.com.au/wp-content/uploads/2020/03/Hello-Hello-Plants-Nursery-melbourne-malus-domestica-Red-Delicious-Apple.jpg"));
        arrayList.add(new ItemModel(2, "orange" ,"https://static-bebeautiful-in.unileverservices.com/Why-you-must-eat-an-orange-every-day_1.jpg"));
        arrayList.add(new ItemModel(3, "grapes" ,"https://www.foodrepublic.com/img/gallery/15-types-of-grapes-to-know-eat-and-drink/l-intro-1684769284.jpg"));
        arrayList.add(new ItemModel(4, "WaterMelon" ,"https://hips.hearstapps.com/hmg-prod/images/fresh-ripe-watermelon-slices-on-wooden-table-royalty-free-image-1684966820.jpg?crop=0.88973xw:1xh;center,top&resize=1200:*"));
        arrayList.add(new ItemModel(5, "Gova" ,"https://www.shutterstock.com/shutterstock/photos/1265322979/display_1500/stock-photo-gova-green-yellow-closeup-1265322979.jpg"));
        arrayList.add(new ItemModel(6, "Strawberry" ,"https://clv.h-cdn.co/assets/15/22/2560x1728/gallery-1432664914-strawberry-facts1.jpg"));
        arrayList.add(new ItemModel(7, "Mango" ,"https://www.narayanahealth.org/blog/wp-content/uploads/2022/06/Raw-Mango-Blog-Image.jpg"));
        arrayList.add(new ItemModel(8, "Mulberry" ,"https://m.media-amazon.com/images/I/71iu4B6NEsL._AC_UF1000,1000_QL80_.jpg"));
        arrayList.add(new ItemModel(9, "Pomegranate" ,"https://images.healthshots.com/healthshots/en/uploads/2021/09/27184641/pomegranate-1600x900.jpg"));
        arrayList.add(new ItemModel(10, "Cherry", "https://media.istockphoto.com/id/172315512/photo/sweet-cherries.jpg?s=612x612&w=0&k=20&c=qz6b92ZkcMTH5XtZUMI7CW7CQPkYFo1qAWoHX48VQk4="));
        return  arrayList;

    }


}