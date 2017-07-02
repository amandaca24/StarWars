package com.example.amandacarvalho.starwars.model;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Home-CA on 30/06/2017.
 */

public class SWModelList<A> implements Serializable {
    public int count;
    public String next;
    public String previous;
    public ArrayList<A> results;

    public boolean hasMore() {
        return !TextUtils.isEmpty(next);
    }

}
