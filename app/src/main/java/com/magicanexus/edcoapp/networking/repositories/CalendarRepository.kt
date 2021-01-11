package com.magicanexus.edcoapp.networking.repositories

import com.magicanexus.edcoapp.networking.NbaApi
import com.magicanexus.edcoapp.networking.RetrofitService

class CalendarRepository private constructor()
{
    companion object {
        @Volatile private var instance: CalendarRepository? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: CalendarRepository().also {
                    instance = it
                }
            }
    }

    private var api : NbaApi = RetrofitService().createService(NbaApi::class.java)
    suspend fun getScoreboard(date : Long) = api.getScoreboard(date)

}