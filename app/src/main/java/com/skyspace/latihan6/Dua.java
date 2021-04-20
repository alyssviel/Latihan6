package com.skyspace.latihan6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Dua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        //ambil pesan dari intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //buat text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        //jadikan textview sbg the activity layout
        setContentView(textView);
    }
}