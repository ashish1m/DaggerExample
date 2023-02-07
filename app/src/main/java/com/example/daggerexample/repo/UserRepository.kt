package com.example.daggerexample.repo

import android.util.Log
import com.example.daggerexample.services.AnalyticsService
import com.example.daggerexample.util.TAG
import javax.inject.Inject
import javax.inject.Named

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor(@Named("mixpanel") private val analyticsService: AnalyticsService) :
    UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: User saved in DB")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository(@Named("firebase") private val analyticsService: AnalyticsService) :
    UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: User saved in Firebase")
        analyticsService.trackEvent("Save User", "CREATE")
    }

}