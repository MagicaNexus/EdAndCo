package com.magicanexus.edcoapp.viewmodel

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.magicanexus.edcoapp.networking.repositories.CalendarRepository
import kotlinx.coroutines.Dispatchers
import java.util.*
import kotlin.collections.ArrayList


public class MainActivityViewModel : ViewModel()
{
    fun getPosts() = liveData(Dispatchers.IO)
    {
        emit(CalendarRepository.getInstance().getScoreboard(20200108))
    }

}