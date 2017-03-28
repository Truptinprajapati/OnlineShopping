package com.example.modern.onlineshopping.customclass;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.modern.onlineshopping.R;
import com.example.modern.onlineshopping.activity.Productlist;
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


    public class Holder
    {
        TextView plist;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();


        if(inflater == null)
            inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null)
            convertView =inflater.inflate(R.layout.productcustom,null);
        holder.plist = (TextView) convertView.findViewById(R.id.prodli);

        Log.d("myapp",pjfile.get(position).getCategoryName());

String data=pjfile.get(position).getCategoryName().toString();

       // v.getContext().startActivity(new Intent(context, Productlist.class));
Log.d("myapp","data"+data);
holder.plist.setText(data);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,Productlist.class);
                i.putExtra("cat_id",position);
                context.startActivity(i);            }
        });
        return convertView;
    }
//        p.get(1).getCategoryName();
//        Pojonavigetcategorylist m = p.get(position);
//        t1.setText("UserId: "+String.valueOf(m.()));
//
//
//
//
//
//        holder.plist.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent i;
//                v.getContext().startActivity(new Intent(context, Productlist.class));
//                i.putExtra(pjfile.get(position).getCategoryName().toString());
//
//            }
//        });
//
//
//    public void onItemClick(AdapterView<?> parent, View view, int position,
//                            long id) {
//
//
//            }



}
