package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dillon on 11/13/2016.
 * Adapter to generate list view of each list item for a given fragment
 */

public class ListItemAdapter extends ArrayAdapter<ListItem> {

    public ListItemAdapter(Activity context, ArrayList<ListItem> listItems){
        super(context, 0, listItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being used, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final ListItem currentItem = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        nameTextView.setText(currentItem.getmName());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.item_desc);
        descTextView.setText(currentItem.getmDescription());

        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.item_site);
        websiteTextView.setText(currentItem.getmWebsite());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentItem.getmImageResourceID());

        return listItemView;
    }
}
