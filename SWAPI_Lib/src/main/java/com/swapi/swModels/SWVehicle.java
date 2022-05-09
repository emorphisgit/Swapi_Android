package com.swapi.swModels;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

//Vehicle model class
public class SWVehicle implements Serializable {

    @SerializedName("name")
    public String name;
    @SerializedName("model")
    public String model;
    @SerializedName("vehicle_class")
    public String vehicleClass;
    @SerializedName("manufacturer")
    public String manufacturer;
    @SerializedName("cost_in_credits")
    public String costInCredits;

    @SerializedName("length")
    public String length;

    @SerializedName("crew")
    public String crew;
    @SerializedName("passengers")
    public String passengers;

    @SerializedName("max_atmosphering_speed")
    public String maxAtmospheringSpeed;

    @SerializedName("cargo_capacity")
    public String cargoCapacity;

    @SerializedName("consumables")
    public String consumables;
    @SerializedName("created")
    public String created;
    @SerializedName("edited")
    public String edited;
    @SerializedName("url")
    public String url;
    @SerializedName("pilots")
    public ArrayList<String> pilotsUrls;

    @SerializedName("films")
    public ArrayList<String> filmsUrls;
}
