package com.bunkware.myapplication.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.bunkware.myapplication.Adapter.MenuAdapter;
import com.bunkware.myapplication.Objects.CafeMenuItem;
import com.bunkware.myapplication.R;

import java.util.ArrayList;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list_activity);

        //Instead what we would do is create an array of objects type CafeMenuItem that containted a bunch of information.
        //We would of course populate this with a database call that got the items from the database.
        final ArrayList<CafeMenuItem> cafeItems = new ArrayList<>();
        ListAdapter listAdapter = new MenuAdapter(this, cafeItems);
        ListView listView = (ListView) findViewById(R.id.menuList);
        listView.setAdapter(listAdapter);


                listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long itemId) {
                       CafeMenuItem selectedItem = cafeItems.get(position);
                       Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                       intent.putExtra("itemInfo", selectedItem);
                       startActivity(intent);
                    }
                }
        );
    }



}