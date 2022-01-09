package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Spinner1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spMyspinner;
    String [] data_test={"item 1", "item 2", "item 3", "item 4", "item 5", "item 6", "item 7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spMyspinner = (Spinner) findViewById(R.id.sp_myspinner);
        spMyspinner.setOnItemSelectedListener(this);
        ArrayAdapter abc=new ArrayAdapter(this, android.R.layout.simple_spinner_item,data_test);
        spMyspinner.setAdapter(abc);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), data_test[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}