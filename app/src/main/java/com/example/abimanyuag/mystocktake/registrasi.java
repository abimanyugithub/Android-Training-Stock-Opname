package com.example.abimanyuag.mystocktake;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registrasi extends AppCompatActivity implements View.OnClickListener{
    Button Bskip,BtnSend;
    EditText nama,nrp;
    ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrasi);
        Bskip = (Button) findViewById(R.id.btskip);
        BtnSend=(Button)findViewById(R.id.btdaf);
        nama=(EditText)findViewById(R.id.txname);
        nrp=(EditText)findViewById(R.id.txnrp);
        Bskip.setOnClickListener(this);
        BtnSend.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btskip:
                Intent a=new Intent(registrasi.this,list_menu.class);
                startActivity(a);
                registrasi.this.finish();
                break;
            case R.id.btdaf:
                TelephonyManager tm=(TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
                String IMEINumber=tm.getDeviceId();
                String SIMSerialNumber=tm.getSimSerialNumber();
                String varname=nama.getText().toString();
                String nohp1="+6289695887793";
                if (varname.matches("")){
                    Toast.makeText(getApplicationContext(), "nama kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                String var =nrp.getText().toString();
                if (var.matches("")){
                    Toast.makeText(getApplicationContext(), "nrp kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                sendSMS(nohp1,var+" - "+varname+", IMEI - "+IMEINumber+", SIM Serial - "+SIMSerialNumber);
                Toast.makeText(getApplicationContext(), "Mendaftarkan", Toast.LENGTH_SHORT).show();
                Intent b=new Intent(registrasi.this,list_menu.class);
                startActivity(b);
                registrasi.this.finish();
                break;
        }

    }
    private void sendSMS(String phoneNumber, String message)
    {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, null, null);
    }}

