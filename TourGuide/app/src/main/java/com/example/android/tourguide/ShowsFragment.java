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
        listItems.add(new ListItem(getString(R.string.shows_name_fisher), "Description",
                getString(R.string.shows_site_fisher), R.drawable.fisher));
        listItems.add(new ListItem(getString(R.string.shows_name_fox), "Description",
                getString(R.string.shows_site_fox), R.drawable.fox));
        listItems.add(new ListItem(getString(R.string.shows_name_masonic), "Description",
                getString(R.string.shows_site_masonic), R.drawable.masonic));
        listItems.add(new ListItem(getString(R.string.shows_name_comerica), "Description",
                getString(R.string.shows_site_comerica), R.drawable.comerica));
        listItems.add(new ListItem(getString(R.string.shows_name_ford), "Description",
                getString(R.string.shows_site_ford), R.drawable.ford));
        listItems.add(new ListItem(getString(R.string.shows_name_little), "Description",
                getString(R.string.shows_site_little), R.drawable.little));
        listItems.add(new ListItem(getString(R.string.shows_name_fillmore), "Description",
                getString(R.string.shows_site_fillmore), R.drawable.fillmore));
        listItems.add(new ListItem(getString(R.string.shows_name_opera), "Description",
                getString(R.string.shows_site_opera), R.drawable.opera));
        listItems.add(new ListItem(getString(R.string.shows_name_standrews), "Description",
                getString(R.string.shows_site_standrews), R.drawable.standrews));

//        Hook up adapter
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
