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
public class FunFragment extends Fragment {


    public FunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

//        Create ArrayList of "Fun" items
        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(getString(R.string.fun_name_dia), "Description",
                "Website", R.drawable.dia));
        listItems.add(new ListItem(getString(R.string.fun_name_fowling), "Description",
                "Website", R.drawable.fowling));
        listItems.add(new ListItem(getString(R.string.fun_name_greektown), "Description",
                "Website", R.drawable.greektown));
        listItems.add(new ListItem(getString(R.string.fun_name_historical), "Description",
                "Website", R.drawable.historical));
        listItems.add(new ListItem(getString(R.string.fun_name_mgm), "Description",
                "Website", R.drawable.mgm));
        listItems.add(new ListItem(getString(R.string.fun_name_monroe), "Description",
                "Website", R.drawable.monroe));
        listItems.add(new ListItem(getString(R.string.fun_name_motorcity), "Description",
                "Website", R.drawable.motorcity));
        listItems.add(new ListItem(getString(R.string.fun_name_princess), "Description",
                "Website", R.drawable.princess));

//        Hook up adapter
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
