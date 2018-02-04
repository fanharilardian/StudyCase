package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // buat variabel intent untuk menampung intent yang sudah diberikan dari main activity
        Intent intent = getIntent();
        // buat variabel yang menampung jumlah uang saya sebanyak 65500
        int UANGSAYA = 65500;
        // buat variabeL yang menampung data yang dikirimkan dari main activity dan di simpan di intent
        String UDUK = intent.getStringExtra("MENU");
        String PORSI = intent.getStringExtra("PORSI");
        String NAMATEMPATMAKAN = intent.getStringExtra("TEMPATMAKAN");
        // tampung isi dari variabel PORSI dalam bentuk integer dari String
        int porsinya = Integer.parseInt(PORSI);

        // kalau isi dari NAMATEMPATMAKAN itu sama dengan 'EatBus'
        if (NAMATEMPATMAKAN.equalsIgnoreCase("Eatbus")) {
            // harga nasi uduk di eatbus seharga 50000
            int udukEatbus = 50000;
            // buat perhitungan total bayar dengan mengalikan harga uduk eatbus dengan porsi yang dipesan
            int TOTALBAYAR = porsinya * udukEatbus;
            // variabel untuk menampung harga yang harus dibayarkan dari data bertipe int TOTALBAYAR yang diubah menjadi String oleh baris dibawah ini
            String hargaBayar = String.valueOf(TOTALBAYAR);

            // kalau  yang harus dibayarkan itu lebih mahal dari uang yang kita punya :
            if (TOTALBAYAR > UANGSAYA) {
                //buat variabel bertipe textview untuk mengambil data dari field
                TextView tampilanNasiUduk = (TextView) findViewById(R.id.fieldNasiUduk);
                TextView tampilanJumlahPorsi = (TextView) findViewById(R.id.fieldDuaPorsi);
                TextView denganMilea = (TextView) findViewById(R.id.txtDenganMilea);
                TextView tampilanHargaBayar = (TextView) findViewById(R.id.txtHargaBayar);

                // atur variabel yang sudah dibuat itu dengan isi dari parameternya
                tampilanNasiUduk.setText(UDUK);
                tampilanJumlahPorsi.setText(PORSI);
                denganMilea.setText(NAMATEMPATMAKAN);
                tampilanHargaBayar.setText(hargaBayar);

                //berikannotifikasi
                String NOTIFIKASI = "Jangan makan malam disini uang kamu tidak cukup";
                Toast TOASTNYA = Toast.makeText(this, NOTIFIKASI, Toast.LENGTH_LONG);
                TOASTNYA.show();
            } else {
                TextView tampilanNasiUduk = (TextView) findViewById(R.id.fieldNasiUduk);
                TextView tampilanJumlahPorsi = (TextView) findViewById(R.id.fieldDuaPorsi);
                TextView denganMilea = (TextView) findViewById(R.id.txtDenganMilea);
                TextView tampilanHargaBayar = (TextView) findViewById(R.id.txtHargaBayar);

                tampilanNasiUduk.setText(UDUK);
                tampilanJumlahPorsi.setText(PORSI);
                denganMilea.setText(NAMATEMPATMAKAN);
                tampilanHargaBayar.setText(hargaBayar);

                String NOTIFIKASI = "Makan malamnya disini saja";
                Toast TOASTNYA = Toast.makeText(this, NOTIFIKASI, Toast.LENGTH_LONG);
                TOASTNYA.show();
            }

        }
        // tapi kalau NAMATEMPATMAKAN sama dengan 'Abnormal' maka lakukan kondisi di bawah ini
        else if (NAMATEMPATMAKAN.equalsIgnoreCase("Abnormal")) {
            int udukAbnormal = 30000;
            int TOTALBAYAR = porsinya * udukAbnormal;
            String hargaBayar = String.valueOf(TOTALBAYAR);

            if (TOTALBAYAR > UANGSAYA) {

                TextView tampilanNasiUduk = (TextView) findViewById(R.id.fieldNasiUduk);
                TextView tampilanJumlahPorsi = (TextView) findViewById(R.id.fieldDuaPorsi);
                TextView denganMilea = (TextView) findViewById(R.id.txtDenganMilea);
                TextView tampilanHargaBayar = (TextView) findViewById(R.id.txtHargaBayar);

                tampilanNasiUduk.setText(UDUK);
                tampilanJumlahPorsi.setText(PORSI);
                denganMilea.setText(NAMATEMPATMAKAN);
                tampilanHargaBayar.setText(hargaBayar);

                String NOTIFIKASI = "Jangan makan malam disini uang kamu tidak cukup";
                Toast TOASTNYA = Toast.makeText(this, NOTIFIKASI, Toast.LENGTH_LONG);
                TOASTNYA.show();
            } else {
                TextView tampilanNasiUduk = (TextView) findViewById(R.id.fieldNasiUduk);
                TextView tampilanJumlahPorsi = (TextView) findViewById(R.id.fieldDuaPorsi);
                TextView denganMilea = (TextView) findViewById(R.id.txtDenganMilea);
                TextView tampilanHargaBayar = (TextView) findViewById(R.id.txtHargaBayar);

                tampilanNasiUduk.setText(UDUK);
                tampilanJumlahPorsi.setText(PORSI);
                denganMilea.setText(NAMATEMPATMAKAN);
                tampilanHargaBayar.setText(hargaBayar);

                String NOTIFIKASI = "Makan malamnya disini saja";
                Toast TOASTNYA = Toast.makeText(this, NOTIFIKASI, Toast.LENGTH_LONG);
                TOASTNYA.show();
            }
        }

    }

}