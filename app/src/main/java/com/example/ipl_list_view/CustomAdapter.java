package com.example.ipl_list_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Listview_activity listview_activity;
    int[] img;
    String[] name;
    String[] id;

    public CustomAdapter(Listview_activity listview_activity, int[] img, String[] name, String[] id) {
        this.listview_activity = listview_activity;
        this.img = img;
        this.name = name;
        this.id = id;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = LayoutInflater.from(listview_activity).inflate(R.layout.name_listview, parent, false);
        ImageView imgarr = view.findViewById(R.id.img);
        TextView txt1 = view.findViewById(R.id.title);
        TextView txt2 = view.findViewById(R.id.subtitle);

            imgarr.setImageResource(img[position]);
            txt1.setText("" + name[position]);
            txt2.setText("" + id[position]);

        return view;
    }
}
