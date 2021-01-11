package com.magicanexus.edcoapp.networking

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitService {


    private val httpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT).setLevel(HttpLoggingInterceptor.Level.BODY))


    private val retrofit = Retrofit.Builder()
        .baseUrl("https://data.nba.net/10s/prod/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient.build())
        .build()


    fun <T> createService(service: Class<T>): T {
        return retrofit.create(service)
    }
}