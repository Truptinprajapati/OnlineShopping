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
public class Customhomelight extends BaseAdapter {
    Context context;
    String[] lname;
    int[] limg;


    public Customhomelight(Context context, String[] lname, int[] limg) {

        this.context=context;
        this.lname=lname;
        this.limg=limg;
    }

    @Override
    public int getCount() {
        return lname.length;
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
        ImageView hdlimg;
        TextView hdlname;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        Holder holder=new Holder();

        convertView=LayoutInflater.from(context).inflate(R.layout.navicustomlight,parent,false);
        holder.hdlname=(TextView)convertView.findViewById(R.id.hlname);
        holder.hdlimg=(ImageView)convertView.findViewById(R.id.hlimg);

        holder.hdlname.setText(lname[position]);
        holder.hdlimg.setImageResource(limg[position]);



        return convertView;
    }
}
