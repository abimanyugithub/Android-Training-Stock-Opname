package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class tutor_rf extends AppCompatActivity {
        String content;
        String namafile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutor_rf);
        content="file:///android_asset/tutorrf.html";
        WebView wv;
        wv=(WebView)findViewById(R.id.webView2);
        WebSettings webSettings=wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(tutor_rf.this, menu_rf.class);
        startActivity(a);
        finish();
    }
}
