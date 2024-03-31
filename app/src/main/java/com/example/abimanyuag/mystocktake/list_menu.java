package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class list_menu extends AppCompatActivity implements View.OnClickListener {
    Button B1,B2,B3,B4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_menu);

        B1 = (Button) findViewById(R.id.btst_about);
        B2 = (Button) findViewById(R.id.btrf);
        B3 = (Button) findViewById(R.id.btmaslah);
        B4 = (Button) findViewById(R.id.btbant);

        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btst_about:
                final Animation animRotate= AnimationUtils.loadAnimation(this, R.anim.skala);
                B1.startAnimation(animRotate);
                Intent a = new Intent(list_menu.this, tentang_st.class);
                startActivity(a);
                list_menu.this.finish();
                break;
            case R.id.btrf:
                final Animation animRotate1= AnimationUtils.loadAnimation(this, R.anim.skala);
                B2.startAnimation(animRotate1);
                Intent b = new Intent(list_menu.this, menu_rf.class);
                startActivity(b);
                list_menu.this.finish();
                break;
            case R.id.btmaslah:
                final Animation animRotate2= AnimationUtils.loadAnimation(this, R.anim.skala);
                B3.startAnimation(animRotate2);
                Intent c = new Intent(list_menu.this, menu_mslh.class);
                startActivity(c);
                list_menu.this.finish();
                break;
            case R.id.btbant:
                final Animation animRotate3= AnimationUtils.loadAnimation(this, R.anim.skala);
                B4.startAnimation(animRotate3);
                Intent d = new Intent(list_menu.this, bantuan.class);
                startActivity(d);
                list_menu.this.finish();
                break;}
}}
