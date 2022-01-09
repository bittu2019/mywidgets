package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class Seekbarbyme extends AppCompatActivity {

    private AppCompatSeekBar sbSeekbar;
    private AppCompatTextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        sbSeekbar = (AppCompatSeekBar) findViewById(R.id.sb_seekbar);
        tvResult = (AppCompatTextView) findViewById(R.id.tv_result);
        sbSeekbar.setMax(200);
        sbSeekbar.setProgress(100);
        tvResult.setText("Your progress: "+sbSeekbar.getProgress()+"/"+sbSeekbar.getMax());
        sbSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvResult.setText("Your Progress: "+sbSeekbar.getProgress()+"/"+sbSeekbar.getMax());
                if(sbSeekbar.getProgress()>=100)
                {
                    tvResult.setTextColor(Color.GREEN);
                }
                else
                {
                    tvResult.setTextColor(Color.BLUE);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Start", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Stop", Toast.LENGTH_SHORT).show();

            }
        });

    }
}