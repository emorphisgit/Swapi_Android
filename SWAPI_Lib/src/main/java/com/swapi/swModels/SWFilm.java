package com.swapi.swModels;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

//Film model class
public class SWFilm  {
    @SerializedName("title")
    public String title;

    @SerializedName("episode_id")
    public int episodeId;

    @SerializedName("opening_crawl")
    public String openingCrawl;

    @SerializedName("director")
    public String director;

    @SerializedName("producer")
    public String producer;

    @SerializedName("url")
    public String url;

    @SerializedName("created")
    public String created;

    @SerializedName("edited")
    public String edited;

    @SerializedName("species")
    public ArrayList<String> speciesUrls;

    @SerializedName("starships")
    public ArrayList<String> starshipsUrls;

    @SerializedName("vehicles")
    public ArrayList<String> vehiclesUrls;

    @SerializedName("planets")
    public ArrayList<String> planetsUrls;

    @SerializedName("characters")
    public ArrayList<String> charactersUrls;
}
