package com.example.abimanyuag.mystocktake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class menu_rf extends AppCompatActivity implements View.OnClickListener{
    Button B1,B2,B3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_rf);
        B1 = (Button) findViewById(R.id.btlogrf);
        B2 = (Button) findViewById(R.id.btscanslotrf);
        B3 = (Button) findViewById(R.id.btscanrsvrf);

        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btlogrf:
                final Animation ngeblur= AnimationUtils.loadAnimation(this, R.anim.skala);
                B1.startAnimation(ngeblur);
                Intent a = new Intent(menu_rf.this, tutor_rf.class);
                startActivity(a);
                menu_rf.this.finish();
                break;
            case R.id.btscanslotrf:
                final Animation ngeblur1= AnimationUtils.loadAnimation(this, R.anim.skala);
                B2.startAnimation(ngeblur1);
                Intent b = new Intent(menu_rf.this, scan_slot.class);
                startActivity(b);
                menu_rf.this.finish();
                break;
            case R.id.btscanrsvrf:
                final Animation ngeblur2= AnimationUtils.loadAnimation(this, R.anim.skala);
                B3.startAnimation(ngeblur2);
                Intent c = new Intent(menu_rf.this, scan_reserv.class);
                startActivity(c);
                menu_rf.this.finish();
                break;
        }
    }
    @Override
    public void onBackPressed(){
        Intent a=new Intent(menu_rf.this,list_menu.class);
        startActivity(a);
        finish();
}}
