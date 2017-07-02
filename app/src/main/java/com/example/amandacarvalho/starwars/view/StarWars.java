package com.example.amandacarvalho.starwars.view;

import com.example.amandacarvalho.starwars.model.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Retrofit;



/**
 * Created by Home-CA on 30/06/2017.
 */

public interface StarWars {

    @GET("/")
    public void getRootUrls(Call<Root> callback);

    @GET("/people/")
    Call<SWModelList<Personagens>>) getAllPeople(@Query("page") int page);

    @GET("/people/{id}/")
    Call<Personagens>getPeople(@Path("id") int peopleId);


    @GET("/films/")
    Call<SWModelList<Filme>> getAllFilms(@Query("page") int page);


    @GET("/films/{id}/")
    Call<Filme> getFilm(@Path("id") int filmId);

    @GET("/starships")
    Call<SWModelList<Naves>> getAllStarships(@Query("page") int page);

    @GET("/starships/{id}/")
    Call<Naves> getStarship(@Path("id") int starshipId);

    @GET("/vehicles/")
    Call<SWModelList<Veiculos>> getAllVehicles(@Query("page") int page);

    @GET("/vehicles/{id}/")
    Call<Veiculos> getVehicle(@Path("id") int vehicleId);

    @GET("/species/")
    Call<SWModelList<Especies>> getAllSpecies(@Query("page") int page);

    @GET("/species/{id}/")
    Call<Especies> getSpecies(@Path("id") int speciesId);

    @GET("/planets/")
    Call<SWModelList<Planeta>> getAllPlanets(@Query("page") int page);

    @GET("/planets/{id}/")
    Call<Planeta> getPlanet(@Path("id") int planetId);


}
