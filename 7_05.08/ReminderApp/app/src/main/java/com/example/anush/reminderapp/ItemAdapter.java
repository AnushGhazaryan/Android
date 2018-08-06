package com.example.anush.reminderapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHoler> {

    ArrayList<String> items;
    public ItemAdapter(ArrayList<String> items){
        this.items = items;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new ViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHoler holder, int position) {
        holder.firstName.setText(items.get(position));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder {

        public TextView firstName;

        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            firstName = itemView.findViewById(R.id.first_name);
        }
    }
}
