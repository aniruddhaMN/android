package com.example.a3;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;


public class BrowserActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_browser);

        WebView wv = (WebView)findViewById(R.id.webView);
        wv.getSettings().getJavaScriptEnabled();
        wv.loadUrl("http://google.com");
    }
}
