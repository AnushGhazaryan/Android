package com.example.anush.retrofit;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.anush.retrofit.api.ApiResponse;
import com.example.anush.retrofit.api.RetrofitClient;
import com.example.anush.retrofit.api.RetrofitInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<ModelUser> list;
    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RetrofitInterface client = RetrofitClient.getClient().create(RetrofitInterface.class);
        int countOfUsers = 50;
        client.fetchUsers(countOfUsers).enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(@NonNull Call<ApiResponse> call, @NonNull Response<ApiResponse> response) {
                list = response.body().getResults();
                adapter = new MyAdapter(list, MainActivity.this);
                recyclerView.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e("Main", t.toString());
            }
        });
    }
}

