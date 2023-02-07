package com.example.daggerexample.module

import com.example.daggerexample.repo.SQLRepository
import com.example.daggerexample.repo.UserRepository
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }

    @Binds
    abstract fun getSqlRepository(sqlRepository: SQLRepository): UserRepository
}