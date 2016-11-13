package com.example.android.tourguide;

/**
 * Created by Dillon on 11/8/2016.
 */

public class ListItem {

    private String mName;
    private String mDescription;
    private int mImageResourceID;
    private String mWebsite;

    public ListItem(String name, String description, int imageResourceID, String website) {
        mName = name;
        mDescription = description;
        mImageResourceID = imageResourceID;
        mWebsite = website;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmName() {
        return mName;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }
}
