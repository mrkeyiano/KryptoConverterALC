package com.krypto.android.currencyconverter.rest;

import com.krypto.android.currencyconverter.MainActivity;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by adeyemogabriel on 8/28/17.
 */

public class ApiClient {
    private Retrofit retrofit;
    public ApiClient () {
        retrofit = new Retrofit.Builder()
                .baseUrl(MainActivity.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public ApiInterface getApiService () {
        return retrofit.create(ApiInterface.class);
    }
}
