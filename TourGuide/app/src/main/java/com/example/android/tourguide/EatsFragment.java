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
        listItems.add(new ListItem(getString(R.string.eats_name_greendot),
                getString(R.string.eats_desc_greendot), getString(R.string.eats_site_greendot),
                R.drawable.greendot));
        listItems.add(new ListItem(getString(R.string.eats_name_nathans),
                getString(R.string.eats_desc_nathans), getString(R.string.eats_site_nathans),
                R.drawable.nathans));
        listItems.add(new ListItem(getString(R.string.eats_name_punchbowl),
                getString(R.string.eats_desc_punchbowl), getString(R.string.eats_site_punchbowl),
                R.drawable.punchbowl));
        listItems.add(new ListItem(getString(R.string.eats_name_republic),
                getString(R.string.eats_desc_republic), getString(R.string.eats_site_republic),
                R.drawable.republic));
        listItems.add(new ListItem(getString(R.string.eats_name_townhouse),
                getString(R.string.eats_desc_townhouse), getString(R.string.eats_site_townhouse),
                R.drawable.townhouse));
        listItems.add(new ListItem(getString(R.string.eats_name_wright),
                getString(R.string.eats_desc_wright), getString(R.string.eats_site_wright), R.drawable.wright));

//        Hook up adapter
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
