package com.example.anush.searchuserexample;

public class User {
    private String name;
    private String desc;
    private String phone;
    private String email;
    private String imageUrl;

    public User(String name, String desc, String phone, String email, String imageUrl) {
        this.name = name;
        this.desc = desc;
        this.phone = phone;
        this.email = email;
        this.imageUrl = imageUrl;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
