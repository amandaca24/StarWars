package com.example.amandacarvalho.starwars.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Home-CA on 30/06/2017.
 */

public class Filme implements Serializable {

    public String title;

    @SerializedName("episode_id")
    public int episodeId;

    @SerializedName("opening_crawl")
    public String openingCrawl;

    public String director;
    public String producer;
    public String url;
    public String created;
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
