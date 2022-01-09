package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Checkbox extends AppCompatActivity {
    private AppCompatCheckBox chk1;
    private AppCompatCheckBox chk2;
    private AppCompatCheckBox chk3;
    private AppCompatCheckBox chk4;
    private AppCompatCheckBox chk5;
    private AppCompatButton btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        chk1 = (AppCompatCheckBox) findViewById(R.id.chk1);
        chk2 = (AppCompatCheckBox) findViewById(R.id.chk2);
        chk3 = (AppCompatCheckBox) findViewById(R.id.chk3);
        chk4 = (AppCompatCheckBox) findViewById(R.id.chk4);
        chk5 = (AppCompatCheckBox) findViewById(R.id.chk5);
        btnClick = (AppCompatButton) findViewById(R.id.btn_click);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result="select course";
                if(chk1.isChecked())
                {
                    result+="\n Java";
                }
                if(chk2.isChecked())
                {
                    result+="\n Core Java";
                }
                if(chk3.isChecked())
                {
                    result+="\n Python";
                }
                if(chk4.isChecked())
                {
                    result+="\n Android";
                }
                if(chk5.isChecked())
                {
                    result+="\n Angular";
                }
                Toast.makeText(Checkbox.this, result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}