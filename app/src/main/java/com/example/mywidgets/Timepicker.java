package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Timepicker extends AppCompatActivity {

    private TimePicker tpTimepicker;
    private TextView tvShowtime;
    private AppCompatButton btnShowtime;
    private AppCompatButton btnNext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker);
        tvShowtime = (TextView) findViewById(R.id.tv_showtime);
        tpTimepicker = (TimePicker) findViewById(R.id.tp_timepicker);
        btnShowtime = (AppCompatButton) findViewById(R.id.btn_showtime);
        btnNext = (AppCompatButton) findViewById(R.id.btn_next);

        tpTimepicker.setIs24HourView(true);
        btnShowtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int h,m;
                String am_pm;
                if(Build.VERSION.SDK_INT>=23)
                {
                    h=tpTimepicker.getHour();
                    m=tpTimepicker.getMinute();
                }
                else
                {
                    h=tpTimepicker.getCurrentHour();
                    m=tpTimepicker.getCurrentMinute();
                }
                if(h>12)
                {
                    am_pm="PM";
                    h=h-12;
                }
                else
                {
                    am_pm="AM";
                }
                tvShowtime.setText(h+":"+m+":"+am_pm);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Secondtime.class);
                startActivity(intent);
            }
        });
    }
}