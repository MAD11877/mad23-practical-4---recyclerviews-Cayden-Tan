package com.example.week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class User extends AppCompatActivity {

    String Name;
    String Description;
    int ID;
    boolean Followed;

    int Img;

    public User(String name, String description, int id, boolean followed, int img)
    {
        Name = name;
        Description = description;
        ID = id;
        Followed = followed;
        Img = img;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isFollowed() {
        return Followed;
    }

    public void setFollowed(boolean followed) {
        Followed = followed;
    }


}