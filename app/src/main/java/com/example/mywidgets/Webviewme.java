package com.example.mywidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Webviewme extends AppCompatActivity {
    private WebView wvWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        wvWebview = (WebView) findViewById(R.id.wv_webview);
        wvWebview.loadUrl("https://smartprogramming.in/");

    }
}