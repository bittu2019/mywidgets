package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;

public class Datepicker extends AppCompatActivity {
    DatePickerDialog picker;
    private AppCompatEditText etDate;
    private AppCompatTextView tvShowdate;
    private AppCompatButton btnDatedisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);
        etDate = (AppCompatEditText) findViewById(R.id.et_date);
        tvShowdate = (AppCompatTextView) findViewById(R.id.tv_showdate);
        btnDatedisplay = (AppCompatButton) findViewById(R.id.btn_datedisplay);
        etDate.setInputType(InputType.TYPE_NULL);
        etDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day=cldr.get(Calendar.DAY_OF_MONTH);
                int month=cldr.get(Calendar.MONTH);
                int year=cldr.get(Calendar.YEAR);
                picker=new DatePickerDialog(Datepicker.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        etDate.setText(dayOfMonth+"/"+month+"/"+year);
                    }
                },year,month,day);
                picker.show();
            }
        });
        btnDatedisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowdate.setText(etDate.getText());
            }
        });
    }
}