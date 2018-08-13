package com.example.anush.gsonapi;

public class UserModel {
    private String title;
    private String url;
    private String thumbnailUrl;
    private String eMail;
    private String phoneNumber;

    public UserModel(String title, String url, String thumbnailUrl, String eMail, String phoneNumber) {
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
