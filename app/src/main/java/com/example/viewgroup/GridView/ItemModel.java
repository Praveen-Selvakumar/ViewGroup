package com.example.viewgroup.GridView;

public class ItemModel {



    int id;
    String Item_Name;
    String Item_Image;


    public ItemModel(int id, String item_Name, String item_Image) {
        this.id = id;
        Item_Name = item_Name;
        Item_Image = item_Image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_Name() {
        return Item_Name;
    }

    public void setItem_Name(String item_Name) {
        Item_Name = item_Name;
    }

    public String getItem_Image() {
        return Item_Image;
    }

    public void setItem_Image(String item_Image) {
        Item_Image = item_Image;
    }


}