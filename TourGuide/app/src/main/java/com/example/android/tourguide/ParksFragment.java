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
        listItems.add(new ListItem(getString(R.string.parks_name_belle),
                getString(R.string.parks_desc_belle), getString(R.string.parks_site_belle),
                R.drawable.belle));
        listItems.add(new ListItem(getString(R.string.parks_name_campus),
                getString(R.string.parks_desc_campus), getString(R.string.parks_site_campus),
                R.drawable.campus));
        listItems.add(new ListItem(getString(R.string.parks_name_grand),
                getString(R.string.parks_desc_grand), getString(R.string.parks_site_grand),
                R.drawable.grand));
        listItems.add(new ListItem(getString(R.string.parks_name_hart),
                getString(R.string.parks_desc_hart), getString(R.string.parks_site_hart),
                R.drawable.hart));
        listItems.add(new ListItem(getString(R.string.parks_name_milliken),
                getString(R.string.parks_desc_milliken), getString(R.string.parks_site_milliken),
                R.drawable.milliken));
        listItems.add(new ListItem(getString(R.string.parks_name_riverwalk),
                getString(R.string.parks_desc_riverwalk), getString(R.string.parks_site_riverwalk),
                R.drawable.riverwalk));
        listItems.add(new ListItem(getString(R.string.parks_name_spirit),
                getString(R.string.parks_desc_spirit), getString(R.string.parks_site_spirit),
                R.drawable.spirit));

//        Hook up adapter
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
