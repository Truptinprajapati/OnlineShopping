package com.example.modern.onlineshopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    int[] productimage=new int[]{R.drawable.mobile,R.drawable.lap,R.drawable.ntablet,R.drawable.kitchen,
            R.drawable.pendrive,R.drawable.girlsdress,R.drawable.girlsbracelet,R.drawable.girlswatches,R.drawable.boyspurse,
            R.drawable.boyswatches};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        String[] proudtname=getResources().getStringArray(R.array.product);

        final ListView productlist=(ListView)findViewById(R.id.productlist);

        CustomAdapter adapter=new CustomAdapter(this,proudtname,productimage);
        productlist.setAdapter(adapter);


        productlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item=parent.getItemAtPosition(position).toString();

                switch (position){
                    case 0:
                        Intent i=new Intent(Navigation.this,Navimoblist.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent intent=new Intent(Navigation.this,Navilaptoplist.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intent1=new Intent(Navigation.this,Navitabletlist.class);
                        startActivity(intent1);
                        break;
                    case 3:
                        Intent intent2=new Intent(Navigation.this,Navikids.class);
                        startActivity(intent2);
                        break;
                    case 4:
                        Intent intent3=new Intent(Navigation.this,Navilaptoplist.class);
                        startActivity(intent3);
                        break;
                    case 5:
                        Intent intent4=new Intent(Navigation.this,Naviwomen.class);
                        startActivity(intent4);
                        break;
                    case 6:
                        Intent intent5=new Intent(Navigation.this,Naviwomen.class);
                        startActivity(intent5);
                        break;
                    case 7:
                        Intent intent6=new Intent(Navigation.this,Naviwomen.class);
                        startActivity(intent6);
                        break;
                    case 8:
                        Intent intent7=new Intent(Navigation.this,Navimen.class);
                        startActivity(intent7);
                        break;
                    case 9:
                        Intent intent8=new Intent(Navigation.this,Navimen.class);
                        startActivity(intent8);
                        break;
                }

            }
        });





        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        MenuItem menuItem = navigationView.getMenu().getItem(3);
        Toast.makeText(this, ""+navigationView.getMenu().getItem(3), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menucart) {
            return true;
        }


        if(id == R.id.login_signup){
            Intent i=new Intent(Navigation.this,Login.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle Navigation view item clicks here.
        int id = item.getItemId();


//        if(id ==R.id.ele_title){
//            setTitleColor(Color.RED);
//
//
//        }
//



        if (id == R.id.nav_mob) {

            Toast.makeText(getApplicationContext(),"Mobile",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(Navigation.this,Navimoblist.class);
            startActivity(i);
        }
        else if (id == R.id.nav_lap) {
            Intent i=new Intent(Navigation.this,Navilaptoplist.class);
            startActivity(i);

            Toast.makeText(getApplicationContext(),"Laptop",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_tab) {
            Intent i=new Intent(Navigation.this,Navitabletlist.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"Tablet",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.nav_men) {
            Intent i=new Intent(Navigation.this,Navimen.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"Men",Toast.LENGTH_SHORT).show();
        }
     else if (id == R.id.nav_women) {
            Intent i=new Intent(Navigation.this,Naviwomen.class);
            startActivity(i);
        Toast.makeText(getApplicationContext(),"women",Toast.LENGTH_SHORT).show();
    }
        else if (id == R.id.nav_kidss) {
            Intent isd=new Intent(Navigation.this,Navikids.class);
            startActivity(isd);
        Toast.makeText(getApplicationContext(),"kids",Toast.LENGTH_SHORT).show();
    }

        else if (id == R.id.nav_kitchen) {
             Toast.makeText(getApplicationContext(),"Kitchen daining",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(Navigation.this,Kitchen_dining.class);
            startActivity(i);
        }

         else if (id == R.id.nav_lightinng) {
            Toast.makeText(getApplicationContext(),"Lighting",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(Navigation.this,Navilighting.class);
            startActivity(i);

        }

        else if (id == R.id.nav_offers) {
            Toast.makeText(getApplicationContext(),"offer",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(Navigation.this,Navioffers.class);
            startActivity(i);

        }



        else if (id == R.id.nav_myorder) {
            Toast.makeText(getApplicationContext(),"MyOrder",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_myaccount) {
            Toast.makeText(getApplicationContext(),"Myaccount",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.nav_logout) {

            getSharedPreferences("testpref",MODE_PRIVATE).edit().clear().apply();
            Intent intent = new Intent(Navigation.this,Login.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
