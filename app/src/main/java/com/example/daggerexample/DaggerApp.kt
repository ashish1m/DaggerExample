package com.example.daggerexample

import android.app.Application

class DaggerApp: Application() {

    companion object {
        lateinit var mInstance: DaggerApp
            private set
    }

    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()

        mInstance = this
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }
}