package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Radio1 extends AppCompatActivity {


    private AppCompatRadioButton rdbJava;
    private AppCompatRadioButton rdbCorejava;
    private AppCompatRadioButton rdbPython;
    private AppCompatRadioButton rdbAndroid;
    private AppCompatRadioButton rdbAngular;
    private AppCompatButton btnMyclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio1);


        rdbJava = (AppCompatRadioButton) findViewById(R.id.rdb_java);
        rdbCorejava = (AppCompatRadioButton) findViewById(R.id.rdb_Corejava);
        rdbPython = (AppCompatRadioButton) findViewById(R.id.rdb_python);
        rdbAndroid = (AppCompatRadioButton) findViewById(R.id.rdb_android);
        rdbAngular = (AppCompatRadioButton) findViewById(R.id.rdb_angular);
        btnMyclick = (AppCompatButton) findViewById(R.id.btn_myclick);

        btnMyclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result="selected course";
                if(rdbJava.isChecked())
                {
                    result+="\n JAVA";
                }

                if(rdbCorejava.isChecked())
                {
                    result+="\n CORE JAVA";
                }

                if(rdbPython.isChecked())
                {
                    result+="\n PYTHON";
                }
                if(rdbAndroid.isChecked())
                {
                    result+="\n ANDROID";
                }
                if(rdbAngular.isChecked())
                {
                    result+="\n ANGULAR";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}