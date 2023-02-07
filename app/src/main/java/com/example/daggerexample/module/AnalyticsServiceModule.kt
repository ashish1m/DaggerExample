package com.example.daggerexample.module

import com.example.daggerexample.services.AnalyticsService
import com.example.daggerexample.services.FirebaseAnalytics
import com.example.daggerexample.services.MixpanelAnalytics
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AnalyticsServiceModule {

//    @Named("firebase")
//    @Provides
//    fun getFirebaseAnalytics(): AnalyticsService {
//        return FirebaseAnalytics()
//    }

    @Singleton
//    @Named("mixpanel")
    @Provides
    fun getMixpanelAnalytics(mixpanelAnalytics: MixpanelAnalytics): AnalyticsService {
        return mixpanelAnalytics
    }
}