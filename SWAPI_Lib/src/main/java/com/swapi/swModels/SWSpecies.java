package com.swapi.swModels;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

//Species model class
public class SWSpecies {

    @SerializedName("name")
    public String name;

    @SerializedName("classification")
    public String classification;

    @SerializedName("designation")
    public String designation;

    @SerializedName("average_height")
    public String averageHeight;

    @SerializedName("average_lifespan")
    public String averageLifespan;

    @SerializedName("eye_colors")
    public String eyeColors;

    @SerializedName("hair_colors")
    public String hairColors;

    @SerializedName("skin_colors")
    public String skinColors;

    @SerializedName("homeworld")
    public String homeWorld;

    @SerializedName("language")
    public String language;
    @SerializedName("created")
    public String created;
    @SerializedName("edited")
    public String edited;
    @SerializedName("url")
    public String url;

    @SerializedName("people")
    public ArrayList<String> peopleUrls;

    @SerializedName("films")
    public ArrayList<String> filmsUrls;
}
