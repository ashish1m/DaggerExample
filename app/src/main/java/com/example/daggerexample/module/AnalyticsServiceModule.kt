package com.example.daggerexample.module

import com.example.daggerexample.services.AnalyticsService
import com.example.daggerexample.services.FirebaseAnalytics
import com.example.daggerexample.services.MixpanelAnalytics
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AnalyticsServiceModule {

    @Named("firebase")
    @Provides
    fun getFirebaseAnalytics(): AnalyticsService {
        return FirebaseAnalytics()
    }

    @Named("mixpanel")
    @Provides
    fun getMixpanelAnalytics(mixpanelAnalytics: MixpanelAnalytics): AnalyticsService {
        return mixpanelAnalytics
    }
}