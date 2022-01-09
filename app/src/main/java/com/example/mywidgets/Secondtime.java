package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.TimePicker;

import java.util.Calendar;

public class Secondtime extends AppCompatActivity {
    private TimePickerDialog picker;
    private AppCompatEditText etTiempic;
    private AppCompatTextView tvShowmytime;
    private AppCompatButton btnShowtime1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondtime);

        etTiempic = (AppCompatEditText) findViewById(R.id.et_tiempic);
        tvShowmytime = (AppCompatTextView) findViewById(R.id.tv_showmytime);
        btnShowtime1 = (AppCompatButton) findViewById(R.id.btn_showtime1);
        etTiempic.setInputType(InputType.TYPE_NULL);
        etTiempic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr=Calendar.getInstance();
                int hour=cldr.get(Calendar.HOUR_OF_DAY);
                int minute=cldr.get(Calendar.MINUTE);
                picker=new TimePickerDialog(Secondtime.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        etTiempic.setText(hourOfDay+ ":"+ minute);
                    }
                },hour,minute,true);
                picker.show();
            }
        });
        btnShowtime1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowmytime.setText(etTiempic.getText());
            }
        });

    }
}