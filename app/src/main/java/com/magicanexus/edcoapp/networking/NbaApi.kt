package com.magicanexus.edcoapp.networking

import com.magicanexus.edcoapp.models.Scoreboard
import retrofit2.http.GET
import retrofit2.http.Path

interface NbaApi {
    @GET("{date}/scoreboard.json")
    suspend fun getScoreboard(@Path("date") date : Long): Scoreboard
}