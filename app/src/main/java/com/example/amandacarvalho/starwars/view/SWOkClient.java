package com.example.amandacarvalho.starwars.view;

import android.os.Build;

import java.io.IOException;
import java.net.HttpURLConnection;

import okhttp3.Request;


/**
 * Created by Home-CA on 30/06/2017.
 */

public class SWOkClient extends OkHttpCall {

    public SWOkClient() {
        super();
    }

    @Override
    protected HttpURLConnection openConnection(Request request) throws IOException {
        HttpURLConnection connection = super.connectionPool(request);
        connection.setRequestProperty("User-Agent", "swapi-android-" + Build.VERSION.RELEASE);
        return connection;
    }
}
