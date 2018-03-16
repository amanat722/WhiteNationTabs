package com.browndynamite.whitenationtabs;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import com.browndynamite.whitenationtabs.Fragment.Discover;
import com.browndynamite.whitenationtabs.Fragment.Story;
import com.browndynamite.whitenationtabs.Fragment.Streaks;
import com.browndynamite.whitenationtabs.adapter.Hypes;
import com.browndynamite.whitenationtabs.adapter.ViewPagerAdapter;
import com.browndynamite.whitenationtabs.adapter.customForHypesArray;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    Toolbar toolbar;
    GridView gridView;
    ArrayList<Hypes> hypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridView);
        hypes= new ArrayList<>();
        setHype();
        customForHypesArray adapterx= new customForHypesArray(MainActivity.this, hypes) ;
        gridView.setAdapter(adapterx);

        viewPager=findViewById(R.id.ViewPager);
        tabLayout=findViewById(R.id.tabLayout);
        toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        setDatatoViewPager();
        tabLayout.setupWithViewPager(viewPager);
        setTabIcons();

    }

    private void  setHype()
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

    @Override
    public void onBackPressed() {
        AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
        build.setMessage("Do you want to exit?");
        build.setCancelable(false);
        build.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        build.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface,int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alert = build.create();
        alert.setTitle("Exit");
        alert.show();
    }

    private void setTabIcons(){
        tabLayout.getTabAt(0).setIcon(R.drawable.thunder);
        tabLayout.getTabAt(1).setIcon(R.drawable.bondhu);
        tabLayout.getTabAt(2).setIcon(R.drawable.trophy);
    }



    private void setDatatoViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Discover(),"Hype");
        adapter.addFragment(new Story(),"Friends");
        adapter.addFragment(new Streaks(),"Streak");
        viewPager.setAdapter(adapter);
    }
}
