package com.example.anush.searchuserexample;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.UserModel> implements Filterable {

    List<User> users = new ArrayList<>();
    Context context;
    List<User> filteredUser;

    public MyAdapter(List<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public UserModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_model, parent,false);
        return new UserModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserModel holder, int position) {
        final User user = users.get(position);
        holder.name.setText(user.getName());
        holder.description.setText(user.getDesc());
        holder.phoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("043919089"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_PHONE_NUMBER,user.getPhone());

            }
        });
        holder.emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("aram@gmail.com"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, user.getEmail());
                context.startActivity(intent);
            }
        });
        Picasso.get().load(user.getImageUrl()).into(holder.image);


    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    @Override
    public Filter getFilter() {
        return null;
    }


    public class UserModel extends RecyclerView.ViewHolder {
        TextView name;
        TextView description;
        ImageButton phoneBtn;
        ImageButton emailBtn;
        CircleImageView image;

        public UserModel(@NonNull View itemView) {
            super(itemView);
            image= itemView.findViewById(R.id.imageID);
            name= itemView.findViewById(R.id.nameId);
            description= itemView.findViewById(R.id.desId);
            phoneBtn = itemView.findViewById(R.id.phoneBtnId);
            emailBtn= itemView.findViewById(R.id.emailBtnId);

        }
    }
}
