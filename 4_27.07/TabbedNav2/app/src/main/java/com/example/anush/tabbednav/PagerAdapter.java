package com.example.anush.tabbednav;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    TabOne tabOne = new TabOne();
    TabTwo tabTwo = new TabTwo();
    TabThree tabThree = new TabThree();


    int numOfTabs;

    public PagerAdapter(FragmentManager fm, int tabsNum) {
        super(fm);
        this.numOfTabs = tabsNum;
    }

    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return tabOne;
            case 1:
                return tabTwo;
            case 2:
                return tabThree;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
