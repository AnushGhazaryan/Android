package com.example.anush.mymovie;

import android.graphics.drawable.Drawable;

public class Movie {



    private String title;
    private String des;
  //  private boolean isLiked;
    private int image;
    private String wiki;
    private float rate;



    public Movie(String title, String wiki, String des, int image, float rate) {
        this.title = title;
        this.wiki = wiki;
        this.des = des;
        this.image = image;
        this.rate = rate;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

 /*   public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
*/

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

}
