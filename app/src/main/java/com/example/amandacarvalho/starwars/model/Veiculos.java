package com.example.amandacarvalho.starwars.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Home-CA on 30/06/2017.
 */

public class Veiculos implements Serializable {

    public String name;
    public String model;

    @SerializedName("vehicle_class")
    public String vehicleClass;

    public String manufacturer;

    @SerializedName("cost_in_credits")
    public String costInCredits;

    public String length;
    public String crew;
    public String passengers;

    @SerializedName("max_atmosphering_speed")
    public String maxAtmospheringSpeed;

    @SerializedName("cargo_capacity")
    public String cargoCapacity;

    public String consumables;
    public String created;
    public String edited;
    public String url;

    @SerializedName("pilots")
    public ArrayList<String> pilotsUrls;

    @SerializedName("films")
    public ArrayList<String> filmsUrls;
}
