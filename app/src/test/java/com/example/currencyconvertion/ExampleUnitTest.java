package com.example.currencyconvertion;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.currencyconvertion.model.Data;
import com.example.currencyconvertion.network.CurrencyApi;
import com.example.currencyconvertion.network.CurrencyService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getCurrency() throws IOException {
        CurrencyService currencyService = new CurrencyApi().createCurrencyService();
        Call<Data> call = currencyService.fetchProducts("AUD");
        Data apiKeys = call.execute().body();
        assertNotNull(apiKeys);
        assertFalse(apiKeys.);
        System.out.println(new Gson().toJson(apiKeys));
    }
}