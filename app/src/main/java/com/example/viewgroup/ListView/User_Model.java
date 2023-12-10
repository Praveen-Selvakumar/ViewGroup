package com.example.viewgroup.ListView;

public class User_Model {

    int id;
    String image;
    String name;

    public User_Model(int id, String image, String name) {
        this.id = id;
        this.image = image;
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
