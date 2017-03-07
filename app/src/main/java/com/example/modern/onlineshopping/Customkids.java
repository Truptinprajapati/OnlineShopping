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
public class Customkids extends BaseAdapter {
    Context context;
    String[] kidsname;
    int[] kidsimg;

    public Customkids(Context context, String[] kidspname, int[] kidspimag) {

        this.context=context;
        this.kidsname=kidspname;
        this.kidsimg=kidspimag;
    }

    @Override
    public int getCount() {
        return kidsname.length;
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
        TextView kname;
        ImageView Kimg;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();

        convertView= LayoutInflater.from(context).inflate(R.layout.navicustomkids,parent,false);
        holder.kname=(TextView)convertView.findViewById(R.id.kpname);
        holder.Kimg=(ImageView)convertView.findViewById(R.id.kpimg);

        holder.kname.setText(kidsname[position]);
        holder.Kimg.setImageResource(kidsimg[position]);


        return convertView;
    }
}
