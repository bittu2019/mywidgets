package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Ratingme extends AppCompatActivity {

    private AppCompatRatingBar rbRatingbar;
    private AppCompatButton btnRate;
    private AppCompatTextView tvShowrating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);

        rbRatingbar = (AppCompatRatingBar) findViewById(R.id.rb_ratingbar);
        btnRate = (AppCompatButton) findViewById(R.id.btn_rate);
        tvShowrating = (AppCompatTextView) findViewById(R.id.tv_showrating);
        btnRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating1=""+rbRatingbar.getRating();
                String totalstars=""+rbRatingbar.getNumStars();
                tvShowrating.setText(rating1+"/"+totalstars);
                Toast.makeText(getApplicationContext(), "Your rating is: "+rating1+"/"+totalstars , Toast.LENGTH_SHORT).show();
            }
        });

    }
}