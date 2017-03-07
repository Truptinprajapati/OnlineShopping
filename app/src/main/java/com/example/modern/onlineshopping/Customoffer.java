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
public class Customoffer extends BaseAdapter {
    Context context;
    String[] offerpname;
    int[] offerpimg;

    public Customoffer(Context context, String[] offerpname, int[] offerspimg) {

        this.context=context;
        this.offerpname=offerpname;
        this.offerpimg=offerspimg;
    }

    @Override
    public int getCount() {
        return offerpname.length;
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
        ImageView of_img;
        TextView of_name;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();
        convertView= LayoutInflater.from(context).inflate(R.layout.navicustomoffer,parent,false);
        holder.of_img=(ImageView)convertView.findViewById(R.id.offimg);
        holder.of_name=(TextView)convertView.findViewById(R.id.offname);
        holder.of_name.setText(offerpname[position]);
        holder.of_img.setImageResource(offerpimg[position]);

        return convertView;
    }
}
