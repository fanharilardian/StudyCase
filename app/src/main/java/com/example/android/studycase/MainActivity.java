package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Membuat variabel LOG_TAG untuk memberikan notifikasi pada logcat agar kita tahu apakah tomboL sudah di klik atau belum
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    // membuat variabel bertipe TextView agar dapat diisi dengan data dari TextView
    private TextView menuUduk;
    private TextView duaPorsi;

    // membuat variabel private yang bertipe button agar dapat disi dengan data bertipe button
    private Button TombolEatbus;
    private Button TombolAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buat varibel untuk menampung dari yang kita inputkan dari field nasi uduk dan field poris
        menuUduk = (TextView) findViewById(R.id.fieldNasiUduk);
        duaPorsi = (TextView) findViewById(R.id.fieldDuaPorsi);
        // variabel untuk menampung nama tombol agar sesuati dengan nama tempat makan di second activity
        TombolEatbus = (Button) findViewById(R.id.eatbusTombol);
        TombolAbnormal = (Button) findViewById(R.id.abnormalTombol);
    }

    public void metodEatbus(View view) {
        // buat pernyataan log.d agar dapat memberitahu kita bahwa tombol eatbus telah di tap
        Log.d(LOG_TAG, "Tombol Eatbus telah di klik");
        Intent intent = new Intent(this, SecondActivity.class);

        String namaTempatMakan = TombolEatbus.getText().toString();
        String menu = menuUduk.getText().toString();
        String porsi = duaPorsi.getText().toString();

        intent.putExtra("MENU", menu);
        intent.putExtra("PORSI", porsi);
        intent.putExtra("TEMPATMAKAN", namaTempatMakan);
        startActivity(intent);
    }

    public void metodAbnormal(View view) {
        // buat pernyataan log.d agar dapat memberitahu kita bahwa tombol abnormal telah di tap
        Log.d(LOG_TAG, "Tombol Abnormal telah di klik");
        Intent intent = new Intent(this, SecondActivity.class);


        String namaTempatMakan = TombolAbnormal.getText().toString();
        String menu = menuUduk.getText().toString();
        String porsi = duaPorsi.getText().toString();

        intent.putExtra("MENU", menu);
        intent.putExtra("PORSI", porsi);
        intent.putExtra("TEMPATMAKAN", namaTempatMakan);
        startActivity(intent);
    }
}

