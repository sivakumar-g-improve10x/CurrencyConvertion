package com.example.currencyconvertion.network;

import com.example.currencyconvertion.model.Data;

import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CurrencyService {

    @GET("v1/latest?apikey=QiUyWrY2VlmfRLYT1DB3ASbwLPmkkxcoZhhiSseR")
    Call<Data> fetchProducts(@Query("apikey") String apikey);
}