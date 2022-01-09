package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvTimepicker;
    private TextView tvDatepicker;
    private TextView tvYoutube;
    private TextView tvToggle;
    private TextView tvCheckbox;
    private TextView tvRadio;
    private TextView tvSpinner;
    private TextView tvAlertdialogbox;
    private TextView tvRatingbar;
    private TextView tvWebview;
    private TextView tvSeekbar;
    private TextView tvProgressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviewbyme();
        clickable();

    }

    private void clickable() {
        tvTimepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Timepicker.class);
                startActivity(intent);
            }
        });

        tvDatepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Datepicker.class);
                startActivity(intent);
            }
        });
        tvYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Youtube.class);
                startActivity(intent);
            }
        });

        tvToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Toggle.class);
                startActivity(intent);
            }
        });
        tvCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Checkbox.class);
                startActivity(intent);
            }
        });
        tvRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Radio1.class);
                startActivity(intent);
            }
        });
        tvSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Spinner1.class);
                startActivity(intent);
            }
        });
        tvAlertdialogbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Alert.class);
                startActivity(intent);
            }
        });
        tvRatingbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Ratingme.class);
                startActivity(intent);
            }
        });
        tvWebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Webviewme.class);
                startActivity(intent);
            }
        });
        tvSeekbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Seekbarbyme.class);
                startActivity(intent);
            }
        });
        tvProgressbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Progressbarme.class);
                startActivity(intent);
            }
        });
    }

    private void findviewbyme() {
        tvTimepicker = (TextView) findViewById(R.id.tv_timepicker);
        tvDatepicker = (TextView) findViewById(R.id.tv_datepicker);
        tvYoutube = (TextView) findViewById(R.id.tv_youtube);
        tvToggle = (TextView) findViewById(R.id.tv_toggle);
        tvCheckbox = (TextView) findViewById(R.id.tv_checkbox);
        tvRadio = (TextView) findViewById(R.id.tv_radio);
        tvSpinner = (TextView) findViewById(R.id.tv_spinner);
        tvAlertdialogbox = (TextView) findViewById(R.id.tv_alertdialogbox);
        tvRatingbar = (TextView) findViewById(R.id.tv_ratingbar);
        tvWebview = (TextView) findViewById(R.id.tv_webview);
        tvSeekbar = (TextView) findViewById(R.id.tv_seekbar);
        tvProgressbar = (TextView) findViewById(R.id.tv_progressbar);
    }
}