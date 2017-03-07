package com.example.modern.onlineshopping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lenovo on 24-02-2017.
 */
public class CustomKitechendining extends BaseAdapter{

    Context context;
    String[] kdiningname;
    int[] kdiningimg;

    public CustomKitechendining(Context context, String[] kdiningname, int[] kdiningimg) {
    this.context=context;
        this.kdiningname=kdiningname;
        this.kdiningimg=kdiningimg;

    }

    @Override
    public int getCount() {
        return kdiningname.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder
    {
        TextView kdname;
        ImageView kdimg;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();
        convertView= LayoutInflater.from(context).inflate(R.layout.navicustomkitchen,parent,false);
        holder.kdname=(TextView)convertView.findViewById(R.id.kname);
        holder.kdimg=(ImageView)convertView.findViewById(R.id.kimg);

        holder.kdname.setText(kdiningname[position]);
        holder.kdimg.setImageResource(kdiningimg[position]);

        return convertView;
    }
}
