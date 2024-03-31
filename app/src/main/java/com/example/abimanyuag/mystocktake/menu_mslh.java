package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class menu_mslh extends AppCompatActivity implements View.OnClickListener{
    Button B1,B2,B3,B4,B5,B6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_mslh);
        B1 = (Button) findViewById(R.id.bt_krg);
        B2 = (Button) findViewById(R.id.bt_lbihplu);
        B3 = (Button) findViewById(R.id.bt_slhslot);
        B4 = (Button) findViewById(R.id.bt_slhresv);
        B5 = (Button) findViewById(R.id.bt_ksg);
        B6 = (Button) findViewById(R.id.bt_ntfnd);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        B6.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_krg:
                final Animation anim1= AnimationUtils.loadAnimation(this, R.anim.skala);
                B1.startAnimation(anim1);
                Intent a = new Intent(menu_mslh.this, krgbrg_packsize.class);
                startActivity(a);
                menu_mslh.this.finish();
                break;
            case R.id.bt_lbihplu:
                final Animation anim2= AnimationUtils.loadAnimation(this, R.anim.skala);
                B2.startAnimation(anim2);
                Intent b = new Intent(menu_mslh.this, brglbh_item.class);
                startActivity(b);
                menu_mslh.this.finish();
                break;
            case R.id.bt_slhslot:
                final Animation anim3= AnimationUtils.loadAnimation(this, R.anim.skala);
                B3.startAnimation(anim3);
                Intent c = new Intent(menu_mslh.this, slot_slhbrg.class);
                startActivity(c);
                menu_mslh.this.finish();
                break;
            case R.id.bt_slhresv:
                final Animation anim4= AnimationUtils.loadAnimation(this, R.anim.skala);
                B4.startAnimation(anim4);
                Intent d = new Intent(menu_mslh.this, rsv_slhbrg.class);
                startActivity(d);
                menu_mslh.this.finish();
                break;
            case R.id.bt_ksg:
                final Animation anim5= AnimationUtils.loadAnimation(this, R.anim.skala);
                B5.startAnimation(anim5);
                Intent e = new Intent(menu_mslh.this, lok_kosong.class);
                startActivity(e);
                menu_mslh.this.finish();
                break;
            case R.id.bt_ntfnd:
                final Animation anim6= AnimationUtils.loadAnimation(this, R.anim.skala);
                B6.startAnimation(anim6);
                Intent f = new Intent(menu_mslh.this, prod_nfound.class);
                startActivity(f);
                menu_mslh.this.finish();
                break;
        }}
    @Override
    public void onBackPressed(){
        Intent a=new Intent(menu_mslh.this,list_menu.class);
        startActivity(a);
        finish();
    }}
