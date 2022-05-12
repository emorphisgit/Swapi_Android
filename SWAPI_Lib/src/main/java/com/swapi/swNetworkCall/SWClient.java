package com.swapi.swNetworkCall;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.swapi.APIConstants;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
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
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                    .callTimeout(2, TimeUnit.MINUTES)
                    .connectTimeout(20, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS);

            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl(APIConstants.BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson));
            builder.client(httpClient.build());
            mRetrofit = builder.build();
        }

        return mRetrofit.create(SWAPIs.class);
    }
}