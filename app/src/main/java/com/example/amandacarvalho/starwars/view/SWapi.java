package com.example.amandacarvalho.starwars.view;



import com.example.amandacarvalho.starwars.APIConstants;

import java.lang.reflect.Type;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class SWapi {

    private StarWars SwApi;
    private static SWapi sInstance;

    String API_BASE_URL = "http://swapi.co/api";

    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(
                            GsonConverterFactory.create()
                    );

    Retrofit retrofit = builder
                    .client(httpClient.build())
                    .build();

    StarWars client =  retrofit.create(StarWars.class);

    public static void init() {
            sInstance = new SWapi();
        }

        public static StarWars getApi() {
            return sInstance.SwApi;
        }

        public void setApi(StarWars starWarsApi) {
            sInstance.SwApi = starWarsApi;
        }
    }


}
