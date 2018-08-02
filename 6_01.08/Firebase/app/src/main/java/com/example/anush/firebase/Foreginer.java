package com.example.anush.firebase;

public class Foreginer {
    String name;
    String forId;
    String options;

    public Foreginer(){

    }

    public Foreginer(String name, String forId, String options) {
        this.name = name;
        this.forId = forId;
        this.options = options;
    }

    public String getName() {
        return name;
    }

    public String getForId() {
        return forId;
    }

    public String getOptions() {
        return options;
    }
}
