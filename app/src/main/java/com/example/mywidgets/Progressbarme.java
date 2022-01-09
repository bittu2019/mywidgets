package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Progressbarme extends AppCompatActivity {
    private ProgressBar progress1;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);


        progress1 = (ProgressBar) findViewById(R.id.pb_myprogrss);
        myprogress();

    }

    private void myprogress() {
        Timer timer = new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                count++;
                progress1.setProgress(count);
                if (count==100)
                {

                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask,0,100);
    }
}