package com.example.anush.retrofit.api;

import com.example.anush.retrofit.ModelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {

    @SerializedName("results")
    @Expose
    private List<ModelUser> users = null;

    public List<ModelUser> getResults() {
        return users;
    }

    public void setResults(List<ModelUser> results) {
        this.users = results;
    }
}