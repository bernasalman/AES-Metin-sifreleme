package com.example.sifre;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView metinGoster;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metinGoster = findViewById(R.id.metin);

        //mesaj metninin şifrelenmesi
        String mesaj = "nasılsın";
        String sifreliMesaj ="";
        Sifreleme sifreleme = new Sifreleme();
        try {
            sifreliMesaj = sifreleme.encryptString(mesaj,"sifreli");
        } catch (Exception e) {
            e.printStackTrace();
        }

        metinGoster.append(mesaj+ ":\n"+ sifreliMesaj);

    }
}