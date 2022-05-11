package com.swapi.platform;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.swapi.swModels.SWFilm;
import com.swapi.swModels.SWModelList;
import com.swapi.swModels.SWPeople;
import com.swapi.swModels.SWPlanet;
import com.swapi.swModels.SWSpecies;
import com.swapi.swModels.SWStarship;
import com.swapi.swModels.SWVehicle;
import com.swapi.swNetworkCall.SWAPIs;
import com.swapi.swNetworkCall.SWClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//This is Testing activity, we have created Separate method for checking the response in all API logs.
public class SWMainActivity extends AppCompatActivity {

    public String TAG = SWMainActivity.this.getClass().getName();
    public Context mContext;
    AppCompatButton mBtnPeople, mBtnFilms, mBtnPlanets;
    AppCompatButton mBtnVehicles, mBtnSpecies, mBtnStarShips;
    private SWAPIs mSWAPIs;
    AppCompatButton mBtnPeopleID, mBtnFilmsID, mBtnPlanetsID;
    AppCompatButton mBtnSpaceShipsId, mBtnVehiclesId, mBtnSpeciesId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = SWMainActivity.this;
        //Call Swapi client services
         mSWAPIs = SWClient.getInstanceServices();
         //initialize all views
        initializationViews();
    }

    private void initializationViews() {
        mBtnPeople = findViewById(R.id.mBtnPeople);
        mBtnFilms = findViewById(R.id.mBtnFilms);
        mBtnPlanets = findViewById(R.id.mBtnPlanets);
        mBtnStarShips = findViewById(R.id.mBtnSpaceShips);
        mBtnVehicles = findViewById(R.id.mBtnVehicles);
        mBtnSpecies = findViewById(R.id.mBtnSpecies);
        mBtnPeople.setOnClickListener(view -> callPeoplesAPI());
        mBtnSpecies.setOnClickListener(view -> callSpeciesAPI());
        mBtnFilms.setOnClickListener(v -> callFilmsAPI());
        mBtnPlanets.setOnClickListener(v -> callPlanetsAPI());
        mBtnStarShips.setOnClickListener(v -> callStarShipsAPI());
        mBtnVehicles.setOnClickListener(v -> callVehiclesAPI());

        //Call All ID's
        mBtnPeopleID = findViewById(R.id.mBtnPeopleID);
        mBtnFilmsID = findViewById(R.id.mBtnFilmsID);
        mBtnPlanetsID = findViewById(R.id.mBtnPlanetsID);
        mBtnSpaceShipsId = findViewById(R.id.mBtnSpaceShipsId);
        mBtnSpeciesId = findViewById(R.id.mBtnSpeciesID);
        mBtnVehiclesId = findViewById(R.id.mBtnVehiclesID);

        mBtnPeopleID.setOnClickListener(view -> callPeopleID());
        mBtnFilmsID.setOnClickListener(view -> callFilmsID());
        mBtnPlanetsID.setOnClickListener(view -> callPlanetsID());

        mBtnSpaceShipsId.setOnClickListener(view -> callStarShipID());
        mBtnSpeciesId.setOnClickListener(view -> callSpeciesID());
        mBtnVehiclesId.setOnClickListener(view -> callVehiclesID());
    }

    //Call SW for all People
    private void callPeoplesAPI() {
        Call<SWModelList<SWPeople>> call = mSWAPIs.getPeoples();
        call.enqueue(new Callback<SWModelList<SWPeople>>() {
            @Override
            public void onResponse(@NonNull Call<SWModelList<SWPeople>> call, @NonNull Response<SWModelList<SWPeople>> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<SWModelList<SWPeople>> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Call SW for all Films
    private void callFilmsAPI() {
        Call<SWModelList<SWFilm>> call = mSWAPIs.getFilms();
        call.enqueue(new Callback<SWModelList<SWFilm>>() {
            @Override
            public void onResponse(@NonNull Call<SWModelList<SWFilm>> call, @NonNull Response<SWModelList<SWFilm>> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(@NonNull Call<SWModelList<SWFilm>> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Call SW for all Species
    private void callSpeciesAPI() {
        Call<SWModelList<SWSpecies>> call = mSWAPIs.getSpecies();
        call.enqueue(new Callback<SWModelList<SWSpecies>>() {
            @Override
            public void onResponse(@NonNull Call<SWModelList<SWSpecies>> call, @NonNull Response<SWModelList<SWSpecies>> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(@NonNull  Call<SWModelList<SWSpecies>> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Call SW for all Vehicles
    private void callVehiclesAPI() {
        Call<SWModelList<SWVehicle>> call = mSWAPIs.getVehicles();
        call.enqueue(new Callback<SWModelList<SWVehicle>>() {
            @Override
            public void onResponse(@NonNull Call<SWModelList<SWVehicle>> call, @NonNull Response<SWModelList<SWVehicle>> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onFailure(@NonNull Call<SWModelList<SWVehicle>> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Call SW for all StarShips
    private void callStarShipsAPI() {
        Call<SWModelList<SWStarship>> call = mSWAPIs.getStarships();
        call.enqueue(new Callback<SWModelList<SWStarship>>() {
            @Override
            public void onResponse(@NonNull Call<SWModelList<SWStarship>> call, @NonNull Response<SWModelList<SWStarship>> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(@NonNull Call<SWModelList<SWStarship>> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Call SW for all Planets
    private void callPlanetsAPI() {
        Call<SWModelList<SWPlanet>> call = mSWAPIs.getPlanets();
        call.enqueue(new Callback<SWModelList<SWPlanet>>() {
            @Override
            public void onResponse(@NonNull Call<SWModelList<SWPlanet>> call, @NonNull Response<SWModelList<SWPlanet>> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(@NonNull Call<SWModelList<SWPlanet>> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }



    //call vehicle by ID
    private void callVehiclesID() {
        Call<SWVehicle> call = mSWAPIs.getVehicleByID(4);
        call.enqueue(new Callback<SWVehicle>() {
            @Override
            public void onResponse(@NonNull Call<SWVehicle> call, @NonNull Response<SWVehicle> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<SWVehicle> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Call species by ID
    private void callSpeciesID() {
        Call<SWSpecies> call = mSWAPIs.getSpeciesByID(2);
        call.enqueue(new Callback<SWSpecies>() {
            @Override
            public void onResponse(@NonNull Call<SWSpecies> call, @NonNull Response<SWSpecies> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<SWSpecies> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Call starships by ID
    private void callStarShipID() {
        Call<SWStarship> call = mSWAPIs.getStarshipByID(2);
        call.enqueue(new Callback<SWStarship>() {
            @Override
            public void onResponse(@NonNull Call<SWStarship> call, @NonNull Response<SWStarship> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<SWStarship> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Call Planets By ID
    private void callPlanetsID() {
        Call<SWPlanet> call = mSWAPIs.getPlanetByID(2);
        call.enqueue(new Callback<SWPlanet>() {
            @Override
            public void onResponse(@NonNull Call<SWPlanet> call, @NonNull Response<SWPlanet> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<SWPlanet> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Call Films by ID
    private void callFilmsID() {
        Call<SWFilm> call = mSWAPIs.getFilmByID(2);
        call.enqueue(new Callback<SWFilm>() {
            @Override
            public void onResponse(@NonNull Call<SWFilm> call, @NonNull Response<SWFilm> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<SWFilm> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Call people by ID--->
    private void callPeopleID() {
        Call<SWPeople> call = mSWAPIs.getPeopleByID(2);
        call.enqueue(new Callback<SWPeople>() {
            @Override
            public void onResponse(@NonNull Call<SWPeople> call, @NonNull Response<SWPeople> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<SWPeople> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }

    //Call people search text--->All search text working same, this is only people search
    private void callPeopleSearch() {
        Call<SWModelList<SWPeople>> call = mSWAPIs.getPeopleSearch("r2");
        call.enqueue(new Callback<SWModelList<SWPeople>>() {
            @Override
            public void onResponse(@NonNull Call<SWModelList<SWPeople>> call, @NonNull Response<SWModelList<SWPeople>> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<SWModelList<SWPeople>> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }
    //Call film search text--->All search text working same, this is only film search

    private void callFilmSearch() {
        Call<SWModelList<SWFilm>> call = mSWAPIs.getFilmSearch("");
        call.enqueue(new Callback<SWModelList<SWFilm>>() {
            @Override
            public void onResponse(@NonNull Call<SWModelList<SWFilm>> call, @NonNull Response<SWModelList<SWFilm>> response) {
                Log.d(TAG, response.body() + "");
                Toast.makeText(mContext, getResources().getString(R.string.success_msg), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<SWModelList<SWFilm>> call, @NonNull Throwable t) {
                call.cancel();
                Log.d(TAG, t.toString());
                Toast.makeText(mContext, getResources().getString(R.string.error_msg), Toast.LENGTH_SHORT).show();

            }
        });
    }
}



