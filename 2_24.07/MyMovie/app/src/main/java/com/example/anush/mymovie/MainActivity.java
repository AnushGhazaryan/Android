package com.example.anush.mymovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Adapter myAdapter;
    private RecyclerView recyclerView;
    private CardView cardView;
    private List<Movie> list = new LinkedList<Movie>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.mainRecycler);
        initMovie();
        myAdapter = new Adapter(list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdapter);

    }

    private void initMovie(){



        Movie m2 = new Movie("Mayrik","https://www.youtube.com/watch?v=LuLuFMNel7k","Watch Online", R.drawable.m123,5f);
        list.add(m2);
        Movie m3 = new Movie("1+1", "https://www.youtube.com/watch?v=whTjYy464cY","Watch Online",R.drawable.suw5z,3.5f);
        list.add(m3);
        Movie m4 = new Movie("Mayrik","https://www.youtube.com/watch?v=LuLuFMNel7k","Watch Online",R.drawable.m123,4.5f);
        list.add(m4);
        Movie m5 = new Movie("Mayrik","https://www.youtube.com/watch?v=LuLuFMNel7k","Watch Online",R.drawable.m123,4.5f);
        list.add(m5);

    }



}
