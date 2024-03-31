package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class tentang_st extends AppCompatActivity {
        String content;
        String namafile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang_st);
        content="file:///android_asset/mengenaistocktake.html";
        WebView wv;
        wv=(WebView)findViewById(R.id.webView);
        WebSettings webSettings=wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
    }
    @Override
    public void onBackPressed(){
        Intent a=new Intent(tentang_st.this,list_menu.class);
        startActivity(a);
        finish();
    }
}
