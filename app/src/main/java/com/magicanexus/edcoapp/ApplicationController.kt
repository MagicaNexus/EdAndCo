package com.magicanexus.edcoapp

import android.app.Application
import android.content.Context
import timber.log.Timber
import timber.log.Timber.DebugTree


class ApplicationController : Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: ApplicationController? = null
        fun applicationContext() : Context = instance!!.applicationContext

    }

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }
}