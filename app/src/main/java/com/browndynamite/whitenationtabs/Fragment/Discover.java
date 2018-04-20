package com.browndynamite.whitenationtabs.Fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.browndynamite.whitenationtabs.R;
import com.browndynamite.whitenationtabs.adapter.Hypes;
import com.browndynamite.whitenationtabs.adapter.customForHypesArray;

import java.util.ArrayList;

/**
 * Created by ASUS on 1/23/2018.
 */

public class Discover extends Fragment {
    GridView gridView;
    ArrayList<Hypes> hypes;


    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view = inflater.inflate(R.layout.discover_layout, null);
        gridView= view.findViewById(R.id.gridView);
        hypes= new ArrayList<>();
        setHype();
        customForHypesArray adapterx= new customForHypesArray(getContext(), hypes) ;
        gridView.setAdapter(adapterx);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                String easyPuzzle="";
                intent = new Intent(getActivity(), mFragmentFavorite.class);

                if(i==0)
                {
                    easyPuzzle="food";
                    intent.putExtra("epuzzle", easyPuzzle);
                }
                if(i==1)
                {
                    easyPuzzle="travel";
                    intent.putExtra("epuzzle", easyPuzzle);
                }
                if(i==2)
                {
                    easyPuzzle="movie";
                    intent.putExtra("epuzzle", easyPuzzle);
                }
                if(i==3)
                {
                    easyPuzzle="gadget";
                    intent.putExtra("epuzzle", easyPuzzle);
                }
                if(i==4)
                {
                    easyPuzzle="music";
                    intent.putExtra("epuzzle", easyPuzzle);
                }
                startActivity(intent);




            }
        });
        return view;
    }

    private void setHype()
    {
        Hypes food =new Hypes(R.drawable.food ,"food");
        Hypes travel =new Hypes(R.drawable.travel ,"travel");
        Hypes movies =new Hypes(R.drawable.movies ,"movies");
        Hypes gadgets =new Hypes(R.drawable.gadgets ,"gadgets");
        Hypes music =new Hypes(R.drawable.music ,"music");

        hypes.add(food);
        hypes.add(travel);
        hypes.add(movies);
        hypes.add(gadgets);
        hypes.add(music);

    }

}
