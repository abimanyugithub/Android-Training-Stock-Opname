package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class kalkulator_gen extends AppCompatActivity implements View.OnClickListener {
    String content;
    String namafile;
    Button B1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator_gen);
        content="file:///android_asset/calculator.html";
        WebView wv;
        wv=(WebView)findViewById(R.id.webView13);
        WebSettings webSettings=wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
        B1 = (Button) findViewById(R.id.bt_klin);
        B1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_klin:
                Intent a = new Intent(kalkulator_gen.this, kalkulator.class);
                startActivity(a);
                kalkulator_gen.this.finish();
                break;
        }
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(kalkulator_gen.this, bantuan.class);
        startActivity(a);
        finish();
    }
}