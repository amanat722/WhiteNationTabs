package com.browndynamite.whitenationtabs.adapterForNotification;

/**
 * Created by user on 4/20/2018.
 */

public class DataProviderNotification {
   private int img;
   private String notification;

    public DataProviderNotification(int img, String notification) {
        this.img = img;
        this.notification = notification;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }
}
