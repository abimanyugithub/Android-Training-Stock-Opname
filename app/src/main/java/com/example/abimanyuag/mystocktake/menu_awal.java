package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class menu_awal extends AppCompatActivity implements View.OnClickListener{
    Button B1;
    String content;
    String namafile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_awal);
        B1 = (Button) findViewById(R.id.btmulai);
        Animation anim=new AlphaAnimation(0.0f,1.0f);
        anim.setDuration(500);
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        B1.startAnimation(anim);
        B1.setOnClickListener(this);
        content="file:///android_asset/menu_awal.html";
        WebView wv;
        wv=(WebView)findViewById(R.id.webView4);
        WebSettings webSettings=wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl(content);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btmulai:
                Intent a=new Intent(menu_awal.this,registrasi.class);
                startActivity(a);
                menu_awal.this.finish();
                break;
        }
    }
}
