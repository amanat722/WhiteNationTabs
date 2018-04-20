package com.browndynamite.whitenationtabs.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.browndynamite.whitenationtabs.R;

import me.itangqi.waveloadingview.WaveLoadingView;

/**
 * Created by ASUS on 1/23/2018.
 */



public class HypeLevel extends Fragment {

    WaveLoadingView waveLoadingView;
    SeekBar seekBar;

    public View onCreateView(LayoutInflater inflator, ViewGroup group, Bundle bundle){

    View view =inflator.inflate(R.layout.hypelevel_layout,null);

    waveLoadingView=view.findViewById(R.id.waveLoading);
    seekBar=view.findViewById(R.id.seekbar);
    waveLoadingView.setProgressValue(0);


    seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
            waveLoadingView.setProgressValue(progress);
            waveLoadingView.resumeAnimation();
            if(progress<50)
            {
                waveLoadingView.setBottomTitle(String.format("%d%%",progress));
                waveLoadingView.setCenterTitle("");
                waveLoadingView.setTopTitle("");
            }
            else if(progress<80)
            {
                waveLoadingView.setBottomTitle("");
                waveLoadingView.setCenterTitle(String.format("%d%%",progress));
                waveLoadingView.setTopTitle("");
            }
            else
            { waveLoadingView.setBottomTitle("");
                waveLoadingView.setCenterTitle(String.format(""));
                waveLoadingView.setTopTitle(String.format("%d%%",progress));

                if(progress==100)
                {
                    waveLoadingView.pauseAnimation();
                }
            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });










    return view;





    }
}
