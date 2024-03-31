package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class rsv_slhbrg extends AppCompatActivity {
    String content;
    String namafile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsv_slhbrg);
        content="file:///android_asset/ms_slh_prod_rsv.htm";
        WebView wv;
        wv=(WebView)findViewById(R.id.webView8);
        WebSettings webSettings=wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(rsv_slhbrg.this, menu_mslh.class);
        startActivity(a);
        finish();
    }
}