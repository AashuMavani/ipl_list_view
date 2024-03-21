package com.example.ipl_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listview_activity extends AppCompatActivity {
    ListView listView;
    int[] imgcsk = {R.drawable.ms_dhoni, R.drawable.ruturaj, R.drawable.c_hari, R.drawable.deepak_chahar,
            R.drawable.mitchell, R.drawable.moeen, R.drawable.mukesh, R.drawable.n_jagadeesan,
            R.drawable.ravindra_jadeja, R.drawable.shivam, R.drawable.tushar};
    String[] namecsk = {"Ms dhoni(c)", "Ruturaj", "C hari", "Deepak chahar", "Mitchell", "Moeen", "Mukesh", "N jagadeesan", "Ravindra jadeja", "Shivam", "Tushar"};
    String[] idcsk = {"Batsman", "Batsman", "Batsman", "Boller", "Allrundor", "Allrundor", "Boller", "Batsman", "Allrundor", "Allrundor", "Boller"};
    int[] imgmi = {R.drawable.rohit, R.drawable.anmolpreet, R.drawable.rahul, R.drawable.surya,
            R.drawable.aryan, R.drawable.ishan, R.drawable.arjun, R.drawable.basil,
            R.drawable.jaydev, R.drawable.sanjay, R.drawable.ramandeep};
    String[] namemi = {"Rohit shrma(c)", "Anmolpreet", "Rahul", "Surya", "Aryan", "Ishan", "Arjun", "Basil", "Jaydev", "Sanjay", "Ramandeep"};
    String[] idmi = {"Batsman", "Batsman", "Batsman", "Batsman", "Batsman", "Batsman", "Allrundor", "Boller", "Boller", "Allrundor", "Allrundor"};
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.listview);



       String team=getIntent().getStringExtra("team");
       if(team.equals("csk"))
       {
           adapter = new CustomAdapter(Listview_activity.this, imgcsk, namecsk, idcsk);
       }
       else
       {
           adapter = new CustomAdapter(Listview_activity.this, imgmi, namemi, idmi);
       }
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Listview_activity.this, Details_activity.class);
                if(team.equals("csk"))
                {
                    intent.putExtra("position", position);
                    intent.putExtra("imgarr", imgcsk);
                    intent.putExtra("titlearr", namecsk);
                    intent.putExtra("idarr", idcsk);
                }
                else
                {
                    intent.putExtra("position", position);
                    intent.putExtra("imgarr", imgmi);
                    intent.putExtra("titlearr", namemi);
                    intent.putExtra("idarr", idmi);
                }
               startActivity(intent);
            }

        });


    }
}