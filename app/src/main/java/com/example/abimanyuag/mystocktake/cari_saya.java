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

public class cari_saya extends AppCompatActivity implements View.OnClickListener {
    Button B1;
    EditText bantu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cari_saya);
        B1 = (Button) findViewById(R.id.bt_req);
        bantu = (EditText) findViewById(R.id.send_loc);
        B1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_req:
                TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
                String IMEINumber = tm.getDeviceId();
                String SIMSerialNumber = tm.getSimSerialNumber();
                String varloc = bantu.getText().toString();
                if (varloc.matches("")) {
                    Toast.makeText(getApplicationContext(), "alamat kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                sendSMS("+6289695887793"," meminta bantuan di lokasi "+ varloc +" , IMEI - " + IMEINumber + " , SIMSerial - " + SIMSerialNumber);
                Toast.makeText(getApplicationContext(), "Meminta", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    private void sendSMS(String phoneNumber, String message) {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, null, null);
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(cari_saya.this, bantuan.class);
        startActivity(a);
        finish();
    }
}