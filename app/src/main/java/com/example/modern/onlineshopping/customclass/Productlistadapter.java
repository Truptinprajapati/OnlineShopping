package com.example.modern.onlineshopping.customclass;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.modern.onlineshopping.R;
import com.example.modern.onlineshopping.pojo.Pojoproductlist;

import java.util.List;

/**
 * Created by Lenovo on 26-03-2017.
 */
public class Productlistadapter  extends BaseAdapter{
   private Context context;
   private LayoutInflater inflater;
   private List<Pojoproductlist.ProductListBean> prlist;


    public Productlistadapter(Context context, List<Pojoproductlist.ProductListBean> productListBeen) {

        this.context=context;
        this.prlist=productListBeen;

    }

    @Override
    public int getCount() {
        return prlist.size();
    }

    @Override
    public Object getItem(int position) {
        return prlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class Holder
    {
        TextView pname;
        ImageView pimg;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder  hd=new Holder();

        if (inflater == null)
            inflater =(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView=inflater.inflate(R.layout.productlistcustomadapter,null);
        hd.pname=(TextView)convertView.findViewById(R.id.productname);
        hd.pimg=(ImageView)convertView.findViewById(R.id.productimg);

        String prodname=prlist.get(position).getProductName().toString();
        int prodimg= new Integer(prlist.get(position).getProductImage().toString());

//        Intent intent = getIntent();
//
//                       String s1 =  intent.getStringExtra(prlist.get(position).toString());


        hd.pname.setText(prodname);
        hd.pimg.setImageResource(prodimg);

        Log.d("myapp",prlist.get(position).getProductName());
        return null;



    }


}
