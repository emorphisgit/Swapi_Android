package com.swapi.swNetworkCall;

import com.swapi.swModels.SWFilm;
import com.swapi.swModels.SWModelList;
import com.swapi.swModels.SWPeople;
import com.swapi.swModels.SWPlanet;
import com.swapi.swModels.SWRoot;
import com.swapi.swModels.SWSpecies;
import com.swapi.swModels.SWStarship;
import com.swapi.swModels.SWVehicle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

//SW API interface for making calls.
public interface SWAPIInterface {

    @GET("people/")
    Call<SWModelList<SWPeople>> getAllPeople();

    @GET("people/{id}")
    Call<SWPeople> getPeople(@Path("id") int peopleId);

    //search people using query
    @GET("people")
    Call<SWModelList<SWPeople>> getPeopleSearch(@Query("search") String search);

    @GET("films/")
    Call<SWModelList<SWFilm>> getAllFilms();

    @GET("films/{id}")
    Call<SWFilm> getFilm(@Path("id") int filmId);

    @GET("starships/")
    Call<SWModelList<SWStarship>> getAllStarships();

    @GET("starships/{id}")
    Call<SWStarship> getStarship(@Path("id") int starshipId);

    @GET("vehicles/")
    Call<SWModelList<SWVehicle>> getAllVehicles();

    @GET("vehicles/{id}")
    Call<SWVehicle> getVehicle(@Path("id") int vehicleId);

    @GET("species/")
    Call<SWModelList<SWSpecies>> getAllSpecies();

    @GET("species/{id}")
    Call<SWSpecies> getSpecies(@Path("id") int speciesId);

    @GET("planets/")
    Call<SWModelList<SWPlanet>> getAllPlanets();

    @GET("planets/{id}")
    Call<SWPlanet> getPlanet(@Path("id") int planetId);

    @GET("/")
    public void getRootUrls(Callback<SWRoot> callback);

}
