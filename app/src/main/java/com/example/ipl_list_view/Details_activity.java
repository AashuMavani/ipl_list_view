package com.example.ipl_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_activity extends AppCompatActivity {
    ImageView image;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        image=findViewById(R.id.image);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);


            int position=getIntent().getIntExtra("position",0);
            String[] name = getIntent().getStringArrayExtra("titlearr");
            String[] id = getIntent().getStringArrayExtra("idarr");
            int[] img = getIntent().getIntArrayExtra("imgarr");

            image.setImageResource(img[position]);
            t1.setText(name[position]);
            t2.setText(id[position]);




    }
}