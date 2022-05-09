package com.swapi.swModels;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

//Planet model class
public class SWPlanet  {

    @SerializedName("name")
    public String name;
    @SerializedName("diameter")
    public String diameter;
    @SerializedName("gravity")
    public String gravity;
    @SerializedName("population")
    public String population;
    @SerializedName("climate")
    public String climate;
    @SerializedName("terrain")
    public String terrain;
    @SerializedName("created")
    public String created;
    @SerializedName("edited")
    public String edited;
    @SerializedName("url")
    public String url;

    @SerializedName("rotation_period")
    public String rotationPeriod;

    @SerializedName("orbital_period")
    public String orbitalPeriod;

    @SerializedName("surface_water")
    public String surfaceWater;

    @SerializedName("residents")
    public ArrayList<String> residentsUrls;

    @SerializedName("films")
    public ArrayList<String> filmsUrls;
}
