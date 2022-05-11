package com.swapi.swModels;

import com.google.gson.annotations.SerializedName;

//Root model that provides information on all available resources within the API.
public class SWRoot {
    @SerializedName("films")
    public String filmsUrl;
    @SerializedName("people")
    public String peopleUrl;
    @SerializedName("planets")
    public String planetsUrl;
    @SerializedName("species")
    public String speciesUrl;
    @SerializedName("starships")
    public String starshipsUrl;
    @SerializedName("vehicles")
    public String vehiclesUrl;
}
