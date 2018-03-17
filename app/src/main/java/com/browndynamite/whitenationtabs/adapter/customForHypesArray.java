package com.browndynamite.whitenationtabs.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.browndynamite.whitenationtabs.R;

import java.util.ArrayList;

/**
 * Created by ASUS on 3/16/2018.
 */

public class customForHypesArray extends BaseAdapter {
  Context c;
  ArrayList<Hypes>arrayList;

    public customForHypesArray(Context c, ArrayList<Hypes> arrayList) {
        this.c = c;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {


        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View custom_view =inflater.inflate(R.layout.grid_item_layout,null);
        ImageView imgHype= custom_view.findViewById(R.id.imgHypex);
        TextView txtHype = custom_view.findViewById(R.id.txtHypex);
        //TODO: decrease the size of your images.
      imgHype.setImageResource(arrayList.get(pos).getImageID());
        txtHype.setText(arrayList.get(pos).getName());


        return custom_view;
    }
}
