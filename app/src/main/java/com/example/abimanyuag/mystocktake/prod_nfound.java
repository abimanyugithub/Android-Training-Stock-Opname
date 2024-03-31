package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class prod_nfound extends AppCompatActivity {
    String content;
    String namafile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prod_nfound);
        content="file:///android_asset/ms_pro_notfo.htm";
        WebView wv;
        wv=(WebView)findViewById(R.id.webView10);
        WebSettings webSettings=wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(prod_nfound.this, menu_mslh.class);
        startActivity(a);
        finish();
    }
}