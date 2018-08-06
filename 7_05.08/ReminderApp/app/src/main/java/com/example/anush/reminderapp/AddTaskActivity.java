package com.example.anush.reminderapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class AddTaskActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<String> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        recyclerView = findViewById(R.id.recyclerViewtasks);

        items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            items.add("Titele"+ i);

        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemAdapter(items);
        recyclerView.setAdapter(adapter);

        FloatingActionButton addBtn = findViewById(R.id.fab);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddTaskActivity.this, NewAdd.class));
                finish();
            }
        });
    }
}
