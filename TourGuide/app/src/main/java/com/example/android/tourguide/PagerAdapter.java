package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Dillon on 11/8/2016.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    final int num_items = 4;
    private Context context;

    public PagerAdapter(FragmentManager fm, Context context){
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return num_items;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new EatsFragment();
            case 1:
                return new FunFragment();
            case 2:
                return new ParksFragment();
            case 3:
                return new ShowsFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.eats_title);
            case 1:
                return context.getString(R.string.fun_title);
            case 2:
                return context.getString(R.string.parks_title);
            case 3:
                return context.getString(R.string.shows_title);
            default:
                return null;
        }
    }
}
