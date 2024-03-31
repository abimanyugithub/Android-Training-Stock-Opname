package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class scan_reserv extends AppCompatActivity {
    String content;
    String namafile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan_reserv);
        content="file:///android_asset/sc_rsv.htm";
        WebView wv;
        wv=(WebView)findViewById(R.id.webView5);
        WebSettings webSettings=wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(scan_reserv.this, menu_rf.class);
        startActivity(a);
        finish();
    }
}
