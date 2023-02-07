package com.example.daggerexample

import android.app.Application
import com.example.daggerexample.component.AppComponent

class DaggerApp : Application() {

    companion object {
        lateinit var mInstance: DaggerApp
            private set
    }

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        mInstance = this
    }
}