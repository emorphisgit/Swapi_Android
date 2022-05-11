package com.swapi.swNetworkCall;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.swapi.APIConstants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class SWClient {
    private static Retrofit mRetrofit;

    //Create instance of retrofit
    public static SWAPIs getInstanceServices() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        if (mRetrofit == null) {
            mRetrofit = new Retrofit
                    .Builder()
                    .baseUrl(APIConstants.BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return mRetrofit.create(SWAPIs.class);
    }
}