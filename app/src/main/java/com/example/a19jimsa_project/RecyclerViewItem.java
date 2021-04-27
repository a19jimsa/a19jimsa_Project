package com.example.a19jimsa_project;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@SuppressWarnings("WeakerAccess")
public class RecyclerViewItem{
    @SerializedName("ID")
    private String id;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private String auxdata;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public int getSize() {
        return size;
    }

    public int getCost() {
        return cost;
    }

    public String getAuxdata() {
        return auxdata;
    }
}
