package com.example.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@Singleton
class SQLRepository @Inject constructor() : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: User saved in DB")
    }
}

class FirebaseRepository: UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: User saved in Firebase")
    }

}