package com.example.anush.reminderapp;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.List;

public class CustomPagerAdapter extends PagerAdapter {
    private List<PreviewObjects> previewObjectsList;
    public CustomPagerAdapter(List<PreviewObjects> list){
        previewObjectsList = list;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return false;
    }
}
