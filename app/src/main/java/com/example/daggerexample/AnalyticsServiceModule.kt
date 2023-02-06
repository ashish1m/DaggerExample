package com.example.daggerexample

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