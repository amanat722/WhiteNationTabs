package com.browndynamite.whitenationtabs.adapter;

/**
 * Created by ASUS on 3/16/2018.
 */

public class Hypes {

    private int ImageID;
    private String name;

    public Hypes(int imageID, String name) {
        ImageID = imageID;
        this.name = name;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
