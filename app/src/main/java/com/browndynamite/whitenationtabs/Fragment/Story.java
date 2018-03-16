package com.browndynamite.whitenationtabs.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.browndynamite.whitenationtabs.MainActivity;
import com.browndynamite.whitenationtabs.R;
import com.browndynamite.whitenationtabs.adapter.Hypes;
import com.browndynamite.whitenationtabs.adapter.customForHypesArray;

import java.util.ArrayList;

/**
 * Created by ASUS on 1/23/2018.
 */

public class Story extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        return inflater.inflate(R.layout.story_layout,null);
    }
}
