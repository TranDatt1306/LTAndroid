package com.example.gymapp;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class fragment_discover extends AppCompatActivity {
    TextView tv_lichtrinh, tv_home;
    ImageView img_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_discover);
        tv_lichtrinh = findViewById(R.id.tv_lichtrinh);
        img_content = findViewById(R.id.imageView2);
        tv_home = findViewById(R.id.tv_home);
        tv_lichtrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyentrangltIntent = new Intent(fragment_discover.this, fragment_lichtrinh.class);
                startActivity(chuyentrangltIntent);
            }
        });
        img_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscover1Intent = new Intent(fragment_discover.this, fragment_discover1.class);
                startActivity(ctdiscover1Intent);
            }
        });
        tv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_discover.this, trangchu.class);
                startActivity(intent);
            }
        });
        TextView tv_toi = findViewById(R.id.tv_toi);
        tv_toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_discover.this, toi.class);
                startActivity(intent);
            }
        });

    }
}