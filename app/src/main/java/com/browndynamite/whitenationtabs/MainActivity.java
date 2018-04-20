package com.browndynamite.whitenationtabs;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.browndynamite.whitenationtabs.Fragment.HypeFragment;
import com.browndynamite.whitenationtabs.Fragment.Notification;
import com.browndynamite.whitenationtabs.Fragment.HypeLevel;
import com.browndynamite.whitenationtabs.adapter.ViewPagerAdapter;


public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int x=5;

        viewPager=findViewById(R.id.ViewPager);
        tabLayout=findViewById(R.id.tabLayout);
       // toolbar=findViewById(R.id.toolBar);
        //setSupportActionBar(toolbar);
        setDatatoViewPager();
        tabLayout.setupWithViewPager(viewPager);
        setTabIcons();

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
        adapter.addFragment(new HypeFragment(),"Hype");
        adapter.addFragment(new Notification(),"Notification");
        adapter.addFragment(new HypeLevel(),"Level");
        viewPager.setAdapter(adapter);
    }
}
