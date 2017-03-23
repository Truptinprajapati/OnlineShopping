package com.example.modern.onlineshopping;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.modern.onlineshopping.pojo.Pojonavigetcategorylist;

import java.util.List;

/**
 * Created by modern on 2/16/2017.
 */
public class CustomAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private List<Pojonavigetcategorylist.CategoryListBean>pjfile;
//    String[] productname;
//    Context context;
//    int[] productimage;
//
////    public CustomAdapter(Context context, String[] proudtname, int[] productimage) {
////
////        this.context=context;
////        this.productname=proudtname;
////        this.productimage=productimage;
////
////    }

    public CustomAdapter(Context context, List<Pojonavigetcategorylist.CategoryListBean> plist) {
        this.context=context;
        this.pjfile=plist;
    }

    @Override
    public int getCount() {
        return pjfile.size();
    }

    @Override
    public Object getItem(int position) {
        return pjfile.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


//    public class Holder
//    {
//        TextView plist;
//    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Holder holder=new Holder();



//        convertView=LayoutInflater.from(context).inflate(R.layout.productcustom,parent,false);
//
//        TextView plist=(TextView)convertView.findViewById(R.id.text);
//
////        Pojonavigetcategorylist.CategoryListBean pojolist=p.get(position);
//        plist.setText("categoryName:"+String.valueOf(p.get(position).getCategoryName()));










        if(inflater == null)
            inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null)
            convertView =inflater.inflate(R.layout.productcustom,null);
        TextView t1 = (TextView) convertView.findViewById(R.id.prodli);
        t1.setText(pjfile.get(position).getCategoryName().toString());
        Log.d("myapp",pjfile.get(position).getCategoryName());




//        p.get(1).getCategoryName();
//        Pojonavigetcategorylist m = p.get(position);
//        t1.setText("UserId: "+String.valueOf(m.()));


        return convertView;
    }
}
