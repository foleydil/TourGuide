package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShowsFragment extends Fragment {


    public ShowsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

//        Create ArrayList of "Shows" items
        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(getString(R.string.shows_name_comerica), "Description",
                "Website", R.drawable.comerica));
        listItems.add(new ListItem(getString(R.string.shows_name_fillmore), "Description",
                "Website", R.drawable.fillmore));
        listItems.add(new ListItem(getString(R.string.shows_name_fisher), "Description",
                "Website", R.drawable.fisher));
        listItems.add(new ListItem(getString(R.string.shows_name_ford), "Description",
                "Website", R.drawable.ford));
        listItems.add(new ListItem(getString(R.string.shows_name_fox), "Description",
                "Website", R.drawable.fox));
        listItems.add(new ListItem(getString(R.string.shows_name_little), "Description",
                "Website", R.drawable.little));
        listItems.add(new ListItem(getString(R.string.shows_name_masonic), "Description",
                "Website", R.drawable.masonic));
        listItems.add(new ListItem(getString(R.string.shows_name_opera), "Description",
                "Website", R.drawable.opera));
        listItems.add(new ListItem(getString(R.string.shows_name_standrews), "Description",
                "Website", R.drawable.standrews));

//        Hook up adapter
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
