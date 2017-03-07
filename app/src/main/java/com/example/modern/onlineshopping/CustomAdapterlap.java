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
public class CustomAdapterlap extends BaseAdapter {

    Context context;
    String[] laptoplist;
    int[] laptopimg;

    public CustomAdapterlap(Context context, String[] laptoplist, int[] laptopimg) {
        this.context=context;
        this.laptoplist=laptoplist;
        this.laptopimg=laptopimg;

    }

    @Override
    public int getCount() {
        return laptoplist.length;
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
        TextView lname;
        ImageView limg;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();

            convertView= LayoutInflater.from(context).inflate(R.layout.navicustomlaptop,parent,false);
                    holder.lname=(TextView)convertView.findViewById(R.id.lapname);
                    holder.limg=(ImageView)convertView.findViewById(R.id.lapimg);

                holder.lname.setText(laptoplist[position]);
                holder.limg.setImageResource(laptopimg[position]);


        return convertView;
    }
}




