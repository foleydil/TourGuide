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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

//        Create ArrayList of "Parks" items
        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(getString(R.string.parks_name_belle), "Description",
                "Website", R.drawable.greendot));
        listItems.add(new ListItem(getString(R.string.parks_name_campus), "Description",
                "Website", R.drawable.greendot));
        listItems.add(new ListItem(getString(R.string.parks_name_grand), "Description",
                "Website", R.drawable.greendot));
        listItems.add(new ListItem(getString(R.string.parks_name_hart), "Description",
                "Website", R.drawable.greendot));
        listItems.add(new ListItem(getString(R.string.parks_name_milliken), "Description",
                "Website", R.drawable.greendot));
        listItems.add(new ListItem(getString(R.string.parks_name_riverwalk), "Description",
                "Website", R.drawable.greendot));
        listItems.add(new ListItem(getString(R.string.parks_name_spirit), "Description",
                "Website", R.drawable.greendot));

//        Hook up adapter
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
