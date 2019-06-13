package com.bunkware.myapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bunkware.myapplication.Objects.CafeMenuItem;
import com.bunkware.myapplication.R;

import java.util.ArrayList;

public class MenuAdapter extends ArrayAdapter<CafeMenuItem> {

    public MenuAdapter(@NonNull Context context, ArrayList<CafeMenuItem> foods) {
        super(context, R.layout.menu_row ,foods);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater menuInflater = LayoutInflater.from(getContext());
        View menuView =  menuInflater.inflate(R.layout.menu_row, parent, false);

        CafeMenuItem singleFoodItem = getItem(position);


        //TODO: Consider making this one textview instead of two seperate text views: Make it something like
        //TODO: Ham and Cheese Sandwhich: Its a sandwhich, made of ham.....and cheese

        TextView menuText =  menuView.findViewById(R.id.item_name_text);
        TextView itemprice =  menuText.findViewById(R.id.menu_item_price);


        ImageView menuImage = menuView.findViewById(R.id.menu_row_imageView);


        menuText.setText(singleFoodItem.getItemName() + ": " + singleFoodItem.getItemDesc());
        itemprice.setText("$" + String.valueOf(singleFoodItem.getPrice()));
        menuImage.setImageResource(R.drawable.ic_launcher_background);

        return menuView;
    }
}
