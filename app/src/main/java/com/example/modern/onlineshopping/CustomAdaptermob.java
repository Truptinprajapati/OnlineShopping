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
public class CustomAdaptermob extends BaseAdapter {
    Context context;
    String[] mname;
    int[] mimg;

    public CustomAdaptermob(Context context, String[] mname, int[] ming) {
        this.context=context;
        this.mname=mname;
        this.mimg=ming;

    }

    @Override
    public int getCount() {
        return mname.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{
        ImageView iv;
        TextView tv;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder hd=new Holder();

        convertView= LayoutInflater.from(context).inflate(R.layout.navicustommob,parent,false);
        hd.tv=(TextView)convertView.findViewById(R.id.mobname);
        hd.iv=(ImageView)convertView.findViewById(R.id.mobimg);

        hd.iv.setImageResource(mimg[position]);
        hd.tv.setText(mname[position]);

        return convertView;
    }
}
