package com.example.amandacarvalho.starwars.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Home-CA on 30/06/2017.
 */

public class Root {
    public class Root implements Serializable {
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
}
