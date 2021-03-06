package com.example.a10118340_uts_akb_if8;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

/*
    Tanggal         : 06/06/2021
    NIM             : 10118340
    Nama            : Muhammad Umar Al Fajar
    Kelas           : IF8
    Matakuliah      : Aplikasi Komputasi Bergerak
*/

public class SplashActivity extends AppCompatActivity {

    private int waktu_loading=2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent welcome=new Intent(SplashActivity.this, Welcome.class);
                startActivity(welcome);
                finish();

            }
        },waktu_loading);
    }
}
