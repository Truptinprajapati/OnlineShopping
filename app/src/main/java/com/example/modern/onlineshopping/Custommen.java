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
public class Custommen extends BaseAdapter {
    Context context;
    String[] mname;
    int[] mimg;

    public Custommen(Context context, String[] mname, int[] mimg) {

        this.context=context;
        this.mname=mname;
        this.mimg=mimg;
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
public class Holder
{
    TextView memname;
    ImageView memimg;

}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();

        convertView= LayoutInflater.from(context).inflate(R.layout.navicustommen,parent,false);
        holder.memname=(TextView)convertView.findViewById(R.id.men_txt);
        holder.memimg=(ImageView)convertView.findViewById(R.id.men_img);

        holder.memname.setText(mname[position]);
        holder.memimg.setImageResource(mimg[position]);

        return convertView;
    }
}
