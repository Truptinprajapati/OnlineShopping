package com.example.modern.onlineshopping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by modern on 2/16/2017.
 */
public class CustomAdapter extends BaseAdapter {
    String[] productname;
    Context context;
    int[] productimage;

    public CustomAdapter(Context context, String[] proudtname, int[] productimage) {

        this.context=context;
        this.productname=proudtname;
        this.productimage=productimage;

    }

    @Override
    public int getCount() {
        return productname.length;
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
        ImageView productimage;
        TextView productname;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();
        convertView= LayoutInflater.from(context).inflate(R.layout.productcustom,parent,false);
        holder.productimage=(ImageView)convertView.findViewById(R.id.producticon);
        holder.productname=(TextView)convertView.findViewById(R.id.productname);

        Picasso.with(context)
                .load(productimage[position])
                .resize(600,600)
                .into(holder.productimage);

        holder.productimage.setImageResource(productimage[position]);
        holder.productname.setText(productname[position]);

        return convertView;
    }
}
