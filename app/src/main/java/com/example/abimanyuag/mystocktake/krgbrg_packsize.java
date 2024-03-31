package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class krgbrg_packsize extends AppCompatActivity {
    String content;
    String namafile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.krgbrg_packsize);
        content="file:///android_asset/ms_icomplet.htm";
        WebView wv;
        wv=(WebView)findViewById(R.id.webView6);
        WebSettings webSettings=wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(krgbrg_packsize.this, menu_mslh.class);
        startActivity(a);
        finish();
    }
}