package com.example.daggerexample.repo

import android.util.Log
import com.example.daggerexample.scope.ActivityScope
import com.example.daggerexample.services.AnalyticsService
import com.example.daggerexample.util.TAG
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(private val analyticsService: AnalyticsService) :
    UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: User saved in DB")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository(private val analyticsService: AnalyticsService) :
    UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: User saved in Firebase")
        analyticsService.trackEvent("Save User", "CREATE")
    }

}