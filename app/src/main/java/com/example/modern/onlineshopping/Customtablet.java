package com.example.modern.onlineshopping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lenovo on 23-02-2017.
 */
public class Customtablet extends BaseAdapter {
    Context context;
    String[] tname;
    int[] timg;


    public Customtablet(Context context, String[] tname, int[] timg) {
        this.context=context;
        this.timg=timg;
        this.tname=tname;

    }

    @Override
    public int getCount() {
        return tname.length;
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
        TextView tname;
        ImageView timg;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();
        convertView= LayoutInflater.from(context).inflate(R.layout.navicustomtablet,parent,false);
        holder.tname=(TextView)convertView.findViewById(R.id.tabname);
        holder.timg=(ImageView)convertView.findViewById(R.id.tabimg);

        holder.tname.setText(tname[position]);
        holder.timg.setImageResource(timg[position]);



        return convertView;
    }
}
