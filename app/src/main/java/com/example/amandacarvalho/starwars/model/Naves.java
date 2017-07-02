package com.example.amandacarvalho.starwars.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Home-CA on 30/06/2017.
 */

public class Naves implements Serializable {

    @SerializedName("starship_class")
    public String starshipClass;

    @SerializedName("hyperdrive_rating")
    public String hyperdriveRating;

    @SerializedName("MGLT")
    public String mglt;
}
