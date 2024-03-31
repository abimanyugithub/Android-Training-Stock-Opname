package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class bantuan extends AppCompatActivity implements View.OnClickListener{
    Button B1,B2,B3,B4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bantuan);
        B1 = (Button) findViewById(R.id.bt_kalk);
        B2 = (Button) findViewById(R.id.bt_upgrd);
        B3 = (Button) findViewById(R.id.bt_tntg);
        B4 = (Button) findViewById(R.id.bt_me);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_kalk:
                final Animation animskala = AnimationUtils.loadAnimation(this, R.anim.skala);
                B1.startAnimation(animskala);
                Intent a = new Intent(bantuan.this, kalkulator_gen.class);
                startActivity(a);
                bantuan.this.finish();
                break;
            case R.id.bt_tntg:
                final Animation animskala3 = AnimationUtils.loadAnimation(this, R.anim.skala);
                B3.startAnimation(animskala3);
                Intent c = new Intent(bantuan.this, about_me.class);
                startActivity(c);
                bantuan.this.finish();
                break;
            case R.id.bt_upgrd:
                final Animation animskala2 = AnimationUtils.loadAnimation(this, R.anim.skala);
                B2.startAnimation(animskala2);
                Intent b = new Intent(bantuan.this, my_web.class);
                startActivity(b);
                bantuan.this.finish();
                break;
            case R.id.bt_me:
                final Animation animskala4 = AnimationUtils.loadAnimation(this, R.anim.skala);
                B3.startAnimation(animskala4);
                Intent d = new Intent(bantuan.this, cari_saya.class);
                startActivity(d);
                bantuan.this.finish();
                break;
        }
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(bantuan.this, list_menu.class);
        startActivity(a);
        finish();
    }
}
