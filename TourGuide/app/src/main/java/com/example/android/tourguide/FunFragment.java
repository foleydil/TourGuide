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
        listItems.add(new ListItem(getString(R.string.fun_name_mgm),
                getString(R.string.fun_desc_mgm), getString(R.string.fun_site_mgm),
                R.drawable.mgm));
        listItems.add(new ListItem(getString(R.string.fun_name_greektown),
                getString(R.string.fun_desc_greektown), getString(R.string.fun_site_greektown),
                R.drawable.greektown));
        listItems.add(new ListItem(getString(R.string.fun_name_motorcity),
                getString(R.string.fun_desc_motorcity), getString(R.string.fun_site_motorcity),
                R.drawable.motorcity));
        listItems.add(new ListItem(getString(R.string.fun_name_dia),
                getString(R.string.fun_desc_dia), getString(R.string.fun_site_dia),
                R.drawable.dia));
        listItems.add(new ListItem(getString(R.string.fun_name_monroe),
                getString(R.string.fun_desc_monroe), getString(R.string.fun_site_monroe),
                R.drawable.monroe));
        listItems.add(new ListItem(getString(R.string.fun_name_historical),
                getString(R.string.fun_desc_historical), getString(R.string.fun_site_historical),
                R.drawable.historical));
        listItems.add(new ListItem(getString(R.string.fun_name_princess),
                getString(R.string.fun_desc_princess), getString(R.string.fun_site_princess),
                R.drawable.princess));
        listItems.add(new ListItem(getString(R.string.fun_name_fowling),
                getString(R.string.fun_desc_fowling), getString(R.string.fun_site_fowling),
                R.drawable.fowling));

//        Hook up adapter
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
