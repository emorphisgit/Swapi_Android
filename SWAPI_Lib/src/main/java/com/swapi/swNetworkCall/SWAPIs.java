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
public interface SWAPIs {

    @GET("people/")
    Call<SWModelList<SWPeople>> getPeoples();

    @GET("people/")
    Call<SWModelList<SWPeople>> getPeoplesByPages(@Query("page") int pages);

    @GET("people/{id}")
    Call<SWPeople> getPeopleByID(@Path("id") int peopleId);

    //search people using query
    @GET("people/")
    Call<SWModelList<SWPeople>> getPeopleSearch(@Query("search") String search);


    @GET("films/")
    Call<SWModelList<SWFilm>> getFilms();

    @GET("films/{id}")
    Call<SWFilm> getFilmByID(@Path("id") int filmId);

    @GET("films/")
    Call<SWModelList<SWFilm>> getFilmSearch(@Query("search") String search);

    @GET("films/")
    Call<SWModelList<SWFilm>> getFilmsByPages(@Query("page") int pages);


    @GET("starships/")
    Call<SWModelList<SWStarship>> getStarships();

    @GET("starships/{id}")
    Call<SWStarship> getStarshipByID(@Path("id") int starshipId);

    @GET("starships/")
    Call<SWModelList<SWStarship>> getStarshipSearch(@Query("search") String search);

    @GET("starships/")
    Call<SWModelList<SWStarship>> getStarshipByPages(@Query("page") int pages);



    @GET("vehicles/")
    Call<SWModelList<SWVehicle>> getVehicles();

    @GET("vehicles/{id}")
    Call<SWVehicle> getVehicleByID(@Path("id") int vehicleId);

    @GET("vehicles/")
    Call<SWModelList<SWVehicle>> getVehicleSearch(@Query("search") String search);

    @GET("vehicles/")
    Call<SWModelList<SWVehicle>> getVehicleByPages(@Query("page") int pages);


    @GET("species/")
    Call<SWModelList<SWSpecies>> getSpecies();

    @GET("species/{id}")
    Call<SWSpecies> getSpeciesByID(@Path("id") int speciesId);

    @GET("species/")
    Call<SWModelList<SWSpecies>> getSpeciesSearch(@Query("search") String search);

    @GET("species/")
    Call<SWModelList<SWSpecies>> getSpeciesByPages(@Query("page") int pages);


    @GET("planets/")
    Call<SWModelList<SWPlanet>> getPlanets();

    @GET("planets/{id}")
    Call<SWPlanet> getPlanetByID(@Path("id") int planetId);

    @GET("planets/")
    Call<SWModelList<SWPlanet>> getPlanetSearch(@Query("search") String search);

    @GET("planets/")
    Call<SWModelList<SWPlanet>> getPlanetByPages(@Query("page") int pages);


    @GET("/")
    public void getRootUrls(Callback<SWRoot> callback);

}
