package com.example.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@Singleton
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