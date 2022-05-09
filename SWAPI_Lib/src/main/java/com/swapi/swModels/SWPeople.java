package com.swapi.swModels;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

//People model class
public class SWPeople {

    @SerializedName("name")
    public String name;

    @SerializedName("birth_year")
    public String birthYear;

    @SerializedName("gender")
    public String gender;

    @SerializedName("hair_color")
    public String hairColor;

    @SerializedName("height")
    public String height;

    @SerializedName("homeworld")
    public String homeWorldUrl;

    @SerializedName("mass")
    public String mass;

    @SerializedName("skin_color")
    public String skinColor;

    @SerializedName("created")
    public String created;

    @SerializedName("edited")
    public String edited;

    @SerializedName("url")
    public String url;

    @SerializedName("films")
    public ArrayList<String> filmsUrls;

    @SerializedName("species")
    public ArrayList<String> speciesUrls;

    @SerializedName("starships")
    public ArrayList<String> starshipsUrls;

    @SerializedName("vehicles")
    public ArrayList<String> vehiclesUrls;
}
