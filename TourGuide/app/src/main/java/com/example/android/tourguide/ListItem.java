package com.example.android.tourguide;

/**
 * Created by Dillon on 11/8/2016.
 */

public class ListItem {

    private String mName;
    private String mAddress;
    private int mImageResourceID;
    private String mWebsite;

    public ListItem(String name, String address, int imageResourceID, String website) {
        mName = name;
        mAddress = address;
        mImageResourceID = imageResourceID;
        mWebsite = website;
    }

    public String getmAddress() {
        return mAddress;
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
