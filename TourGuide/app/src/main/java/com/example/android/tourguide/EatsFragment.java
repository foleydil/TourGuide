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
public class EatsFragment extends Fragment {


    public EatsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

//        Create ArrayList of "Eats" items
        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(getString(R.string.eats_name_greendot), "Description",
                getString(R.string.eats_site_greendot), R.drawable.greendot));
        listItems.add(new ListItem(getString(R.string.eats_name_nathans), "Description",
                getString(R.string.eats_site_nathans), R.drawable.nathans));
        listItems.add(new ListItem(getString(R.string.eats_name_punchbowl), "Description",
                getString(R.string.eats_site_punchbowl), R.drawable.punchbowl));
        listItems.add(new ListItem(getString(R.string.eats_name_republic), "Description",
                getString(R.string.eats_site_republic), R.drawable.republic));
        listItems.add(new ListItem(getString(R.string.eats_name_townhouse), "Description",
                getString(R.string.eats_site_townhouse), R.drawable.townhouse));
        listItems.add(new ListItem(getString(R.string.eats_name_wright), "Description",
                getString(R.string.eats_site_wright), R.drawable.wright));

//        Hook up adapter
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
