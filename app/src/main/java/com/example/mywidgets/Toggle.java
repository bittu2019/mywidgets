package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Toggle extends AppCompatActivity {
    private ToggleButton tbMytoggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        tbMytoggle = (ToggleButton) findViewById(R.id.tb_mytoggle);
        tbMytoggle.setTextOff("OFF");
        tbMytoggle.setTextOn("ON");
        tbMytoggle.setChecked(true);
        tbMytoggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                    Toast.makeText(Toggle.this, "ON", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Toggle.this, "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}