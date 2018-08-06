package com.example.anush.reminderapp;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<PreviewObjects> previewObjectsList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        setObjectList();
        CustomPagerAdapter adapter = new CustomPagerAdapter(previewObjectsList);
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager, true);
        Button btn = findViewById(R.id.btn_skip);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Login.class));
                finish();
            }
        });
    }
    public void setObjectList() {
        previewObjectsList.add(new PreviewObjects( getString(R.string.first_page_text)));
        previewObjectsList.add(new PreviewObjects( getString(R.string.second_page_text)));
        previewObjectsList.add(new PreviewObjects( getString(R.string.third_page_text)));
    }
}
