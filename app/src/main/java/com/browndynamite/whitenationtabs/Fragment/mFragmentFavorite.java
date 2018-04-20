package com.browndynamite.whitenationtabs.Fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.browndynamite.whitenationtabs.R;

public class mFragmentFavorite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_fragment_favorite);
        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("epuzzle");

        TextView textView=findViewById(R.id.text);


        if(easyPuzzle.equals("food"))
        textView.setText("Madchef\nTakeout\nChillox\n");


        if(easyPuzzle.equals("travel"))
            textView.setText("Sunderbans\nCox's Bazar\nJaflong\n");

        if(easyPuzzle.equals("movie"))
            textView.setText("Black Panther\nThe Greatest Showman\nReal Player\n");

        if(easyPuzzle.equals("gadget"))
            textView.setText("Oneplus6\nSamsung S9\nIphone X\n");

        if(easyPuzzle.equals("music"))
            textView.setText("Gucci Gang\nMeant To Be\nGod's Plan");
    }
}
