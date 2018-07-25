package com.example.anush.mymovie;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{

    private List<Movie> list;


    public Adapter(List<Movie> list){
        this.list=list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_movie, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final Movie movie = list.get(position);
        holder.title.setText(movie.getTitle());
        holder.image.setImageResource(movie.getImage());
        holder.des.setText(movie.getDes());
        holder.ratingBar.setRating(movie.getRate());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private ImageView image;
        private TextView des;
        private RatingBar ratingBar;


        public MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.titleId);
            image = view.findViewById(R.id.imageId);
            des = view.findViewById(R.id.desId);
            ratingBar = view.findViewById(R.id.ratingBar);

        }
    }
}


