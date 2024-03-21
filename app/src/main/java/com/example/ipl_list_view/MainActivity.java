package com.example.ipl_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgcsk,imgmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.imgcsk).setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,Listview_activity.class);
             intent.putExtra("team","csk");

             startActivity(intent);
        });
        findViewById(R.id.imgmi).setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,Listview_activity.class);
            intent.putExtra("team","mi");
            startActivity(intent);
        });
    }
}