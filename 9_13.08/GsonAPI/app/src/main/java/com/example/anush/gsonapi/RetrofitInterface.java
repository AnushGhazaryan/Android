package com.example.anush.gsonapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("/api/")
    Call<UserModel> fetchUsers();//@Query("results")int results);
}
