package com.example.currencyconvertion.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrencyApi {

    public CurrencyService createCurrencyService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.freecurrencyapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CurrencyService currencyService = retrofit.create(CurrencyService.class);
        return currencyService;
    }
}
