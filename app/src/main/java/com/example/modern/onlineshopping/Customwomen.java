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
public class Customwomen extends BaseAdapter{
    Context context;
    String[] wlist;
    int[] wimg;

    public Customwomen(Context context, String[] wlist, int[] wimg) {
        this.context=context;
        this.wlist=wlist;
        this.wimg=wimg;

    }

    @Override
    public int getCount() {
        return wlist.length;
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
        TextView wname;
        ImageView wimgs;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();

        convertView= LayoutInflater.from(context).inflate(R.layout.navicustomwomen,parent,false);

        holder.wname=(TextView)convertView.findViewById(R.id.womenname);
        holder.wimgs=(ImageView)convertView.findViewById(R.id.womenimg);


        holder.wimgs.setImageResource(wimg[position]);
        holder.wname.setText(wlist[position]);
        return convertView;
    }
}
